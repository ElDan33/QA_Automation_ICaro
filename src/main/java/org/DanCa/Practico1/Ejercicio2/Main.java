package org.DanCa.Practico1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Instanciacion de objeto espadachin, verificacion de ataque antes y despues de entrenar.
        Espadachin e1 = new Espadachin(10,8);
        System.out.println(e1.getAtaque());
        e1.entrenar();
        System.out.println(e1.getAtaque());

        // Instanciacion de objeto torre, verificacion de nivel antes y despues de entrenar.
        Torre t1 = new Torre(40, 1);
        System.out.println(t1.getNivel());
        t1.entrenar();
        System.out.println(t1.getNivel());

        // Instanciacion de objeto mago, verificacion de magia y efecto de entrenar.
        Mago m1 = new Mago(8, "Thunderbolt");
        System.out.println(m1.getMagia());
        m1.entrenar();
    }
}
