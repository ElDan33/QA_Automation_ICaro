package org.DanCa.Clase4.Ejercicios1;

import org.DanCa.Clase4.Ejercicios2.Dibujable;

public class Rectangulo extends Figura {
    private Integer width;
    private Integer height;

    public Rectangulo(Integer width, Integer height, Integer side){
        super(side);
        this.width = width;
        this.height = height;
    }

    @Override
    public Integer calculateArea() {
        return width*height;
    }

    @Override
    public Integer calculatePerimeter(){
        return (width*2)+(height*2);
    }

}
