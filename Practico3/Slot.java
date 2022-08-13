package Practico3;

public class Slot extends Juego {
  public static Object EnumControles;
  public static Object tipojuego;
  private EnumControles controles;

  public Slot(String nombre, EnumControles controles) {
    super(nombre);
    this.controles = controles;
  }

  public EnumControles getControles() {
    return controles;
  }

  public void setControles(EnumControles controles) {
    this.controles = controles;
  }

  @Override
  public String toString() {
    return "Slot = { name= " + this.getNombre() + ", controles= " + this.getControles().name() + " }";
  }
}
