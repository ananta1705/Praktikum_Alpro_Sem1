import java.util.Scanner;

public class GandakanDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan berdigit 2: ");
        String input = scanner.nextLine();
        
        // Menggandakan digit
        String hasil = "" + input.charAt(0) + input.charAt(0) + input.charAt(1) + input.charAt(1);
        
        // Menampilkan hasil
        System.out.println("Hasil pengandaan: " + hasil);
        
        // Menutup scanner
        scanner.close();
    }
}