import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan 3 bilangan bulat
        System.out.print("Masukkan bilangan bulat a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan bulat b: ");
        int b = scanner.nextInt();
        
        System.out.print("Masukkan bilangan bulat c: ");
        int c = scanner.nextInt();
        
        // Menentukan bilangan terbesar
        int terbesar = a; // Asumsikan a adalah yang terbesar
        
        if (b > terbesar) {
            terbesar = b; // Jika b lebih besar, maka b adalah yang terbesar
        }
        
        if (c > terbesar) {
            terbesar = c; // Jika c lebih besar, maka c adalah yang terbesar
        }
        
        // Menampilkan bilangan terbesar
        System.out.println("Bilangan terbesar adalah: " + terbesar);
        
        // Menutup scanner
        scanner.close();
    }
}   