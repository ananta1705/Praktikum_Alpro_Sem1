import java.util.Scanner;

public class HitungY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan nilai x: ");
        double x = scanner.nextDouble();

        // Menghitung nilai y
        double y = Math.pow((x * x + x), 2);

        // Menampilkan hasil
        System.out.println("Nilai y: " + y);

        // Menutup scanner
        scanner.close();
    }
}