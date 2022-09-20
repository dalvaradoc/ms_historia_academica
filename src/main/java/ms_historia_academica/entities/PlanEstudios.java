package ms_historia_academica.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;

public class PlanEstudios {
  private String estado;
  private List<NotaFinal> notas;
  @Indexed(unique=true)
  private String syllabus_id;
  private CupoCreditos creditos;

  public PlanEstudios(String estado, String syllabus_id) {
    this.estado = estado;
    this.syllabus_id = syllabus_id;
    this.notas = new ArrayList<>();
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public List<NotaFinal> getNotas() {
    return notas;
  }

  public void setNotas(List<NotaFinal> notas) {
    this.notas = notas;
  }

  public String getSyllabus_id() {
    return syllabus_id;
  }

  public void setSyllabus_id(String syllabus_id) {
    this.syllabus_id = syllabus_id;
  }

  public CupoCreditos getCreditos() {
    return creditos;
  }

  public void setCreditos(CupoCreditos creditos) {
    this.creditos = creditos;
  }   
}
