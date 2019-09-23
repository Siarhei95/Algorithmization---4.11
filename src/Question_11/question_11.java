package Question_11;
import java.util.*;

public class question_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the second number n: ");
        int n = scanner.nextInt();
        lookForMoreNumbers(m,n);
    }

    private static void lookForMoreNumbers(int m, int n) {
       int numberM = String.valueOf(Math.abs(m)).length();
       int numberN = String.valueOf(Math.abs(n)).length();
       if(numberM>numberN){
           System.out.println("The first number has more numbers than the second(First number "+m+" has - "+numberM+" > second "+n+" has - "+numberN+")");
       }
       if(numberM<numberN){
           System.out.println("The second number has more numbers than the first(Second number "+n+" has - "+numberN+" > first "+m+" has - "+numberM+")");
       }
       if (numberM==numberN) {
           System.out.println("The first and second numbers have the same amount");
       }
    }
}