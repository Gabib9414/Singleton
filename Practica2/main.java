package Practica2;

public class main {
  public static void main(String[] args) {
    Persona persona = new Persona("5552754-8", "Persona", EnumEstado.ACTIVO);

    Casino casino = Casino.getInstancia();
    casino.setNombreCasino("Nombre");
    casino.setResponsable(persona);

    System.out.println(casino);
  }  
}
