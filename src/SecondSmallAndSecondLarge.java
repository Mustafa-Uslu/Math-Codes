import java.util.*;

public class SecondSmallAndSecondLarge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the numbers.\nWhen you want to end to enter press any letter.");
        int num = scan.nextInt();
        while(num!=0){
            try {
                list.add(num);
                num = scan.nextInt();
            }catch(InputMismatchException e){
                break;
            }
        }


        Collections.sort(list);
        System.out.println(list);
        System.out.println("Second small: "+list.get(1));
        System.out.println("Second large: "+list.get(list.size()-2));
    }
}
