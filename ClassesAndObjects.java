import java .util.*;
class ClassesAndObjects
{
    String name;
    int rollNo;
    String enrollment;
    public ClassesAndObjects()
    {
        name = "";
        rollNo = 0;
        enrollment = "";
    }
    public static void main(String[] aegs)
    {
        Scanner sc = new Scanner(System.in);

        ClassesAndObjects std = new ClassesAndObjects();

        System.out.print("Enter Name : ");
        std.name = sc.nextLine();
        System.out.print("Enter Roll No : ");
        std.rollNo = sc.nextInt();
        System.out.print("Enter Enrollment : ");
        sc.nextLine();
        std.enrollment = sc.nextLine();
        
        System.out.println("Name : "+ std.name);
        System.out.println("Roll No. : "+std.rollNo);
        System.out.println("Enrollment Number : " + std.enrollment);
        sc.close();
    }
}
