package org.DanCa.Clase2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        String[] namesArr = {"James","Sophia","Rachel"};

        int[] arr2 = {
                1,2,3,4,5
        };

        // Declaramos e instanciamos una lista
        List<String> stringList = new ArrayList<>();
        stringList.add("Perro");
        stringList.add("Gato");
        stringList.add("Loro");
        stringList.add("Conejo");


        // IMPRESIONES POR CONSOLA
        System.out.println("Array de nombres: "+ Arrays.toString(namesArr));
        System.out.println(namesArr[1]);
        System.out.println("Array: " + Arrays.toString(arr2));
        System.out.println(arr2[3]);
        System.out.println("La lista contiene: " + stringList);
        System.out.println("Posicion 2: " + stringList.get(2));
        //System.out.println("Posicion 4: " + stringList.get(4)); // Generará error!!
    }
}
