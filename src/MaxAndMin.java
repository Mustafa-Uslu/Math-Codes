import java.util.Scanner;
public class MaxAndMin
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char result = 'a';
        int num1 = 0;
        int num2 = Integer.MIN_VALUE;
        int num3 = Integer.MAX_VALUE;
        int num5 = 0;

        do{
            System.out.println("Enter the number");
            num1 = scan.nextInt();
            num5=num1;
            if(num1>num2){
                num2=num1;
            }else if(num2>=num1){
                num1=num2;
            }
            if(num3>num5){
                num3=num5;
            }else if(num5>=num3){
                num5=num3;
            }
            System.out.println("Do you want to continue to enter? y/n");
            result = scan.next().charAt(0);
        }while(result!='n');
        System.out.println("The largest: "+num1);
        System.out.println("The smallest: "+num3);
    }
}


