package pekan3;
import java.util.Scanner;

public class karate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan energi kata 1: ");
        int num1 = scanner.nextInt();

        System.out.print("masukan energi kata 2: ");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        if (result > 0) {
            System.out.println("jadi energi yang di perlukan adalah: " + result);
        } else {
            System.out.println("energi tidak dapat negatif");
        }
        scanner.close();
    }
}
// public class karate {

//     public static void main(String[] args) {
//         System.out.println();
//     }
// }
//  public class karate {
 
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("masukkan energi");
        
//     }
//  }