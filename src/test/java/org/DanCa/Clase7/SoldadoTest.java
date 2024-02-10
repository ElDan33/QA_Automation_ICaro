package org.DanCa.Clase7;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoldadoTest {
    private Soldado soldado;

    @BeforeTest
    public void setup(){
        soldado = new Soldado(100);
    }

    @Test
    public void saludDespuesDePelear(){
        //Soldado soldado = new Soldado(100);
        soldado.pelear(10);
        Assert.assertEquals(soldado.getSalud(), 95,"La salud no disminuyo adecuadamente.");
    }

    @Test
    public void soldadoMuerto(){
        //Soldado soldado = new Soldado(100);
        soldado.pelear(210);
        Assert.assertTrue(soldado.estaMuerto(), "El soldado no esta muerto.");
    }

    @Test
    public void soldadoDescansando(){
        //Soldado soldado = new Soldado(75);
        soldado.descansar();
        Assert.assertEquals(soldado.getSalud(), 105, "La salud no se ha reestablecido.");
    }
}
