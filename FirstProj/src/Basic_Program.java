// Zheyi Ma 


// ask the user their pet's name, breed and age. Add the 3 lines necessary to make this work
import java.util.Scanner;
 
public class Basic_Program
{
    public static void main( String[] args )
   {
       String name;
       String breed;
       int age;
       
       Scanner keyboard = new Scanner(System.in);

       

       System.out.print( "Hello. What is your pet's name? " );
       name = keyboard.next();

       System.out.print( "\nWhat kind of animal is " + name + "? " );
       breed = keyboard.next();
       System.out.print( "\tHow old is " + name + "? ");
       age = keyboard.nextInt();
       
       System.out.println( name + " is your " + breed + " and it is " + age );
       keyboard.close();
    }
}

