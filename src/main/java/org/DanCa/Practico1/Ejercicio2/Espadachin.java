package org.DanCa.Practico1.Ejercicio2;

public class Espadachin extends Personaje{
    private Integer ataque;
    public Espadachin(Integer salud, Integer ataque){
        super(salud);
        this.ataque = ataque;
    }

    @Override
    public void entrenar() {
        ataque += 10;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }
}
