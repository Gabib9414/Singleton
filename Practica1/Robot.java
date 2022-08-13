package Practica1;

public class Robot {

        private static Robot instancia = new Robot();
        private String nombre;
        private byte vida;

        private Robot(){

        }
        public static Robot getInstancia(){
                return instancia;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public byte getVida() {
                return vida;
        }

        public void setVida(byte vida) {
                this.vida = vida;
        }

        @Override
        public String toString() {
                return "El robot es: " + this.nombre + ", y tiene " + this.vida + " vidas.";
        }
}
