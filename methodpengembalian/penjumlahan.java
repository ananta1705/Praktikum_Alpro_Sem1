package methodpengembalian;

import java.util.Scanner;

public class penjumlahan {
    // Fungsi untuk menjumlahkan 4 bilangan bulat
    static int penjumlahan(int a, int b, int c, int d) {
        return a + b + c + d; // Mengembalikan hasil penjumlahan
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] bilangan = new int[4]; // Array untuk menyimpan 4 bilangan

        // Meminta pengguna untuk memasukkan 4 bilangan bulat
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan bilangan bulat ke-" + (i + 1) + ": ");
            bilangan[i] = inp.nextInt();
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan[0], bilangan[1], bilangan[2], bilangan[3]));
        inp.close(); // Menutup scanner
    }
}