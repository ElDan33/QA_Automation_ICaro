package org.DanCa.Practico1.Ejercicio2;

public class Mago extends Personaje{
    private String magia;
    public Mago(Integer salud,String magia){
        super(salud);
        this.magia = magia;
    }

    @Override
    public void entrenar() {
        System.out.println("Nada ha sucedido!");
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
