package Practico3;

public class Persona {

  String cedula;
  String nombre;
  EnumEstadoPersona estado;

  public Persona(
      String cedula,
      String nombre,
      EnumEstadoPersona estado) {

    this.cedula = cedula;
    this.nombre = nombre;
    this.estado = estado;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public EnumEstadoPersona getEstado() {
    return estado;
  }

  public void setEstado(EnumEstadoPersona estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    return "Persona {" +
        "cedula='" + cedula + '\'' +
        ", nombre='" + nombre + '\'' +
        ", estado=" + estado +
        '}';
  }
}
