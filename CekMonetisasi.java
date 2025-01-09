import java.util.Scanner;

public class CekMonetisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = scanner.nextInt();
        
        System.out.print("Masukkan jam waktu tontonan dalam 12 bulan terakhir: ");
        int jamTontonan = scanner.nextInt();

        // Menentukan apakah dapat dimonetisasi
        String hasil = (jumlahPelanggan >= 1000 && jamTontonan >= 4000) ? "sudah dapat dimonetisasi" : "belum dapat dimonetisasi";

        // Menampilkan hasil
        System.out.println(hasil);

        // Menutup scanner
        scanner.close();
    }
}