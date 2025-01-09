package methodpengembalian;

import java.util.Scanner;

public class Pembagian {

    // Fungsi untuk menghitung hasil pembagian n dengan m tanpa operator pembagian
    static int pembagianLoop(int n, int m) {
        int hasil = 0;
        while (n >= m) {
            n -= m; // Kurangi n dengan m
            hasil++;  // Tambah hasil
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n dan m
        System.out.print("Masukkan n: ");
        int n = scanner.nextInt();
        System.out.print("Masukkan m: ");
        int m = scanner.nextInt();

        // Menampilkan hasil pembagian
        System.out.println("Hasil pembagian: " + pembagianLoop(n, m));
    }
}
