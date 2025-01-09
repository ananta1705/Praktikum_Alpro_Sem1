import java.util.Scanner;

public class JalanBojongsoang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan curah hujan (tinggi/rendah): ");
        String curahHujan = scanner.nextLine().toLowerCase();

        // Menentukan kondisi macet atau tidak
        String kondisi = "tidak macet"; // Default kondisi
        if (curahHujan.equals("tinggi")) {
            kondisi = "macet"; // Jalan Bojongsoang akan macet
        }

        // Menampilkan hasil
        System.out.println("Kondisi Jalan Bojongsoang: " + kondisi);
        
        // Menutup scanner
        scanner.close();
    }
}