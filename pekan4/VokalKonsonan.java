package pekan4;
import java.util.Scanner;
// Ini mengimpor kelas Scanner yang memungkinkan program untuk mengambil input dari pengguna.

public class VokalKonsonan { // Ini mendefinisikan kelas utama program.
    public static void main(String[] args) {
        //Membuat objek Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in); //Membuat objek scanner untuk membaca input dari konsol (keyboard)
        
        //Meminta user untuk memasukkan alfabet
        System.out.print("Masukkan alfabet: "); //enampilkan pesan ke layar untuk meminta pengguna memasukkan alfabet.
        String input = scanner.nextLine(); //Membaca input yang dimasukkan pengguna sebagai String dan menyimpannya di variabel inputd
        
        //Memeriksa apakah input adalah vokal atau konsonan
        String jenisHuruf = cekHuruf(input);
        
        //Menampilkan jenis huruf
        System.out.println("Jenis huruf: " + jenisHuruf);
    }
    
    //Method untuk memeriksa jenis huruf
    public static String cekHuruf(String input) {
        //Mengubah input menjadi huruf kecil
        input = input.toLowerCase();
        
        //Memeriksa apakah input adalah vokal
        if (input.equals("a") || input.equals("i") || input.equals("u") || input.equals("e") || input.equals("o")) {
            return "vokal";
        } else {
            return "konsonan";
        }
    }
}