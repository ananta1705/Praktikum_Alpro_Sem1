package pekan6;

import java.util.Scanner;

public class KonsekutifCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat positif:");
        String x = scanner.next(); // Membaca input sebagai string
        boolean konsekutif = true;

        for (int i = 1; i < x.length(); i++) {
            if (Math.abs(x.charAt(i) - x.charAt(i - 1)) != 1) {
                konsekutif = false;
                break;
            }
        }

        System.out.println("Konsekutif: " + konsekutif);
    }
}
