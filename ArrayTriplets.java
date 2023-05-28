import java.util.Scanner;
public class ArrayTriplets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2,3,3,5,9,9,9};
        //System.out.println(arr.length);
        //int triplejjjt = 0;
        for(int i=0;i<arr.length-2;i++)
        {            if(arr[i] == arr[i+1])
                if(arr[i]== arr[i+2])
                    System.out.println(arr[i] + " is a triplet");
        }
    }
}
