import java.util.Scanner;
public class BinaryToDecimal
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int numberBinary = scan.nextInt();
        double x = 0;
        double y = 0;
        double sum = 0;
        int i=0;
        while(numberBinary>0){
            x = numberBinary%10;
            y=x*Math.pow(2,i);
            sum = sum + y;
            i++;
            numberBinary = numberBinary/10;
        }
        System.out.println(sum);
    }
}

