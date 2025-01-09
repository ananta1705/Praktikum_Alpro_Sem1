import java.util.Scanner;

public class BarisanBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan 3 bilangan bulat
        System.out.print("Masukkan bilangan bulat u1: ");
        int u1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan bulat u2: ");
        int u2 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan bulat u3: ");
        int u3 = scanner.nextInt();
        
        // Menentukan jenis barisan
        if (u1 % 2 != 0 && u2 % 2 != 0 && u3 % 2 != 0) {
            System.out.println("ganjil");
        } else if (u1 % 2 == 0 && u2 % 2 == 0 && u3 % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("bukan ganjil atau genap");
        }
        
        // Menutup scanner
        scanner.close();
    }
}