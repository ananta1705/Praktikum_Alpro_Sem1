package array;

import java.util.Scanner;

public class JumlahBilangan {

    public static void jumlahBilangan() {
        Scanner input = new Scanner(System.in);
        int total = 0, bil;

        System.out.println("Masukkan bilangan (akhiri dengan 0):");
        while ((bil = input.nextInt()) != 0) {
            total += bil;
        }

        System.out.println("Jumlah bilangan: " + total);
        input.close();
    }

    public static void main(String[] args) {
        jumlahBilangan();
    }
}
