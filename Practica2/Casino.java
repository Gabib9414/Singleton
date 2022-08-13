package Practica2;

public class Casino {
    private static Casino instancia = new Casino();
    private String nombreCasino;
    private Persona responsable;

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
}
