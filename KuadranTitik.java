import java.util.Scanner;

public class KuadranTitik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nilai x dan y
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        
        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();
        
        // Menentukan kuadran
        int kuadran;
        if (x > 0 && y > 0) {
            kuadran = 1;
        } else if (x < 0 && y > 0) {
            kuadran = 2;
        } else if (x < 0 && y < 0) {
            kuadran = 3;
        } else if (x > 0 && y < 0) {
            kuadran = 4;
        } else {
            kuadran = 0; // Titik berada di sumbu x atau y
        }
        
        // Menampilkan hasil
        if (kuadran != 0) {
            System.out.println("Kuadran: " + kuadran);
        } else {
            System.out.println("Titik berada di sumbu x atau y.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}