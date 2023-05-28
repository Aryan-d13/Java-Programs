//import java.util.*;
class Animal extends Cat 
{
    public static void main(String[] args)
    {
        Animal ob = new Animal();
        Cat cat = new Cat(true,"Blue",4);
        System.out.println(cat.isVegetarain+"\n"+cat.color+"\n"+cat.noOfLegs);   
    }
}
