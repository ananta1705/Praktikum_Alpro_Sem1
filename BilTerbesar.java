import java.util.Scanner;

public class BilTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan b: ");
        int b = scanner.nextInt();
        
        System.out.print("Masukkan bilangan c: ");
        int c = scanner.nextInt();

        // Mencari bilangan terbesar
        int terbesar = Math.max(a, Math.max(b, c));

        // Menampilkan hasil
        System.out.println("Bilangan terbesar: " + terbesar);

        // Menutup scanner
        scanner.close();
    }
}