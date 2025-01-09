package pekan4;
import java.util.Scanner;


public class Kapital {

    public static void main(String[] args) {

        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk meminta input dari pengguna
        System.out.print("Masukkan sebuah karakter: ");

        // Membaca input dari pengguna sebagai karakter
        char karakter = scanner.next().charAt(0);

        // Memeriksa apakah karakter tersebut adalah huruf kapital
        boolean isKapital = Character.isUpperCase(karakter);

        // Menampilkan hasil pemeriksan
        System.out.println("Karakter tersebut adalah kapital: " + isKapital);
    }
}