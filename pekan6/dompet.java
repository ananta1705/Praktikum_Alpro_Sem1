package pekan6;

import java.util.Scanner;

public class Dompet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi saldo awal
        int saldo = 0;

        // Input transaksi, hentikan jika input adalah 0
        System.out.println("Masukkan transaksi (0 untuk berhenti): ");
        int transaksi = scanner.nextInt();

        while (transaksi != 0) {
            // Tambah saldo jika transaksi positif
            if (transaksi > 0) {
                saldo += transaksi;
            } 
            // Kurangi saldo jika transaksi negatif
            else if (transaksi < 0) {
                saldo -= transaksi;
            }

            // Input transaksi selanjutnya
            System.out.println("Masukkan transaksi (0 untuk berhenti): ");
            transaksi = scanner.nextInt();
        }

        // Tampilkan saldo akhir
        System.out.println("Saldo akhir: " + saldo);

        scanner.close();
    }
}