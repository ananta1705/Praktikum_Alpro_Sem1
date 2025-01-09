import java.util.Scanner;

public class BandingkanBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilangan = new int[11];

        // Membaca 11 bilangan bulat dari pengguna
        for (int i = 0; i < 11; i++) {
            System.out.print("Masukkan bilangan bulat ke-" + (i + 1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        // Bilangan ke-11 yang akan dibandingkan
        int bilanganKe11 = bilangan[10];

        // Membandingkan setiap bilangan dengan bilangan ke-11
        for (int i = 0; i < 10; i++) { // Hanya membandingkan 10 bilangan pertama
            if (bilangan[i] > bilanganKe11) {
                System.out.println("Bilangan " + bilangan[i] + " lebih besar dari bilangan ke-11 (" + bilanganKe11 + ")");
            } else if (bilangan[i] < bilanganKe11) {
                System.out.println("Bilangan " + bilangan[i] + " lebih kecil dari bilangan ke-11 (" + bilanganKe11 + ")");
            } else {
                System.out.println("Bilangan " + bilangan[i] + " sama dengan bilangan ke-11 (" + bilanganKe11 + ")");
            }
        }

        scanner.close();
    }
}

// START

// DECLARE array bilangan[11] of integer
// DECLARE scanner for user input

// // Loop untuk membaca 11 bilangan bulat dari pengguna
// FOR i FROM 0 TO 10 DO
//     PRINT "Masukkan bilangan bulat ke-" + (i + 1) + ": "
//     READ bilangan[i]
// END FOR

// // Simpan bilangan ke-11 untuk dibandingkan
// SET bilanganKe11 = bilangan[10]

// // Loop untuk membandingkan setiap bilangan dengan bilangan ke-11
// FOR i FROM 0 TO 9 DO
//     IF bilangan[i] > bilanganKe11 THEN
//         PRINT "Bilangan " + bilangan[i] + " lebih besar dari bilangan ke-11 (" + bilanganKe11 + ")"
//     ELSE IF bilangan[i] < bilanganKe11 THEN
//         PRINT "Bilangan " + bilangan[i] + " lebih kecil dari bilangan ke-11 (" + bilanganKe11 + ")"
//     ELSE
//         PRINT "Bilangan " + bilangan[i] + " sama dengan bilangan ke-11 (" + bilanganKe11 + ")"
//     END IF
// END FOR

// CLOSE scanner

// END