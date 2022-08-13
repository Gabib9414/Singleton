package Practico3;

public class JuegoMesa extends Juego {
    private int ctdadJugadores;
    private float area;

    public JuegoMesa(String name, int ctdadJugadores, float area) {
        super(name);
        this.ctdadJugadores = ctdadJugadores;
        this.area = area;
    }

    public int getCtdadJugadores() {
        return ctdadJugadores;
    }

    public void setCtdadJugadores(int ctdadJugadores) {
        this.ctdadJugadores = ctdadJugadores;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Juego mesa={ ctdad jugadores=" + this.ctdadJugadores + " , area= " + this.area + ", nombre= "
                + super.getNombre() + " }";
    }
}
