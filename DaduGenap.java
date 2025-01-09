import java.util.Scanner;

public class DaduGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan mata dadu
        System.out.print("Masukkan mata dadu d1: ");
        int d1 = scanner.nextInt();
        
        System.out.print("Masukkan mata dadu d2: ");
        int d2 = scanner.nextInt();
        
        System.out.print("Masukkan mata dadu d3: ");
        int d3 = scanner.nextInt();
        
        // Memeriksa apakah semua mata dadu genap
        boolean semuaGenap = (d1 % 2 == 0) && (d2 % 2 == 0) && (d3 % 2 == 0);
        
        // Menampilkan hasil
        System.out.println(semuaGenap);
        
        // Menutup scanner
        scanner.close();
    }
}