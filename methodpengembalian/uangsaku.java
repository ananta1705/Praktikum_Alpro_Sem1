package methodpengembalian;
import java.util.Scanner;

public class uangsaku {

    // Hitung uang saku berdasarkan kelompok kota dan jumlah hari
    public static int hitungUangSaku(String kelompok, int hari) {
        int tarif = 0;
        if (kelompok.equals("A")) {
            tarif = 500000;
        } else if (kelompok.equals("B")) {
            tarif = 350000;
        } else if (kelompok.equals("C")) {
            tarif = 250000;
        }
        return tarif * hari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kelompok kota
        System.out.print("Kelompok kota (A/B/C): ");
        String kelompok = input.nextLine();

        // Input jumlah hari perjalanan
        System.out.print("Jumlah hari: ");
        int hari = input.nextInt();

        // Hitung total uang saku
        int total = hitungUangSaku(kelompok, hari);

        // Tampilkan hasil
        System.out.println("Total uang saku: Rp " + total);

        input.close();
    }
}
