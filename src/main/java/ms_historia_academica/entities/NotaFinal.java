package ms_historia_academica.entities;

public class NotaFinal {

  private String codigo;
  private String nombre;
  private int creditos;
  private String tipo;
  private String periodo;
  private float calificacion;

  public NotaFinal(String codigo, String nombre, int creditos, String tipo, String periodo, float calificacion) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.creditos = creditos;
    this.tipo = tipo;
    this.periodo = periodo;
    this.calificacion = calificacion;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getCreditos() {
    return creditos;
  }
  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public float getCalificacion() {
    return calificacion;
  }
  public void setCalificacion(float calificacion) {
    if (calificacion < 0 || calificacion > 5){
      calificacion = 0;
    }
    this.calificacion = calificacion;
  }
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
}
