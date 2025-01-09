package array;

import java.util.Scanner;

public class ArraySeragam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array (n): ");
        int n = input.nextInt();
        input.nextLine(); // Konsumsi newline

        if (n <= 0) {
            System.out.println("false");
            return;
        }

        System.out.println("Masukkan elemen array:");
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextLine();
        }

        boolean isSeragam = true;
        for (int i = 1; i < n; i++) {
            if (!array[i].equals(array[0])) {
                isSeragam = false;
                break;
            }
        }

        System.out.println(isSeragam);
        input.close();
    }
}
