import java.util.*;
public class Oops 
{
    String name;
    int rollNO;
    String enrollmentNo;
    void Oops()
    {
        name = "";
        rollNO = 0;
        enrollmentNo = "";
    }
    public static void main(String[] ars)
    {
        Scanner sc = new Scanner(System.in);
        Oops obj = new Oops();
        obj.getInput();
        System.out.println(obj.name);
    }
    void getInput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Roll No. : ");
        rollNO = sc.nextInt();
        System.out.println("Enter Enrollment No. : ");
        enrollmentNo = sc.next();
    }
}
 
 
