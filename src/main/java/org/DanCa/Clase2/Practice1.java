package org.DanCa.Clase2;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String name = sc.nextLine();

        System.out.println(count);
        System.out.println(name);

        float price = 1400.55f;
        // Otra forma es casteando: float price = (float) 1400.55;
        float price2 = (float) 1400.55;
        double priceDouble = 1670.89;
        byte b1 = (byte)127; // Desde -128 hasta 127.
        short b2 = (short) 32767; // Desde -32768 hasta 32767.
        float cientific = 32.5E4f; // Scientific number
        float cientific2 = 12.45e3f; // Scientific number

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Price: " + price);
        System.out.println("Price 2: " + price2);
        System.out.println("Price Double: " + priceDouble);
        System.out.println(cientific);
        System.out.println(cientific2);
    }
}
