import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan tahun
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        
        // Menentukan apakah tahun kabisat
        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
        
        // Menampilkan hasil
        System.out.println(kabisat);
        
        // Menutup scanner
        scanner.close();
    }
}