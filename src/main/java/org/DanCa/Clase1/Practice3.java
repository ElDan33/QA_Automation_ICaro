package org.DanCa.Clase1;

public class Practice3 {
    public static void main(String[] args) {
        // Imprimimos en consola el número y nombre de los días de la seamana
        String[]days = {
                "Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
                "Sabado",
                "Domingo"
        };
        for(int i=0; i<7; i++){
            System.out.println("Dia "+ (i+1) + " - " + days[i]);
        }
    }
}
