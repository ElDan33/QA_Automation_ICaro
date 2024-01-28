package org.DanCa.Clase4.Ejercicios3;

public class Durmiendo {
    public void dormir(long secs){

        try{
            System.out.println("Yendo a dormir");
            Thread.sleep(secs * 1000);
        } catch(InterruptedException e){
            System.out.println("Ha ocurrido un error en el proceso.");
        }

        System.out.println("El proceso se levanto!!");
    }
}
