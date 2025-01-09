package array;
import java.util.Scanner;

public class NamaBulan {
    public static void main(String[] args) {
        // Array untuk menyimpan nama-nama bulan
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input kode bulan
        System.out.print("Masukkan kode bulan (1-12): ");
        int kodeBulan = scanner.nextInt();

        // Validasi kode bulan
        if (kodeBulan >= 1 && kodeBulan <= 12) {
            System.out.println("Nama Bulan = " + namaBulan[kodeBulan - 1]);
        } else {
            System.out.println("Kode bulan tidak valid!");
        }

        scanner.close();
    }
}
