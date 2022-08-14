package Practico3;

import java.util.LinkedList;

public class Casino {
    private static Casino instancia = new Casino();
    private String nombreCasino;
    private Persona responsable;
    private LinkedList<Juego> juegos = new LinkedList<Juego>();

    private Casino() {
    }

    public static Casino getInstancia() {
        return instancia;
    }

    public String getNombreCasino() {
        return nombreCasino;
    }

    public void setNombreCasino(String nombreCasino) {
        this.nombreCasino = nombreCasino;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public void setResponsable(Persona responsable) {
        this.responsable = responsable;
    }

    public LinkedList<Juego> getJuegos() {
      return juegos;
    }

    public void agregarJuego(Juego juegoNuevo) {

        int slots = 0;
        int mesas = 0;
        Boolean errorAlAgregar = true;

        // ** Iterar sobre la lista de juegos ya existente para corroborar la cantidad que hay de cada tipo 
        for (Juego jue : juegos) {

            if (jue instanceof Slot) {
                slots++;
            }

            if (jue instanceof JuegoMesa) {
                mesas++;

            }
        }

        // ** Chequear si hay espacio para agregar otro slot
        if (juegoNuevo instanceof Slot && slots < 8) {
            errorAlAgregar = false;
            juegos.add(juegoNuevo);
        }
        
        // ** Chequear si hay espacio para agregar otro juego de mesa
        if (juegoNuevo instanceof JuegoMesa && mesas < 2) {
            errorAlAgregar = false;
            juegos.add(juegoNuevo);
        }
        
        // ** Chequear si ocurrió algún error al agregar el juego
        if (errorAlAgregar) {
            System.out.println("Hubo un error al agregar el juego, posiblemente excedió el máximo de juegos de este tipo");
        }
    }

    @Override
    public String toString() {
        return "Casino{" +
                "nombreCasino='" + nombreCasino + '\'' +
                ", responsable=" + responsable +
                '}';

    }

}
