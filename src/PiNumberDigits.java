import java.util.*;
public class PiNumberDigits
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which number do you want to learn after the comma for PI number.\nNumber should be less than 13.");
        double a = scan.nextInt();
        int num1 = (int)(Math.PI*Math.pow(10,a));
        double num2 = num1 / Math.pow(10,a);
        System.out.println(num2);
    }
}
