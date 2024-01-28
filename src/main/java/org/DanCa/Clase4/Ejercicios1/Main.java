package org.DanCa.Clase4.Ejercicios1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(10);
        Triangulo t = new Triangulo(4, 8, 3);
        Rectangulo r = new Rectangulo(9, 4, 4);


        List<Figura> listaFiguras = new ArrayList<>();
        listaFiguras.add(c);
        listaFiguras.add(t);
        listaFiguras.add(r);

        for(Figura figura : listaFiguras){
            System.out.println("Area: "+ figura.calculateArea());
            System.out.println("Perimetro: " + figura.calculatePerimeter());
        }

    }
}
