import java.util.HashSet;
import java.util.Set;

public class IrisanHimpunan {
    public static Set<Integer> irisan(int[] himpunanA, int[] himpunanB) {
        // Ubah himpunan A menjadi HashSet untuk pencarian lebih cepat
        Set<Integer> setA = new HashSet<>();
        for (int angka : himpunanA) {
            setA.add(angka);
        }

        // Buat HashSet baru untuk menyimpan hasil irisan
        Set<Integer> irisan = new HashSet<>();
        // Ambil elemen yang ada di kedua himpunan (irisan)
        for (int angka : himpunanB) {
            if (setA.contains(angka)) {
                irisan.add(angka);
            }
        }
        return irisan;
    }

    public static void main(String[] args) {
        int[] himpunanA = {11, 28, 33, 64, 95, 16, 100, 15};
        int[] himpunanB = {3, 11, 7, 28, 33, 6};

        Set<Integer> hasilIrisan = irisan(himpunanA, himpunanB);
        System.out.print("Irisan A dan B: ");
        for (int angka : hasilIrisan) {
            System.out.print(angka + " ");
        }
    }
}