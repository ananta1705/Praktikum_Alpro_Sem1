import java.util.Scanner;
public class Contoh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] hari = new String[7];
        int i;
        hari[0] = "senin";
        hari [1] = input.next();

        for(i = 2; i <= 6; i++){
           hari[i] = input.next();
        }
    }

    System.out.println(hari[1] + " " +hari[5]))
}