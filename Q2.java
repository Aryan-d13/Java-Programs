import java.util.*;


public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        
        
        for(int i = 0; i<testCases;i++){
            int r = sc.nextInt();
            int p = sc.nextInt();
            int b = sc.nextInt();
            
            int peaches = r/p;
            int bananas = (r%p / b);
            System.out.print(peaches + " "+ bananas);
            System.out.println();
        }    
    }
}