package pekan10;

import java.util.Scanner;

public class deret {
    // Fungsi untuk menghitung jumlah deret Fibonacci
    static int sumFibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) { // Mulai dari 0 hingga n-1
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        System.out.println("Jumlah deret Fibonacci hingga suku ke-" + n + " adalah: " + sumFibonacci(n));
    }
}

/*
 * import java.util.Scanner;

public class Main {
    // Fungsi untuk menghitung jumlah deret Fibonacci
    static int sumFibonacci(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) { // Mulai dari 0 hingga n-1
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();
        System.out.println("Jumlah deret Fibonacci hingga suku ke-" + n + " adalah: " + sumFibonacci(n));
    }
}
 */