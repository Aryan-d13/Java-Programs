import java.util.*;
class Calculator{
    public static void main(String[] eahs)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Which Operation do you wanna perform? :");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");

        String opertor = sc.next().charAt(0);
        Object obj = newDictionary.get(opertor);

        obj(num1, num2);

        Dictionary newDictionary = new Hashtable();
        newDictionary.put("+", add);
        newDictionary.put("-",substract);
        newDictionary.put("/", divide);
        newDictionary.put("*",multiply);
    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    public static int divide(int num1, int num2){
        return num1/num2;
    }
    public static int substract(int num1, int num2){
        return num1-num2;
    }
}