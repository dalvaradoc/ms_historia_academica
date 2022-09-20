package ms_historia_academica.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.Query;

import ms_historia_academica.entities.HistoriaAcademica;

public interface HistoriaAcademicaRepository extends MongoRepository<HistoriaAcademica, String> {
  
  // @Query("student_id: '?0'")
  // HistoriaAcademica findByStudentId(String id);
}
