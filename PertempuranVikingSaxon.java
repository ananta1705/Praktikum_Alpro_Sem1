import java.util.Scanner;

public class PertempuranVikingSaxon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah prajurit Viking: ");
        int jumlahViking = scanner.nextInt();
        
        System.out.print("Masukkan jumlah prajurit Saxon: ");
        int jumlahSaxon = scanner.nextInt();

        // Menghitung kekuatan masing-masing pasukan
        int kekuatanViking = jumlahViking * 4;
        int kekuatanSaxon = jumlahSaxon;

        // Menentukan pemenang
        String hasil;
        if (kekuatanViking > kekuatanSaxon) {
            hasil = "viking menang";
        } else if (kekuatanViking < kekuatanSaxon) {
            hasil = "saxon menang";
        } else {
            hasil = "imbang";
        }

        // Menampilkan hasil
        System.out.println(hasil);

        // Menutup scanner
        scanner.close();
    }
}