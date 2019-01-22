import java.util.Scanner;
public class TwoUnknownEquationSolver
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("For the first ax+by=c equation, enter the a, b and c values respectively");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("For the second dx+ey=f equation, enter the d, e and f values respectively");
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        double x=0;
        double y=0;

        if((a==0 && d==0) || (b==0 && e==0)){
            System.out.println("Coefficients of both x or coefficients of both y cannot be zero");
        }else if((a*e - d*b)==0 && (c*e - f*e)==0 || (b*d - a*e)==0 && (c*d - f*a)==0){
            System.out.println("Infinitely many solutions");
        }else if((a*e - d*b)==0 && (c*e - f*b)!=0 || (b*d - a*e)==0 && (c*d - f*a)!=0){
            System.out.println("No real solution");
        }else {
            x=(b*f - c*e)/(b*d - a*e);
            y=(c*d - f*a)/(b*d - a*e);
            System.out.println("(x, y) = " + "(" + x + ", " + y + ")");
        }
    }
}


