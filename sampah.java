import java.util.Scanner;

public class sampah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan kategori pengelolaan limbah (pencegahan, penggunaan kembali, daur ulang, pemulihan, pembuangan): ");
        String kategori = scanner.nextLine().toLowerCase();

        System.out.print("Masukkan jenis sampah (plastik, kertas, organik, logam, lainnya): ");
        String jenisSampah = scanner.nextLine().toLowerCase();

        // Mengelola limbah berdasarkan kategori dan jenisnya
        switch (kategori) {
            case "pencegahan":
                System.out.println("Pencegahan limbah dapat dilakukan dengan mengurangi konsumsi barang sekali pakai.");
                break;
            case "penggunaan kembali":
                System.out.println("Barang " + jenisSampah + " dapat digunakan kembali jika memungkinkan.");
                break;
            case "daur ulang":
                switch (jenisSampah) {
                    case "plastik":
                        System.out.println("Sampah plastik dapat didaur ulang menjadi barang baru.");
                        break;
                    case "kertas":
                        System.out.println("Sampah kertas dapat didaur ulang menjadi kertas baru.");
                        break;
                    case "logam":
                        System.out.println("Sampah logam dapat didaur ulang menjadi produk logam baru.");
                        break;
                    default:
                        System.out.println("Sampah " + jenisSampah + " mungkin tidak dapat didaur ulang.");
                }
                break;
            case "pemulihan":
                System.out.println("Proses pemulihan energi dapat dilakukan dengan membakar sampah untuk menghasilkan listrik.");
                break;
            case "pembuangan":
                System.out.println("Pembuangan limbah harus dilakukan dengan benar di tempat pembuangan akhir.");
                break;
            default:
                System.out.println("Kategori tidak dikenal. Silakan masukkan kategori yang valid.");
        }

        // Menutup scanner
        scanner.close();
    }
}