public class GuGuDanTest {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                    
                System.out.print(i + "*" + j + " = " + (i * j));
                if (j < 9) {
                    System.out.print(", ");
                }
                j++;
            }
            System.out.println("\n");
            i++;
        }
    }
}





