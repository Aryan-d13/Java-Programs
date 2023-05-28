import java.util.*;
public class PrintArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Elements you want to input in the Array : ");
        int elements = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[elements];
        
        for(int i=0;i<elements;i++){
            System.out.print("Enter The String at Index " + i +" :");
            arr[i] = sc.nextLine();
            System.out.println();
        }            
        for(int i =0; i<elements; i++)
            System.out.println(arr[i]);        

    }
}
