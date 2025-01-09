package array;

import java.util.Scanner;

public class BasketStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pemain: ");
        int n = input.nextInt();
        input.nextLine(); // Konsumsi newline

        int totalP = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data pemain ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nm = input.nextLine();
            System.out.print("Free Throw (FT): ");
            int FT = input.nextInt();
            System.out.print("Two Point (TW): ");
            int TW = input.nextInt();
            System.out.print("Three Point (TH): ");
            int TH = input.nextInt();
            input.nextLine(); // Konsumsi newline

            int total = FT + (TW * 2) + (TH * 3);
            totalP += total;

            System.out.println("Poin total pemain " + nm + ": " + total);
        }

        double rata2 = (double) totalP / n;
        System.out.printf("Rata-rata poin seluruh pemain: %.2f%n", rata2);

        input.close();
    }
}
