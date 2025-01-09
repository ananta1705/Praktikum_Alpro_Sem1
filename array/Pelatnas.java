package array;
import java.util.Scanner;

public class Pelatnas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain yang ditinjau: ");
        int n = input.nextInt();
        input.nextLine(); // Konsumsi newline

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data pemain ke-" + (i + 1) + ":");
            System.out.print("Nama pemain: ");
            String nama = input.nextLine();
            System.out.print("Poin sesi 1: ");
            int set1 = input.nextInt();
            System.out.print("Poin sesi 2: ");
            int set2 = input.nextInt();
            System.out.print("Poin sesi 3: ");
            int set3 = input.nextInt();
            input.nextLine(); // Konsumsi newline

            int total = set1 + set2 + set3;
            double rataRata = total / 3.0;

            System.out.print("Pemain " + nama + ": ");
            if (rataRata < 40) {
                System.out.println("Harus mengikuti latihan ekstra selama 1 minggu.");
            } else if (rataRata < 50) {
                System.out.println("Harus mengikuti latihan ekstra selama 3 hari.");
            } else {
                System.out.println("Tidak perlu mengikuti pelatihan tambahan.");
            }
        }

        input.close();
    }
}
