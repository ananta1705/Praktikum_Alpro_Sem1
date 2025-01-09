package pekan4;
import java.util.Scanner;

public class HitungCycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai E0, c, dan E1
        System.out.print("Masukkan nilai E0: ");
        int E0 = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan nilai E1: ");
        int E1 = scanner.nextInt();

        // Inisialisasi cc
        int cc = 0;

        // Hitung cycle
        while (E0 > E1) {
            E0 -= c;
            cc++;
        }

        // Output
        System.out.println("Jumlah cycle: " + cc);
    }
}

