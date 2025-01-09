public class MultiFiveSumTest {

    public static void main(String[] args){
        
                int sum = 0;
                int i = 5;
                int count = 1;
        
                do {
                    sum += i;
                    System.out.println(count + ". (+ " + i + ") " + sum);
                    i += 5;
                    count++;
                } while (sum < 100);
        
                System.out.println("Jumlah total mencapai " + sum + ".");
            }
        }
