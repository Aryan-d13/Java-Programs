import java.util.*;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Reverse : ");
        int num = sc.nextInt();
        String str = "";
        for(;num!=0;num/=10)
        {
            str = str + num %10;
        }
        System.out.println("Reverse Nummber : " + str);        
    }
    
}
