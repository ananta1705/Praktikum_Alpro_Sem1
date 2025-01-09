package methodpengembalian;
import java.util.Scanner;

public class luas {

    // Fungsi untuk menghitung luas permukaan bola
    public static double luasPermukaanBola(double jariJari) {
        final double pi = 3.14; // nilai pi
        return 4 * pi * Math.pow(jariJari, 2); // rumus luas permukaan bola
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menerima input dari pengguna
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = scanner.nextDouble();
        
        // Menghitung luas permukaan bola
        double luas = luasPermukaanBola(jariJari);
        
        // Menampilkan hasil
        System.out.printf("Luas permukaan bola dengan jari-jari %.2f adalah %.2f%n", jariJari, luas);
        
        scanner.close();
    }
}