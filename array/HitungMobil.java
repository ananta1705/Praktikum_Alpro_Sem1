package array;

import java.util.Scanner;

public class HitungMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mobil yang lewat: ");
        int n = input.nextInt();
        input.nextLine(); // Konsumsi newline

        int merah = 0, hitam = 0, abu = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan warna mobil ke-" + (i + 1) + ": ");
            String warna = input.nextLine().toLowerCase();
            switch (warna) {
                case "merah":
                    merah++;
                    break;
                case "hitam":
                    hitam++;
                    break;
                case "abu":
                    abu++;
                    break;
                default:
                    System.out.println("Warna tidak valid, abaikan.");
            }
        }

        String hasil = "merah";
        int max = merah;
        if (hitam > max) {
            hasil = "hitam";
            max = hitam;
        }
        if (abu > max) {
            hasil = "abu";
        }

        System.out.println("Warna mobil yang paling banyak lewat: " + hasil);
        input.close();
    }
}
