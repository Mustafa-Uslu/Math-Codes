import java.util.Scanner;
public class ValueOfExponentials
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base");
        double base = scan.nextDouble();

        System.out.println("Enter the power");
        int power = scan.nextInt();

        int i=0;
        double result = 1;
        for(i=1; i<=power; i++){
            result = result * base;
        }
        System.out.println(power + ". power of " + base + " is " + result  );
    }
}
