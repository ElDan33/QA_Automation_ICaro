package org.DanCa.Practico1.Ejercicio2;

public abstract class Personaje {
    private Integer salud;
    public Personaje(Integer salud){
        this.salud = salud;
    }
    abstract void entrenar();

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }
}
