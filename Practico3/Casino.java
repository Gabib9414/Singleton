package Practico3;

import java.util.LinkedList;

public class Casino {
    private static Casino instancia = new Casino();
    private String nombreCasino;
    private Persona responsable;
private Casino (){

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

    @Override
    public String toString() {
        return "Casino{" +
                "nombreCasino='" + nombreCasino + '\'' +
                ", responsable=" + responsable +
                '}';



    }
    public void setJuego (LinkedList<Juego> juegos){
        this.juegos = juegos;


    }

    public boolean maximo(LinkedList<Juego> juegoprincipal){

    int  slots =0;
    int   mesas = 0;


    for (Juego jue : juegoprincipal){

        if (jue instanceof Slot){
            slots++;
        }
        else if (jue instanceof JuegoMesa) {
            mesas++;

        }

    }
    return (slots <= 8 && mesas <= 2 );
    }
}
