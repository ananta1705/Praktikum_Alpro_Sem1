import java.util.Scanner;

public class LuasPersegi {

    // Fungsi untuk menghitung luas persegi
    public static int hitungLuas(int sisi) {
        return sisi * sisi; // Rumus luas persegi
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi persegi:");
        try {
            // Membaca input sisi persegi
            int sisi = scanner.nextInt();

            if (sisi > 0) {
                // Menghitung dan menampilkan luas persegi
                int luas = hitungLuas(sisi);
                System.out.println("Luas persegi: " + luas);
            } else {
                System.out.println("Panjang sisi harus bilangan positif.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
        } finally {
            // Menutup scanner
            scanner.close();
        }
    }
}
