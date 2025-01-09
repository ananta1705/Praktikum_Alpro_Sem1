package pekan4;
import java.util.Scanner;


public class Soal2 {

    public static void main(String[] args) {
        // Membuat Scanner untuk menerima input dari user
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        // Menghitung hasil perkalian
        int hasilPerkalian = angkaPertama * angkaKedua;

        // Memeriksa hasil perkalian dan mencetak pesan yang sesuai
        if (hasilPerkalian >= 0) { // Cek apakah hasilnya positif
            if (hasilPerkalian >= -9 && hasilPerkalian <= 9) { // Cek apakah hasilnya single digit
                System.out.println(angkaPertama + " * " + angkaKedua + ": Angka satu digit.");
            } else if (hasilPerkalian >= -99 && hasilPerkalian <= 99) { // Cek apakah hasilnya double digit
                System.out.println(angkaPertama + " * " + angkaKedua + ": Terdiri dari dua digit.");
            } else { // Hasilnya 3 digit atau lebih
                System.out.println(angkaPertama + " * " + angkaKedua + ": Tiga digit atau lebih.");
            }
        } else { // Hasilnya negatif
            System.out.println(angkaPertama + " * " + angkaKedua + ": Angka negatif tidak diperiksa.");
        }
    }
}