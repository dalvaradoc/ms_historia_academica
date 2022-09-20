package ms_historia_academica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ms_historia_academica.entities.Syllabus;
import ms_historia_academica.repositories.SyllabusRepository;

@RestController
public class SyllabusController {

  @Autowired
  SyllabusRepository sRepository;
  
  @GetMapping("/syllabus")
  List<Syllabus> getSyllabus(){
    return sRepository.findAll();
  }
}
