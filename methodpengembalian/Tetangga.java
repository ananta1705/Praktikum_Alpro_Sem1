package  methodpengembalian;

public class Tetangga {
    
    // Method untuk memeriksa apakah dua daerah bertetangga
    static boolean isTetangga(char d1, char d2) {
        // Memeriksa apakah pasangan daerah bertetangga
        if ((d1 == 'A' && d2 == 'B') || (d1 == 'B' && d2 == 'A')) return true;
        if ((d1 == 'B' && d2 == 'C') || (d1 == 'C' && d2 == 'B')) return true;
        if ((d1 == 'C' && d2 == 'D') || (d1 == 'D' && d2 == 'C')) return true;
        if ((d1 == 'D' && d2 == 'E') || (d1 == 'E' && d2 == 'D')) return true;
        return false;
    }
    
    public static void main(String[] args) {
        // Contoh masukan
        char daerah1 = 'A';
        char daerah2 = 'B';

        // Menampilkan hasil
        System.out.println("Apakah " + daerah1 + " dan " + daerah2 + " bertetangga? " + isTetangga(daerah1, daerah2));
    }
}
