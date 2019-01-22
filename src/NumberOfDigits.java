import java.util.Scanner;
public class NumberOfDigits
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to learn its number of digits");
        long number = scan.nextLong();
        int remainder=0;
        long num1 = 0;
        int counter=0;

        do{
            remainder=(int)(number%10);
            num1 = number/10;
            number=num1;
            counter++;
        }while(num1!=0);
        System.out.println("Number of digits is " + counter);
    }
}