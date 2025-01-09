package methodpengembalian;

public class PlanetXPrime {

    // Fungsi untuk memeriksa apakah sebuah bilangan adalah bilangan "prima" di planet X
    static boolean isPrime(int n) {
        int faktor = 0; // Hitung jumlah faktor
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                faktor++;
            }
        }
        return faktor == 3; // Bilangan prima di planet X harus memiliki tepat 3 faktor
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        int input = 4; // Ubah nilai ini untuk test case lainnya
        System.out.println("Apakah " + input + " bilangan prima di planet X? " + isPrime(input));
    }
}
