import java.util.*;
public class sumOfNumbersDoWhile {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Numbers : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number;");
        int num2 = sc.nextInt();
        char doYouWantToContinue = 'Y';
        int sum=num1 + num2;
        int num3= 0;
        do{
            sum = sum+ num3;
            System.out.println("Sum : " +sum);
            System.out.println("Do you Want To Continue(Y/N)");
            doYouWantToContinue = sc.next().charAt(0);
            if(doYouWantToContinue == 'Y')
            {    
                System.out.println("Enter Number : ");
                num3 =sc.nextInt();    
            }    
        }while(doYouWantToContinue == 'Y');
    }
}
