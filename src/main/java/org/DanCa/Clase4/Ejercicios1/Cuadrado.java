package org.DanCa.Clase4.Ejercicios1;

import org.DanCa.Clase4.Ejercicios2.Dibujable;

public class Cuadrado extends Figura implements Dibujable {

    public Cuadrado(Integer side){
        super(side);
    }

    @Override
    public Integer calculateArea(){
        return side*side;
    }

    @Override
    public Integer calculatePerimeter(){
        return side*4;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando mi cuadrado!");
    }
}
