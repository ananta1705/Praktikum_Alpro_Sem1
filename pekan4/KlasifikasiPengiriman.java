
// import java.util.Scanner;

// public class KlasifikasiPengiriman {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari pengguna

//         System.out.print("Masukkan berat paket (kg): ");
//         double berat = scanner.nextDouble(); // Meminta input berat dan menyimpannya ke variabel 'berat'

//         System.out.print("Masukkan panjang paket (cm): ");
//         double panjang = scanner.nextDouble(); // Meminta input panjang dan menyimpannya ke variabel 'panjang'

//         System.out.print("Masukkan lebar paket (cm): ");
//         double lebar = scanner.nextDouble(); // Meminta input lebar dan menyimpannya ke variabel 'lebar'

//         System.out.print("Masukkan tinggi paket (cm): ");
//         double tinggi = scanner.nextDouble(); // Meminta input tinggi dan menyimpannya ke variabel 'tinggi'

//         String klasifikasi = klasifikasiPengiriman(berat, panjang, lebar, tinggi); // Memanggil fungsi klasifikasiPengiriman untuk menentukan klasifikasi pengiriman berdasarkan input
//         System.out.println("Klasifikasi Pengiriman: " + klasifikasi); // Menampilkan hasil klasifikasi pengiriman
//     }

//     public static String klasifikasiPengiriman(double berat, double panjang, double lebar, double tinggi) {
//         String klasifikasi; // Mendeklarasikan variabel 'klasifikasi' untuk menyimpan hasil klasifikasi pengiriman

//         switch (getKategori(berat, panjang, lebar, tinggi)) { // Menggunakan switch case untuk menentukan klasifikasi berdasarkan kategori
//             case 1: // Kategori 1: Berat melebihi batas
//                 klasifikasi = "Paket tidak dapat dikirimkan karena terlalu berat.";
//                 break;
//             case 2: // Kategori 2: Dimensi melebihi batas
//                 klasifikasi = "Paket tidak dapat dikirimkan karena ukurannya terlalu besar.";
//                 break;
//             case 3: // Kategori 3: Pengiriman Khusus
//                 klasifikasi = "Pengiriman Khusus";
//                 break;
//             case 4: // Kategori 4: Pengiriman Reguler Besar
//                 klasifikasi = "Pengiriman Reguler Besar";
//                 break;
//             case 5: // Kategori 5: Pengiriman Reguler
//                 klasifikasi = "Pengiriman Reguler";
//                 break;
//             case 6: // Kategori 6: Pengiriman
// }            