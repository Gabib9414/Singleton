package Practico3;

public class JuegoMesa extends Juego {
    private int ctdadMaximaJugadores;
    private int ctdadMinimaJugadores;
    private float area;

    public JuegoMesa(String name, int ctdadMinimaJugadores, int ctdadMaximaJugadores, float area) {
        super(name);
        this.ctdadMaximaJugadores = ctdadMaximaJugadores;
        this.ctdadMinimaJugadores = ctdadMinimaJugadores;
        this.area = area;
    }

    public int getCtdadMaximaJugadores() {
        return ctdadMaximaJugadores;
    }

    public void setCtdadMaximaJugadores(int ctdadMaximaJugadores) {
        this.ctdadMaximaJugadores = ctdadMaximaJugadores;
    }

    public int getCtdadMinimaJugadores() {
        return ctdadMinimaJugadores;
    }

    public void setCtdadMinimaJugadores(int ctdadMinimaJugadores) {
        this.ctdadMinimaJugadores = ctdadMinimaJugadores;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Juego mesa={ ctdad maxima jugadores=" + this.ctdadMaximaJugadores +
                ", cantidad minima jugadores=" + this.ctdadMinimaJugadores + " , area= " + this.area + ", nombre= "
                + super.getNombre() + " }";
    }
}
