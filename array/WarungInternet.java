package array;

import java.util.Scanner;

public class WarungInternet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Harga per jam untuk masing-masing ruangan
        int hargaGaming = 14000;
        int hargaBiasa = 10000;

        // Masukkan jumlah customer
        System.out.print("Masukkan jumlah customer: ");
        int n = input.nextInt();
        input.nextLine();  // Konsumsi newline

        int totalBiaya = 0;

        // Proses untuk setiap customer
        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Lama jam bermain: ");
            int jam = input.nextInt();
            System.out.print("Ruangan (gaming/biasa): ");
            String ruangan = input.next();
            input.nextLine();  // Konsumsi newline

            int biaya = 0;
            if (ruangan.equalsIgnoreCase("gaming")) {
                biaya = hargaGaming * jam;
            } else if (ruangan.equalsIgnoreCase("biasa")) {
                biaya = hargaBiasa * jam;
            }

            System.out.println("Biaya untuk " + nama + ": " + biaya);
            totalBiaya += biaya;
        }

        System.out.println("\nTotal biaya keseluruhan: " + totalBiaya);

        input.close();
    }
}
