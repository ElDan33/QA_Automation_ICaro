package org.DanCa.Practico1.Ejercicio1;

import java.util.Scanner;

public class Calculadora {
    // Constructor por defecto
    public Calculadora(){
    }

    // Método "calcular"
    public void calcular(){
        // Creacion del objeto "Scanner" para insertar datos por consola
        Scanner sc = new Scanner(System.in);

        // Declaracion e inicializacion de variable para almacenar el resultado de las operaciones
        Integer res = null;

        // Creacion de bucle para repetir la entrada de datos hasta 5 veces
        for(int i = 0; i < 5; i++){

            // Declaracion de variables que almacenaran los datos ingresados por consola
            Integer n1 = sc.nextInt();
            Integer n2 = sc.nextInt();
            String op = sc.next();

            // Declaracion "switch" para evaluar la operacion ingresada por consola y efectual
            // el calculo correspondiente.
            switch (op) {
                case "+" -> {
                    res = n1 + n2;
                    System.out.println(res);
                }
                case "-" -> {
                    res = n1 - n2;
                    System.out.println(res);
                }
                case "*" -> {
                    res = n1 * n2;
                    System.out.println(res);
                }
                case "/" -> {
                    res = n1 / n2;
                    System.out.println(res);
                }
                default -> System.out.println("Operacion no valida!");
            }

            // Evaluacion de el resultado en funcion de los limites de la calculadora
            if(res < 0){
                System.out.println("Tene cuidado! El resultado es negativo!");
            }else if(res > 0 && res < 10000){
                System.out.println("Resultado dentro de los limites!");
            }else{
                System.out.println("Error: resultado muy grande!!");
            }
        }

    }

}
