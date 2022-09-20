package ms_historia_academica.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("HistoriaAcademica")
public class HistoriaAcademica {
  @Id
  // private String id;
  private String student_id;
  private List<PlanEstudios> planes;

  public HistoriaAcademica(String student_id) {
    this.student_id = student_id;
    planes = new ArrayList<>();
  }

  public HistoriaAcademica() {
  }
  
  // public String getId() {
  //   return id;
  // }
  // public void setId(String id) {
  //   this.id = id;
  // }
  public List<PlanEstudios> getPlanes() {
    return planes;
  }
  public void setPlanes(List<PlanEstudios> planes) {
    this.planes = planes;
  }
  public String getStudent_id() {
    return student_id;
  }
  public void setStudent_id(String student_id) {
    this.student_id = student_id;
  }
}
