package array;
import java.util.ArrayList;
import java.util.Scanner;

public class PertandinganBola {
    
    // Procedure untuk input data ke array
    public static void inputData(ArrayList<Integer> tim) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data gol tim (akhiri dengan angka negatif):");
        while (true) {
            int gol = scanner.nextInt();
            if (gol < 0) break;
            tim.add(gol);
        }
    }

    // Function untuk menghitung rata-rata
    public static double rataRata(ArrayList<Integer> tim) {
        if (tim.isEmpty()) return 0;
        int total = 0;
        for (int gol : tim) {
            total += gol;
        }
        return (double) total / tim.size();
    }

    // Program utama
    public static void main(String[] args) {
        ArrayList<Integer> tim1 = new ArrayList<>();
        ArrayList<Integer> tim2 = new ArrayList<>();

        // Input data untuk kedua tim
        System.out.println("Input data untuk Tim 1:");
        inputData(tim1);

        System.out.println("Input data untuk Tim 2:");
        inputData(tim2);

        // Hitung rata-rata kemenangan
        double rataRataTim1 = rataRata(tim1);
        double rataRataTim2 = rataRata(tim2);

        // Tampilkan hasil
        System.out.printf("Rata-rata kemenangan Tim 1: %.2f\n", rataRataTim1);
        System.out.printf("Rata-rata kemenangan Tim 2: %.2f\n", rataRataTim2);
    }
}
