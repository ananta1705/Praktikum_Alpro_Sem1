package array;

import java.util.Scanner;

public class KonversiHurufKecil {

    // Procedure masukanArray
    public static void masukanArray(char[] T, String input) {
        for (int i = 0; i < input.length(); i++) {
            T[i] = input.charAt(i);
        }
    }

    // Procedure lowerCase
    public static void lowerCase(char[] T) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] >= 'A' && T[i] <= 'Z') {
                T[i] = (char) (T[i] + 32); // Konversi ke huruf kecil menggunakan ASCII
            }
        }
    }

    // Procedure cetakArray
    public static void cetakArray(char[] T) {
        for (char c : T) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string
        System.out.print("Masukkan sekumpulan karakter: ");
        String data = input.nextLine();

        // Deklarasi array
        char[] T = new char[data.length()];

        // Proses
        masukanArray(T, data);
        lowerCase(T);
        cetakArray(T);

        input.close();
    }
}
