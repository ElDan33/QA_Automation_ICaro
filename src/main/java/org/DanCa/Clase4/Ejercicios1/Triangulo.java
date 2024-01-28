package org.DanCa.Clase4.Ejercicios1;

import org.DanCa.Clase4.Ejercicios2.Dibujable;

public class Triangulo extends Figura implements Dibujable {
    private Integer base;
    private Integer height;

    public Triangulo(Integer base, Integer height, Integer side){
        super(side);
        this.base = base;
        this.height = height;
    }

    @Override
    public Integer calculateArea(){
        return (base*height)/2;
    }

    @Override
    public Integer calculatePerimeter(){
        return side*3;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando mi triangulo!");
    }
}
