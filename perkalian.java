import java.util.Scanner;

public class perkalian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        int hasilPerkalian = angkaPertama * angkaKedua;

        if (hasilPerkalian >= 0) {
            if (hasilPerkalian < 10) {
                System.out.println("Single digit");
            } else if (hasilPerkalian < 100) {
                System.out.println("Double digit");
            } else {
                System.out.println("Tiga digit atau lebih");
            }
        } else {
            System.out.println("Angka negatif tidak diperiksa");
        }

        scanner.close();
    }
}
// Input angka1
// Input angka2

// Hasil = angka1 * angka2

// Jika Hasil < 0
//   Cetak "Angka negatif tidak diperiksa"
// Lainnya
//   Jika Hasil < 10
//     Cetak "Single digit"
//   Lainnya
//     Jika Hasil < 100
//       Cetak "Double digit"
//     Lainnya
//       Cetak "Tiga digit atau lebih"