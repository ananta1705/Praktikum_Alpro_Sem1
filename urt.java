import java.util.Scanner;

public class urt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan bilangan b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan bilangan c: ");
        int c = scanner.nextInt();

        // Mengurutkan bilangan
        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }

        // Menampilkan hasil
        System.out.println("Bilangan terurut: " + a + ", " + b + ", " + c);
        
        // Menutup scanner
        scanner.close();
    }
}