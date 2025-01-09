import java.util.Scanner;

public class JumlahBilanganGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num 1  % 2 == 0) {
                sum += num;
            } else {
                break;
            }
        }
        
        System.out.println(sum);
    }
}