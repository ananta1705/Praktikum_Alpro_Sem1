package array;
public class databrang {
    public static void main(String[] args) {
        // Deklarasi array 2 dimensi untuk menyimpan data barang dan satuan
        String[][] barang = {
                {"Buku Tulis", "pcs"},
                {"Pensil", "Lusin"},
                {"Penggaris", "pcs"},
                {"Kertas HVS", "Rim"},
                {"Penghapus", "Dos"}
        };

        // Menampilkan judul tabel
        System.out.println("Nama Barang\tSatuan");
        System.out.println("=================");

        // Menampilkan data dari array
        for (String[] baris : barang) {
            System.out.println(baris[0] + "\t\t" + baris[1]);
        }
    }
}