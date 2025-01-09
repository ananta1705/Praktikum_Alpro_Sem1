import java.util.Scanner;

public class CetakBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan nilai boolean (true/false): ");
        boolean nilai = scanner.nextBoolean();

        // Menampilkan hasil
        System.out.println("Nilai boolean yang dimasukkan: " + nilai);

        // Menutup scanner
        scanner.close();
    }
}