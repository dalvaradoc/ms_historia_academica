package ms_historia_academica.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import ms_historia_academica.entities.Syllabus;

public interface SyllabusRepository extends MongoRepository<Syllabus, String>{

} 
