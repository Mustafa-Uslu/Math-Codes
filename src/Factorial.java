import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();
        System.out.println(number+"!= "+fact(number));

    }

    public static int fact(int number){
        if(number<=1){
            return 1;
        }else{
            int result = number*fact(number-1);
            return result;
        }
    }
}

