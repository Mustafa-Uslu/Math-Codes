import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any integer");
        int number = scan.nextInt();
        String x = "";
        int a;
        while(number>0){
            a=number%2;
            x=a+x;
            number=number/2;
        }
        System.out.println(x);
    }

}

