package pekan6;

import java.util.Scanner;

public class HitungCangkirKopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Masukkan n (gula), m (kopi), x (gula per cangkir), y (kopi per cangkir):");
        int n = scanner.nextInt(); // Jumlah gula
        int m = scanner.nextInt(); // Jumlah kopi
        int x = scanner.nextInt(); // Gula per cangkir
        int y = scanner.nextInt(); // Kopi per cangkir

        int jumlahCangkir = 0;

        // Perulangan untuk menghitung jumlah cangkir kopi
        while (n >= x && m >= y) {
            n -= x; // Kurangi gula
            m -= y; // Kurangi kopi
            jumlahCangkir++; // Tambah jumlah cangkir
        }

        // Output
        System.out.println("Banyaknya cangkir kopi yang bisa dibuat: " + jumlahCangkir);
    }
}
cangkir kopi