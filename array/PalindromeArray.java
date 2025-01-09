package array;

import java.util.Scanner;

public class PalindromeArray {
    static final int MAX_SIZE = 256; // Kapasitas maksimum array

    // a. Tipe array integer
    static int[] array = new int[MAX_SIZE];
    
    // b. Procedure untuk pengisian array
    public static void isiArray(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    // c. Procedure untuk reverse isi array
    public static void reverseArray(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // d. Function untuk mengecek pola palindrome
    public static boolean isPalindrome(int[] arr, int n) {
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    // e. Program utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen (maksimal 256): ");
        int n = scanner.nextInt();

        if (n > MAX_SIZE) {
            System.out.println("Jumlah elemen melebihi kapasitas maksimal!");
            return;
        }

        // Isi array
        isiArray(array, n);

        // Tampilkan array asli
        System.out.print("Array asli: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Cek palindrome
        if (isPalindrome(array, n)) {
            System.out.println("Array memiliki pola palindrome.");
        } else {
            System.out.println("Array tidak memiliki pola palindrome.");
        }

        // Reverse array
        reverseArray(array, n);

        // Tampilkan array setelah reverse
        System.out.print("Array setelah reverse: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
