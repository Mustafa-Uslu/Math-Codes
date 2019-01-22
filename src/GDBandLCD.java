import java.util.Scanner;
import java.lang.*;
    public class GDBandLCD
    {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose one of the option\n"+"1:List all the divisors\n"+"2:Find the sum of all the divisor\n"
                    +"3:Is it prime number?\n"+"4:Find the GCD\n"+"5:Find the LCM");
            int option = scan.nextInt();
            int number;
            int i = 0;
            int sum=0;
            int[] divisorArray= new int[900];
            switch(option){
                case 1:
                    System.out.println("Enter the number");
                    number = scan.nextInt();
                    for(i=1; i<=number; i++){
                        if(number%i==0){
                            divisorArray[i-1]=i;
                            System.out.println(divisorArray[i-1]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the number");
                    number = scan.nextInt();
                    for(i=1; i<=number; i++){
                        if(number%i==0){
                            sum=sum+i;
                        }
                    }
                    System.out.println("The sum of the divisors of "+number+" is "+ sum);
                    break;
                case 3:
                    System.out.println("Enter the number");
                    number = scan.nextInt();
                    for(i=1; i<=number; i++){
                        if(number%i==0){
                            sum=sum+i;
                        }
                    }
                    if(sum==number+1){
                        System.out.println("The number "+number+ " is a prime number.");
                    }else{
                        System.out.println("The number "+number+ " is not a prime number.");
                    }
                    break;
                case 4:
                    System.out.println("Enter two numbers to find their GCD");
                    int num1=scan.nextInt();
                    int num2=scan.nextInt();
                    while(num1!=0 && num2!=0)
                    {
                        int num3 = num2;
                        num2 = num1%num2;
                        num1 = num3;
                    }
                    System.out.println(num1);
                    break;
                case 5:
                    System.out.println("Enter two numbers to find their LCM");
                    int num6=scan.nextInt();
                    int num7=scan.nextInt();
                    int num4=num6;
                    int num5=num7;
                    while(num6!=0 && num7!=0)
                    {
                        int num3 = num7;
                        num7 = num6%num7;
                        num6 = num3;
                    }
                    System.out.println("The LCM of the given numbers is " + (num4*num5)/num6);
                    break;


            }
        }
    }