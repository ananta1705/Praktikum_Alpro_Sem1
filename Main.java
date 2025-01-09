import java.util.Scanner;

public class Main {
    // Fungsi untuk menghitung jumlah kendaraan yang dibutuhkan
    static int jumKendaraan(int p, int k) {
        // Menghitung jumlah kendaraan dengan pembulatan ke atas
        return (p + k - 1) / k; // Ini adalah cara untuk melakukan pembulatan ke atas
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int jumlahPenumpang, kapasitasKendaraan, jumlahKendaraan;

        // Membaca input jumlah penumpang dan kapasitas kendaraan
        System.out.print("Masukkan jumlah penumpang: ");
        jumlahPenumpang = inp.nextInt();
        
        System.out.print("Masukkan kapasitas kendaraan: ");
        kapasitasKendaraan = inp.nextInt();
        
        // Menghitung jumlah kendaraan yang dibutuhkan
        jumlahKendaraan = jumKendaraan(jumlahPenumpang, kapasitasKendaraan);
        
        // Menampilkan hasil
        System.out.println("Jumlah kendaraan yang dibutuhkan: " + jumlahKendaraan);
        
        inp.close(); // Menutup scanner
    }
}