import java.util.Scanner;

public class unit_conversion {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Please enter the value in inches: ");
        double inch = in.nextInt();
        double meter = inch * 0.0254;
        System.out.println(inch + " inches is " + meter + " meters...");
    }
}