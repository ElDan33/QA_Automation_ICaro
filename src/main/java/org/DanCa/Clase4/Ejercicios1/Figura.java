package org.DanCa.Clase4.Ejercicios1;

abstract public class Figura {
    protected Integer side;

    public Figura(Integer side){
        this.side = side;
    }
    abstract public Integer calculateArea();
    abstract public Integer calculatePerimeter();
}
