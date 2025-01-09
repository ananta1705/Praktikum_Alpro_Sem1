

import java.util.Scanner;

public class Genapsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Masukkan bilangan bulat positif (pisahkan dengan spasi), akhiri dengan bilangan ganjil:");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num % 2 != 0) break; // Jika bilangan ganjil, keluar dari loop
            sum += num; // Tambahkan bilangan genap ke total
        }
        System.out.println("Total penjumlahan bilangan genap: " + sum);
    }
}
