package Practico3;

import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    Persona persona = new Persona("CI.5552754-8", "Franco", EnumEstadoPersona.ACTIVO);

    Casino casino1 = Casino.getInstancia();
    casino1.setNombreCasino("Nombre");

    casino1.setResponsable(persona);


    Casino casino2 = Casino.getInstancia();

    System.out.println(casino2);
    System.out.println(casino1);




  }
  Slot slot1= new Slot ("magia negra",Slot.tipojuego.BOTONES);
  Slot slot2= new Slot ("el cowboy",Slot.tipojuego.PAlANCA);

  JuegoMesa  mesa1 = new JuegoMesa("Mesa VulcanVegas", (float) 56, 36, 60, 32, 19);
  JuegoMesa  mesa2 = new JuegoMesa("Mesa sapotonto", (float) 26, 44, 33, 55, 28);


  LinkedList <Juego> juegos = new LinkedList<Juego>();

  public Slot getSlot1() {
    return slot1;
  }

  public Slot getSlot2() {
    return slot2;
  }

  public void setSlot2(Slot slot2) {
    this.slot2 = slot2;
  }

  public JuegoMesa getMesa1() {
    return mesa1;
  }

  public JuegoMesa getMesa2() {
    return mesa2;
  }

  public void setMesa2(JuegoMesa mesa2) {
    this.mesa2 = mesa2;
  }
}


