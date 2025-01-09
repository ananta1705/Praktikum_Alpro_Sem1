package pekan6;
import java.util.Scanner;

public class IsiTanki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kapasitas tanki
        System.out.println("Masukkan kapasitas tanki (T):");
        int T = scanner.nextInt();
        int totalAir = 0;

        System.out.println("Masukkan volume ember (masukkan bilangan negatif untuk berhenti):");
        while (totalAir < T) {
            int V = scanner.nextInt();
            if (V < 0) break; // Berhenti jika input negatif
            totalAir += V; // Tambah volume ember ke total air
            System.out.println(totalAir >= T); // Output apakah tanki penuh
        }

        // Penutup
        if (totalAir < T) {
            System.out.println("Pengisian berhenti sebelum tanki penuh.");
        } else {
            System.out.println("Tanki sudah penuh.");
        }
    }
}
