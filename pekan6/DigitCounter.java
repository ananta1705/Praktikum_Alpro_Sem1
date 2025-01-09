package pekan6;

import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int input = scanner.nextInt();

        // Menampilkan digit-digit bilangan
        System.out.print("Keluaran: ");
        int sum = 0;
        int temp = input;
        while (temp > 0) {
            int digit = temp % 10;
            System.out.print(digit + " ");
            sum += digit;
            temp /= 10;
        }
        System.out.println();

        // Menampilkan total penjumlahan digit
        System.out.println("Total penjumlahan digit: " + sum);
    }
}