package org.DanCa.Clase4.Ejercicios3;

public class Main {
    public static void main(String[] args) {
        Durmiendo slp = new Durmiendo();

        slp.dormir(5);

        try{
            slp.dormir(-5);
        }catch(IllegalArgumentException e){
            System.out.println("Manejando error de argumento!");
        }
        System.out.println("Finalizando el programa...");
    }
}
