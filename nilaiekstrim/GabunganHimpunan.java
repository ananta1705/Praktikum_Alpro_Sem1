package nilaiekstrim;
import java.util.HashSet;
import java.util.Set;

public class GabunganHimpunan {
    public static Set<Integer> gabungan(int[] himpunanA, int[] himpunanB) {
        // Ubah himpunan A menjadi HashSet untuk pencarian lebih cepat
        Set<Integer> gabungan = new HashSet<>();
        for (int angka : himpunanA) {
            gabungan.add(angka);
        }

        // Tambahkan elemen dari himpunan B yang belum ada di gabungan
        for (int angka : himpunanB) {
            gabungan.add(angka);
        }

        return gabungan;
    }

    public static void main(String[] args) {
        int[] himpunanA = {11, 28, 33, 64, 95, 16, 100, 15};
        int[] himpunanB = {3, 11, 7, 28, 33, 6};

        Set<Integer> hasilGabungan = gabungan(himpunanA, himpunanB);
        System.out.print("Gabungan A dan B: ");
        for (int angka : hasilGabungan) {
            System.out.print(angka + " ");
        }
    }
}