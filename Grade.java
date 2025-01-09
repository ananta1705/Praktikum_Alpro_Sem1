import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = scanner.nextInt();

        switch ((nilai >= 90 && nilai <= 100) ? 1 : (nilai >= 80 && nilai < 90) ? 2 : (nilai >= 70 && nilai < 80) ? 3 : (nilai >= 60 && nilai < 70) ? 4 : (nilai < 60) ? 5 : 6) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("Tidak Ditemukan !");
        }
    }
}

//pesudoden
/*
 * PROGRAM "Grade"
  DECLARE scanner AS Scanner
  DECLARE nilai AS INTEGER

  scanner = Scanner(System.in)
  PRINT "Masukkan Niai : "
  nilai = scanner.nextInt()

  IF nilai >= 90 AND nilai <= 100 THEN
    PRINT "A"
  ELSE IF nilai >= 80 AND nilai < 90 THEN
    PRINT "B"
  ELSE IF nilai >= 70 AND nilai < 80 THEN
    PRINT "C"
  ELSE IF nilai >= 60 AND nilai < 70 THEN
    PRINT "D"
  ELSE IF nilai < 60 THEN
    PRINT "E"
  ELSE
    PRINT "Tidak Ditemukan !"
  END IF
END PROGRAM
 */