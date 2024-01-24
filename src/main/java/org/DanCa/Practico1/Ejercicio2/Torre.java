package org.DanCa.Practico1.Ejercicio2;

public class Torre extends Personaje{
    private Integer nivel;
    public Torre(Integer salud, Integer nivel){
        super(salud);
        this.nivel = nivel;
    }

    @Override
    public void entrenar() {
        nivel += 1;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
