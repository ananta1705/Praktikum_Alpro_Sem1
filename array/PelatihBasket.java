package array;

import java.util.Scanner;

public class PelatihBasket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pemain (n): ");
        int n = input.nextInt();

        int totalPoinSemuaPemain = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Pemain ke-" + i + ":");
            System.out.print("Free Throw (FT): ");
            int ft = input.nextInt();
            System.out.print("Two Point (TW): ");
            int tw = input.nextInt();
            System.out.print("Three Point (TH): ");
            int th = input.nextInt();

            int totalPoin = ft + (tw * 2) + (th * 3);
            totalPoinSemuaPemain += totalPoin;

            System.out.println("Total poin pemain ke-" + i + ": " + totalPoin);
        }

        double rataRataPoin = (double) totalPoinSemuaPemain / n;
        System.out.printf("Rata-rata poin seluruh pemain: %.2f\n", rataRataPoin);

        input.close();
    }
}
