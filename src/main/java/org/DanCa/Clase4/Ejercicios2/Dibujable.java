package org.DanCa.Clase4.Ejercicios2;

public interface Dibujable {

    // Los métodos de las interfaces son, por defecto, abstractos. Se deben heredar sí o sí por las clases hijas.
    void dibujar();

    // Los métodos "default" no obligan heredar el método a una clase hija.
    default void borrar(){
        System.out.println("Borrando figura");
    }
}
