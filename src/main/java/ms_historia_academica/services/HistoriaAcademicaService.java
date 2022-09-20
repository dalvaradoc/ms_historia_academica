package ms_historia_academica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ms_historia_academica.entities.CupoCreditos;
import ms_historia_academica.entities.HistoriaAcademica;
import ms_historia_academica.entities.NotaFinal;
import ms_historia_academica.entities.PlanEstudios;
import ms_historia_academica.entities.Syllabus;
import ms_historia_academica.repositories.HistoriaAcademicaRepository;
import ms_historia_academica.repositories.SyllabusRepository;

@EnableMongoRepositories
@Configuration
public class HistoriaAcademicaService {
  
  @Autowired
  HistoriaAcademicaRepository hRepository;
  @Autowired
  SyllabusRepository sRepository;

  public List<HistoriaAcademica> getHistorias(){
    return hRepository.findAll();
  }

  // public HistoriaAcademica getByStudentId(String id){
  //   return hRepository.findByStudentId(id);
  // }

  public HistoriaAcademica getByStudentId(String id){
    return hRepository.findById(id).get();
  }

  public HistoriaAcademica nuevaHistoria(String student_id, String syllabus_id){
    HistoriaAcademica historia = new HistoriaAcademica(student_id);
    PlanEstudios plan = new PlanEstudios("ABIERTO", syllabus_id);
    Syllabus syllabus = sRepository.findById(syllabus_id).get();
    if (syllabus.equals(null)){
      return null;
    }
    CupoCreditos creditos = new CupoCreditos(0, 0, syllabus.totalCreditos(), 64);
    plan.setCreditos(creditos);
    historia.getPlanes().add(plan);
    return hRepository.save(historia);
  }

  public boolean deleteHistoria(String id){
    hRepository.deleteById(id);
    System.out.println(id);
    return true;
  }
  
  public HistoriaAcademica nuevaNota(String id, String plan, NotaFinal nota){
    // HistoriaAcademica historia = hRepository.findByStudentId(id);
    HistoriaAcademica historia = hRepository.findById(id).get();
    if (historia.equals(null)){
      return null;
    }
    List<PlanEstudios> planes = historia.getPlanes();
    for (PlanEstudios p : planes){
      if (p.getSyllabus_id().equals(plan)){
        for (NotaFinal n : p.getNotas()){
          if (n.getCodigo().equals(nota.getCodigo()) && n.getCalificacion() > 3){
            System.out.println("La materia ya tiene nota");
            return historia;
          }
          if (n.getCodigo().equals(nota.getCodigo()) && n.getPeriodo().equals(nota.getPeriodo())){
            System.out.println("No se puede ver la misma materia el mismo periodo");
            return historia;
          }
        }
        p.getNotas().add(nota);
        p.getCreditos().setDisponibles(p.getCreditos().getDisponibles()-nota.getCreditos());
        if (nota.getCalificacion() >= 3.0f){
          p.getCreditos().setAdicionales(p.getCreditos().getAdicionales()+nota.getCreditos());
        }
      }
    }
    historia.setPlanes(planes);
    return hRepository.save(historia);
  }
}
