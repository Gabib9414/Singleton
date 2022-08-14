package Practico3;

public class Main {
  public static void main(String[] args) {
    Persona persona = new Persona("CI.5552754-8", "Franco", EnumEstadoPersona.ACTIVO);

    Casino casino1 = Casino.getInstancia();
    casino1.setNombreCasino("Nombre");

    casino1.setResponsable(persona);

    Casino casino2 = Casino.getInstancia();

    System.out.println(casino2);
    System.out.println(casino1);

    Slot slot1 = new Slot(
        "magia negra",
        EnumControles.BOTONES);
    casino1.agregarJuego(slot1);

    Slot slot2 = new Slot(
        "el cowboy",
        EnumControles.PALANCA);
    casino2.agregarJuego(slot2);

    Slot slot3 = new Slot(
        "el cowboy",
        EnumControles.PALANCA);
    casino2.agregarJuego(slot3);

    JuegoMesa mesa1 = new JuegoMesa(
        "Mesa VulcanVegas",
        6,
        12,
        (float) 36);
    casino2.agregarJuego(mesa1);

    JuegoMesa mesa2 = new JuegoMesa(
      "Mesa sapotonto",
      3, 21,
      (float) 26);
      casino2.agregarJuego(mesa2);
  }

}
