import java.util.Scanner;

public class Balok {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan panjang balok (p): ");
    double panjang = scanner.nextDouble();

    System.out.print("Masukkan lebar balok (l): ");
    double lebar = scanner.nextDouble();

    System.out.print("Masukkan tinggi balok (t): ");
    double tinggi = scanner.nextDouble();

    double luas_depan = panjang * tinggi;
    double luas_belakang = panjang * tinggi;
    double luas_kiri = lebar * tinggi;
    double luas_kanan = lebar * tinggi;
    double luas_atas = panjang * lebar;
    double luas_bawah = panjang * lebar;

    double luas_permukaan = 2 * (luas_depan + luas_belakang + luas_kiri + luas_kanan + luas_atas + luas_bawah);

    System.out.println("Panjang balok: " + panjang);
    System.out.println("Lebar balok: " + lebar);
    System.out.println("Tinggi balok: " + tinggi);
    System.out.println("Luas permukaan balok: " + luas_permukaan);
  }
}
//kata satu berapa energi
