import java.util.*;
public class RaisePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Base Number : ");
        int base = sc.nextInt();
        System.out.println("Enter its Power : ");
        int power = sc.nextInt();
        int prod = 1;
        for(int i = 1;i<=power;i++)
            prod = prod*base;
        System.out.println(prod);
    }
}
