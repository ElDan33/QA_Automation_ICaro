package org.DanCa.Clase2;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        String[] diasSemana = {
                "Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
                "Sabado",
                "Domingo"
        };
        for(int i=0; i<entrada;i++){
            System.out.println("Hoy es: " + diasSemana[i]);
        }

        while(entrada < 100){
            System.out.println(entrada + " es menor a 100.");
            entrada+=2;
        }
    }
}
