package ms_historia_academica.repositories;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ms_historia_academica.entities.CupoCreditos;
import ms_historia_academica.entities.HistoriaAcademica;
import ms_historia_academica.entities.NotaFinal;
import ms_historia_academica.entities.PlanEstudios;
import ms_historia_academica.entities.Syllabus;

@Configuration
@EnableMongoRepositories
public class LoadDB {

  @Bean
  CommandLineRunner initSyllabus (SyllabusRepository sRepository) {
    sRepository.save(new Syllabus("2879","Ingeniería de Sistemas y Computación", "Ingeniería", 15, 36, 54, 21, 33, 6, 12));
    return null;
  }

  @Bean
  CommandLineRunner initHistoriaAcademica (HistoriaAcademicaRepository hRepository) {
    HistoriaAcademica historia1 = new HistoriaAcademica("estudiante1");
    HistoriaAcademica historia2 = new HistoriaAcademica("estudiante2");
    
    PlanEstudios plan1 = new PlanEstudios("ABIERTO", "2879");
    plan1.getNotas().add(new NotaFinal("2016702", "Ingeniería de software II", 3, "DISCIPLINAR OBLIGATORIA", "2021-1S Ordinaria", 4.5f));
    plan1.getNotas().add(new NotaFinal("2016696", "Algoritmos ", 3, "FUND. OBLIGATORIA", "2020-2S Ordinaria", 3.5f));
    plan1.getNotas().add(new NotaFinal("1000006-B", "Cálculo en varias variables ", 4, "FUND. OPTATIVA", "2019-2S Ordinaria	", 3.3f));
    plan1.getNotas().add(new NotaFinal("1000006-B", "Cálculo en varias variables ", 4, "FUND. OPTATIVA", "2019-1S Ordinaria	", 2.9f));

    CupoCreditos creditos1 = new CupoCreditos(10, 100, 140, 64);
    plan1.setCreditos(creditos1);

    historia1.getPlanes().add(plan1);

    PlanEstudios plan2 = new PlanEstudios("ABIERTO", "2879");
    plan2.getNotas().add(new NotaFinal("1000004-B", "Cálculo diferencial", 4, "FUND. OPTATIVA", "2018-1S Ordinaria", 4.8f));
    plan2.getNotas().add(new NotaFinal("2015734", "Programación de computadores ", 3, "DISCIPLINAR OPTATIVA", "2018-1S Ordinaria	", 4.9f));
    plan2.getNotas().add(new NotaFinal("2025975", "Introducción a la ingeniería de sistemas y computación ", 3, "DISCIPLINAR OBLIGATORIA", "2018-1S Ordinaria	", 5.0f));

    CupoCreditos creditos2 = new CupoCreditos(10, 100, 155, 64);
    plan2.setCreditos(creditos2);

    historia2.getPlanes().add(plan2);

    hRepository.save(historia1);
    hRepository.save(historia2);
    return null;
  }
}
