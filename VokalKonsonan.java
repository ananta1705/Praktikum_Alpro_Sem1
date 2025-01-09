import java.util.Scanner;

public class VokalKonsonan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah alfabet: ");
        String input = scanner.nextLine();

        // Jika input lebih dari satu karakter, tampilkan pesan error
        if (input.length() != 1) {
            System.out.println("Error: Input harus berupa satu karakter alfabet.");
            return;
        }

        // Konversi input ke lowercase
        char huruf = input.toLowerCase().charAt(0);

        // Cek apakah huruf vokal
        if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
            System.out.println("Vokal");
        } else {
            System.out.println("Konsonan");
        }
    }
}