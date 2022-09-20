package ms_historia_academica.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import ms_historia_academica.entities.Syllabus;
import ms_historia_academica.repositories.SyllabusRepository;

@EnableMongoRepositories
public class SyllabusService {
  
  @Autowired
  SyllabusRepository sRepository;

  public Syllabus getSyllabusByID(String id){
    Optional<Syllabus> syllabus =  sRepository.findById(id);
    if (syllabus.isEmpty()){
      System.out.println("The syllabus is empty");
      return null;
    }
    return syllabus.get();
  }
}
