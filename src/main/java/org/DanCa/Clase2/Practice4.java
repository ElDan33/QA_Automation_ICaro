package org.DanCa.Clase2;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println("Num 1 es menor a Num 2");
        } else if(num1 > num2){
            System.out.println("Num 1 es mayor a Num2");
        } else {
            System.out.println("Num 1 y Num 2 son iguales");
        }

        String[] diasSemana = {
                "Lunes",
                "Martes",
                "Miercoles",
                "Jueves",
                "Viernes",
                "Sabado",
                "Domingo"
        };
        int entrada = sc.nextInt();

        switch (diasSemana[entrada]) {
            case "Lunes":
                System.out.println("Hoy es Lunes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("El numero ingresado no coincide con un día de la semana.");
        }
    }
}
