package array;
  import java.util.Scanner;

public class Rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBarang = 0, totalHari = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.print("Masukkan barang terjual dan pendapatan (0 0 untuk berhenti): ");
            int barang = input.nextInt();
            double pendapatan = input.nextDouble();

            if (barang == 0 && pendapatan == 0) break;

            totalBarang += barang;
            totalPendapatan += pendapatan;
            totalHari++;
        }

        if (totalHari > 0) {
            System.out.printf("Rata-rata barang terjual: %.2f%n", (double) totalBarang / totalHari);
            System.out.printf("Rata-rata pendapatan: %.2f%n", totalPendapatan / totalHari);
        } else {
            System.out.println("Tidak ada data untuk dihitung.");
        }
        input.close();
    }
}

