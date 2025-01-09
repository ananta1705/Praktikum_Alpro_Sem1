package methodpengembalian;

import java.util.Scanner;

public class Jumlahkeliapatan {
    static int jumlahKelipatan(int m, int n, int x) {
        int jumlah = 0;
        for (int i = m; i <= n; i++) {
            if (i % x == 0) jumlah += i;
        }
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan m, n, x: ");
        int m = scanner.nextInt(), n = scanner.nextInt(), x = scanner.nextInt();
        System.out.println("Jumlah kelipatan: " + jumlahKelipatan(m, n, x));
        scanner.close();
    }
}
