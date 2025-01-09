package methodpengembalian;
import java.util.Scanner;

public class cekKesamaanKarakter {
    static boolean cekKesamaanKarakter(char karakter1, char karakter2) {
        // Bandingkan karakter secara langsung atau dengan mengabaikan case untuk huruf
        return karakter1 == karakter2 || 
               (Character.isLetter(karakter1) && Character.isLetter(karakter2) &&
               Character.toLowerCase(karakter1) == Character.toLowerCase(karakter2));
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan dua karakter: ");
        char karakter1 = inp.next().charAt(0);
        char karakter2 = inp.next().charAt(0);
        
        System.out.println("Apakah kedua karakter sama? " + cekKesamaanKarakter(karakter1, karakter2));
        
        inp.close();
    }
}