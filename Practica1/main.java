package Practica1;

public class main {
        public static void main(String[] args) {
        Robot r1 = Robot.getInstancia();
        r1.setNombre("Uruguay");
        r1.setVida((byte)5);
        System.out.println(r1);

        Robot r2 = Robot.getInstancia();
        System.out.println(r2);
        r2.setVida((byte)10);
        r2.setNombre("Jose");
        System.out.println("-----");
        System.out.println(r1);
        System.out.println(r2);
    }
}