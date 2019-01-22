
import java.util.Scanner;
public class NumberReader
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 999");
        int number = scan.nextInt();
        if(number<1 || number>999){
            System.out.println("Enter the number from 1 to 999");
            return;
        }
        int hundreds = number/100;
        int remainder1 = number%100;
        int tenths = remainder1/10;
        int ones = remainder1%10;

        //System.out.println(number + " " +hundreds + " " + remainder1 + " " + tenths + " " + ones);
        String readHundreds = "";
        String read1 = "";
        String readTenths = "";

        switch(hundreds){
            case 1:
                readHundreds="One Hundred";
                break;
            case 2:
                readHundreds="Two Hundred";
                break;
            case 3:
                readHundreds="Three Hundred";
                break;
            case 4:
                readHundreds="Four Hundred";
                break;
            case 5:
                readHundreds="Five Hundred";
                break;
            case 6:
                readHundreds="Six Hundred";
                break;
            case 7:
                readHundreds="Seven Hundred";
                break;
            case 8:
                readHundreds="Eight Hundred";
                break;
            case 9:
                readHundreds="Nine Hundred";
                break;
            default:
                readHundreds="";
                break;
        }
        switch(tenths){
            case 1:
                switch(ones){
                    case 1:
                        read1="Eleven";
                        break;
                    case 2:
                        read1="Twelve";
                        break;
                    case 3:
                        read1="Thirteen";
                        break;
                    case 4:
                        read1="Fourteen";
                        break;
                    case 5:
                        read1="Fifteen";
                        break;
                    case 6:
                        read1="Sixteen";
                        break;
                    case 7:
                        read1="Seventeen";
                        break;
                    case 8:
                        read1="Eighteen";
                        break;
                    case 9:
                        read1="Nineteen";
                        break;
                    case 0:
                        read1="Ten";
                        break;
                }
                System.out.println(number + ": " + readHundreds+ " " + read1);
                break;
            case 2:
                readTenths="Twenty";
                break;
            case 3:
                readTenths="Thirty";
                break;
            case 4:
                readTenths="Fourty";
                break;
            case 5:
                readTenths="Fifty";
                break;
            case 6:
                readTenths="Sixty";
                break;
            case 7:
                readTenths="Seventy";
                break;
            case 8:
                readTenths="Eighty";
                break;
            case 9:
                readTenths="Ninety";
                break;
            default:
                readTenths="";
                break;
        }
        switch(ones){
            case 1:
                read1="One";
                break;
            case 2:
                read1="Two";
                break;
            case 3:
                read1="Three";
                break;
            case 4:
                read1="Four";
                break;
            case 5:
                read1="Five";
                break;
            case 6:
                read1="Six";
                break;
            case 7:
                read1="Seven";
                break;
            case 8:
                read1="Eight";
                break;
            case 9:
                read1="Nine";
                break;
            case 0:
                read1="";
                break;
        }
        System.out.println(number + ": " + readHundreds+ " " + readTenths + " " + read1);
    }
}

