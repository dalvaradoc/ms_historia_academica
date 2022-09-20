package ms_historia_academica.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("syllabus")
public class Syllabus {
  
  @Id
  private String id;
  private String name;
  private String faculty;
  private int credFundObl;
  private int credFundOpt;
  private int credDiscObl;
  private int credDiscOpt;
  private int credLibreElec;
  private int credTrabGrado;
  private int credNivelacion;

  public Syllabus() {
  }

  public Syllabus(String id, String name, String faculty, int credFundObl, int credFundOpt, int credDiscObl,
      int credDiscOpt, int credLibreElec, int credTrabGrado, int credNivelacion) {
    this.id = id;
    this.name = name;
    this.faculty = faculty;
    this.credFundObl = credFundObl;
    this.credFundOpt = credFundOpt;
    this.credDiscObl = credDiscObl;
    this.credDiscOpt = credDiscOpt;
    this.credLibreElec = credLibreElec;
    this.credTrabGrado = credTrabGrado;
    this.credNivelacion = credNivelacion;
  }

  public Syllabus(String name, String faculty, int credFundObl, int credFundOpt,
      int credDiscObl, int credDiscOpt, int credLibreElec, int credTrabGrado, int credNivelacion) {
    this.name = name;
    this.faculty = faculty;
    this.credFundObl = credFundObl;
    this.credFundOpt = credFundOpt;
    this.credDiscObl = credDiscObl;
    this.credDiscOpt = credDiscOpt;
    this.credLibreElec = credLibreElec;
    this.credTrabGrado = credTrabGrado;
    this.credNivelacion = credNivelacion;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFaculty() {
    return faculty;
  }
  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }
  public int getCredFundObl() {
    return credFundObl;
  }
  public void setCredFundObl(int credFundObl) {
    this.credFundObl = credFundObl;
  }
  public int getCredFundOpt() {
    return credFundOpt;
  }
  public void setCredFundOpt(int credFundOpt) {
    this.credFundOpt = credFundOpt;
  }
  public int getCredDiscObl() {
    return credDiscObl;
  }
  public void setCredDiscObl(int credDiscObl) {
    this.credDiscObl = credDiscObl;
  }
  public int getCredDiscOpt() {
    return credDiscOpt;
  }
  public void setCredDiscOpt(int credDiscOpt) {
    this.credDiscOpt = credDiscOpt;
  }
  public int getCredLibreElec() {
    return credLibreElec;
  }
  public void setCredLibreElec(int credLibreElec) {
    this.credLibreElec = credLibreElec;
  }
  public int getCredNivelacion() {
    return credNivelacion;
  }
  public void setCredNivelacion(int credNivelacion) {
    this.credNivelacion = credNivelacion;
  }
  public int getCredTrabGrado() {
    return credTrabGrado;
  }
  public void setCredTrabGrado(int credTrabGrado) {
    this.credTrabGrado = credTrabGrado;
  }

  public int totalCreditos(){
    return credDiscObl + credDiscOpt + credFundObl + credFundOpt + credLibreElec + credNivelacion + credTrabGrado;
  }
  
}
