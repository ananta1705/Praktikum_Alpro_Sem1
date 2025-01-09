package pekan10;

import java.util.Scanner;

public class duadimensi {

    // Fungsi untuk memeriksa apakah tiga sisi dapat membentuk segitiga
    public static String cekSegitiga(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) { // Semua sisi harus positif
            if (a + b > c && a + c > b && b + c > a) {
                return "segitiga";
            }
        }
        return "bukan segitiga";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan sisi (pisahkan dengan spasi):");
        try {
            // Membaca input dari pengguna
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // Memanggil fungsi cekSegitiga dan mencetak hasil
            String hasil = cekSegitiga(a, b, c);
            System.out.println("Keluaran: " + hasil);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan tiga bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}
/*
 * FUNCTION cekSegitiga(a, b, c)
    IF a > 0 AND b > 0 AND c > 0 THEN
        IF a + b > c AND a + c > b AND b + c > a THEN
            RETURN "segitiga"
        ENDIF
    ENDIF
    RETURN "bukan segitiga"
END FUNCTION

BEGIN
    PRINT "Masukkan tiga bilangan sisi (pisahkan dengan spasi):"
    READ a, b, c
    hasil ← cekSegitiga(a, b, c)
    PRINT "Keluaran: " + hasil
END

 */