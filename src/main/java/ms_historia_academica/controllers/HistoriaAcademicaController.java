package ms_historia_academica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ms_historia_academica.entities.HistoriaAcademica;
import ms_historia_academica.entities.NotaFinal;
import ms_historia_academica.services.HistoriaAcademicaService;

@RestController
public class HistoriaAcademicaController {

  @Autowired
  HistoriaAcademicaService hService;
  
  @GetMapping("/historias")
  List<HistoriaAcademica> getHistorias(){
    return hService.getHistorias();
  }

  @GetMapping("/historias/{id}")
  HistoriaAcademica getByStudentId(@PathVariable String id){
    // return hService.getByStudentId(id);
    return hService.getByStudentId(id);
  }

  @PostMapping("/historias/{student_id}")
  HistoriaAcademica nuevaHistoria(@PathVariable String student_id, @RequestBody String syllabus_id) {
    return hService.nuevaHistoria(student_id, syllabus_id);
  }

  @DeleteMapping("/historias/{id}")
  boolean deleteHistoria(@PathVariable String id){
    return hService.deleteHistoria(id);
  }

  @PutMapping("/historias/{id}/{plan}")
  HistoriaAcademica nuevaNota(@PathVariable("id") String id, @PathVariable("plan") String plan, @RequestBody NotaFinal nota){
    return hService.nuevaNota(id, plan, nota);
  }
}
