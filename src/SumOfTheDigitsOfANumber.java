import java.util.Scanner;
public class SumOfTheDigitsOfANumber
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of the digits");
        int number1 = scan.nextInt();
        int sumOfTheDigits =0;
        int digit;
        int number = number1;

        do {digit=number%10;
            number = number/10;
            sumOfTheDigits = sumOfTheDigits + digit;
        } while (number!=0);
        System.out.println("The sum of the digits of the " + number1 + " is " + sumOfTheDigits );
    }
}

