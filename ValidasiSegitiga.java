import java.util.Scanner;

public class ValidasiSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan sisi a: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan sisi b: ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan sisi c: ");
        double c = scanner.nextDouble();

        // Memeriksa validitas sisi-sisi segitiga
        boolean valid = isValidTriangle(a, b, c);

        // Menampilkan hasil
        System.out.println("Validitas segitiga: " + valid);
        
        // Menutup scanner
        scanner.close();
    }

    // Metode untuk memeriksa validitas segitiga
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}