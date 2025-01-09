package pekan10;
import java.util.Scanner;

public class faktorial {
    // Fungsi untuk menghitung faktorial
    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Fungsi untuk menghitung permutasi
    static long permutation(int a, int b) {
        return factorial(a) / factorial(a - b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();
        System.out.print("Masukkan nilai y: ");
        int y = scanner.nextInt();

        // Menghitung faktorial dan permutasi
        long xFact = factorial(x);
        long yFact = factorial(y);
        long result = permutation(Math.max(x, y), Math.min(x, y));

        // Menampilkan hasil
        System.out.println(x + "! = " + xFact);
        System.out.println(y + "! = " + yFact);
        System.out.println("Permutasi = " + result);
    }
}
/*
 * FUNCTION factorial(n)
    SET result = 1
    FOR i FROM 2 TO n DO
        result = result * i
    END FOR
    RETURN result
END FUNCTION

FUNCTION permutation(a, b)
    RETURN factorial(a) / factorial(a - b)
END FUNCTION

FUNCTION main
    DECLARE scanner AS new Scanner
    DECLARE x, y AS INTEGER

    PRINT "Masukkan nilai x: "
    READ x
    PRINT "Masukkan nilai y: "
    READ y

    SET xFact = factorial(x)
    SET yFact = factorial(y)

    SET result = permutation(MAX(x, y), MIN(x, y))

    PRINT x + "! = " + xFact
    PRINT y + "! = " + yFact
    PRINT "Permutasi = " + result
END FUNCTION
 */