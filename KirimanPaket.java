import java.util.Scanner;

public class KirimanPaket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan panjang (cm): ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar (cm): ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi (cm): ");
        int tinggi = scanner.nextInt();
        System.out.print("Masukkan berat (gram): ");
        int berat = scanner.nextInt();

        // Menghitung volume dalam m3 dan berat dalam kg
        double volume = (panjang * lebar * tinggi) / 1000000.0; // volume dalam m3
        double beratKg = berat / 1000.0;                         // berat dalam kg

        // Menentukan apakah paket boleh dikirim
        boolean bolehDikirim = (volume <= 1) && (beratKg <= 30);

        // Menampilkan hasil
        System.out.println(bolehDikirim);

        // Menutup scanner
        scanner.close();
    }
}