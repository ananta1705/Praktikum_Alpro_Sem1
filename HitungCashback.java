import java.util.Scanner;

public class HitungCashback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = scanner.nextInt();
        
        System.out.print("Apakah Anda memiliki kartu member? (true/false): ");
        boolean memilikiKartuMember = scanner.nextBoolean();

        // Menghitung cashback
        double cashback = (totalBelanja >= 500000 && memilikiKartuMember) ? totalBelanja * 0.2 : 0;

        // Menampilkan hasil
        System.out.println("Besaran cashback: " + cashback);

        // Menutup scanner
        scanner.close();
    }
}