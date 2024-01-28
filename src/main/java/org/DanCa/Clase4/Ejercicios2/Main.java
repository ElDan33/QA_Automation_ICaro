package org.DanCa.Clase4.Ejercicios2;

import org.DanCa.Clase4.Ejercicios1.Cuadrado;
import org.DanCa.Clase4.Ejercicios1.Rectangulo;
import org.DanCa.Clase4.Ejercicios1.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(10);
        Triangulo t = new Triangulo(4, 8, 3);
        Rectangulo r = new Rectangulo(9, 4, 4);


        List<Dibujable> listaDibujable = new ArrayList<>();
        listaDibujable.add(c);
        listaDibujable.add(t);
        // listaDibujable.add(r); Dará error porque rectángulo no implementa la interface "Dibujable".

        for(Dibujable dibu: listaDibujable){
            dibu.dibujar();
            dibu.borrar();
        }
    }
}
