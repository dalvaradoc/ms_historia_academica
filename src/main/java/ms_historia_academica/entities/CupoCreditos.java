package ms_historia_academica.entities;

public class CupoCreditos {

  private int adicionales;
  private int cupo;
  private int disponibles;
  private int dobleTitulacion;
  
  public CupoCreditos(int adicionales, int cupo, int disponibles, int dobleTitulacion) {
    this.adicionales = adicionales;
    this.cupo = cupo;
    this.disponibles = disponibles;
    this.dobleTitulacion = dobleTitulacion;
  }

  public int getAdicionales() {
    return adicionales;
  }
  public void setAdicionales(int adicionales) {
    this.adicionales = adicionales;
  }
  public int getCupo() {
    return cupo;
  }
  public void setCupo(int cupo) {
    this.cupo = cupo;
  }
  public int getDisponibles() {
    return disponibles;
  }
  public void setDisponibles(int disponibles) {
    this.disponibles = disponibles;
  }
  public int getDobleTitulacion() {
    return dobleTitulacion;
  }
  public void setDobleTitulacion(int dobleTitulacion) {
    this.dobleTitulacion = dobleTitulacion;
  }  
}
