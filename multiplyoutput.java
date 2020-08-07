import java.util.Scanner;

public class multiplyoutput {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Please enter two integers...");
        int a  = in.nextInt();
        int b = in.nextInt();
        System.out.println("The product is: " + a * b);
    }
}