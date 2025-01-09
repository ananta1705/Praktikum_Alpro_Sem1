import java.util.Scanner;

public class PengelolaanLimbah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk kategori pengelolaan limbah
        System.out.print("Masukkan kategori pengelolaan limbah (pencegahan, penggunaan kembali, daur ulang, pemulihan, pembuangan): ");
        String kategori = scanner.nextLine().toLowerCase();

        // Meminta input dari pengguna untuk jenis sampah
        System.out.print("Masukkan jenis sampah (plastik, kertas, organik, logam, lainnya): ");
        String jenisSampah = scanner.nextLine().toLowerCase();

        // Mengelola limbah berdasarkan kategori dan jenisnya
        if (kategori.equals("pencegahan")) {
            System.out.println("Pencegahan limbah dapat dilakukan dengan mengurangi konsumsi barang sekali pakai.");

        } else if (kategori.equals("penggunaan kembali")) {
            if (jenisSampah.equals("plastik")) {
                System.out.println("Botol plastik dapat digunakan kembali.");
            } else if (jenisSampah.equals("kertas")) {
                System.out.println("Kertas bekas dapat digunakan untuk catatan.");
            } else {

                System.out.println("Barang-barang lainnya juga dapat digunakan kembali jika memungkinkan.");
            }
        } else if (kategori.equals("daur ulang")) {
            if (jenisSampah.equals("plastik")) {
                
                System.out.println("Sampah plastik dapat didaur ulang menjadi barang baru.");
            } else if (jenisSampah.equals("kertas")) {
                System.out.println("Sampah kertas dapat didaur ulang menjadi kertas baru.");
            } else if (jenisSampah.equals("logam")) {
                System.out.println("Sampah logam dapat didaur ulang menjadi produk logam baru.");
            } else {
                System.out.println("Sampah lainnya mungkin tidak dapat didaur ulang.");
            }
        } else if (kategori.equals("pemulihan")) {
            System.out.println("Proses pemulihan energi dapat dilakukan dengan membakar sampah untuk menghasilkan listrik.");
        } else if (kategori.equals("pembuangan")) {
            System.out.println("Pembuangan limbah harus dilakukan dengan benar di tempat pembuangan akhir.");
        } else {
            System.out.println("Kategori tidak dikenal. Silakan masukkan kategori yang valid.");
        }

        // Menutup scanner
        scanner.close();
    }
}