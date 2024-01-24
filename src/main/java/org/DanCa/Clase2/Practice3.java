package org.DanCa.Clase2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Operadores aritméticos
        int suma = num1 + num2;
        float producto = num1 * num2;
        float division = num1 / num2;
        float resto = num1 % num2;

        // Operadores relacionales
        boolean num1Menor = num1 < num2;
        boolean num1Mayor = num1 > num2;
        boolean igualdad = num1 == num2;
        boolean distintos = num1 != num2;

        // Operadores condicionales
        boolean disyuncion = (num1 > num2) && (num1 == num2);
        boolean conjuncion = (num1 > num2) || (num1 == num2);



        // IMPRESIONES POR CONSOLA
        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Division: " + division);
        System.out.println("Resto: " + resto);
        System.out.println("Num 1 es menor a Num 2: " + num1Menor);
        System.out.println("Num 1 es mayor a Num2: " + num1Mayor);
        System.out.println("Ambos numeros son iguales: " + igualdad);
        System.out.println("Ambos numeros son distintos: " + distintos);
        System.out.println("Disyuncion: " + disyuncion);
        System.out.println("Conjuncion: " + conjuncion);
    }
}
