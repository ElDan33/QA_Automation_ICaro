package org.DanCa.Clase7;

public class Soldado {
    private Integer salud;

    public Soldado(Integer salud){
        this.salud = salud;
    }

    public void pelear(Integer ataque){
        salud -=ataque/2;
    }

    public void descansar(){
        salud+=10;
    }

    public boolean estaMuerto(){
        return salud <=0;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }
}
