
import java.util.Scanner;
public class AskingQuestions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double gpa;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();
        // discard remaining data in the key board 
		keyboard.nextLine();
		//String  anotherAnswer = keyboard.nextLine();  
		
		System.out.print( "What is your GPA? " );
		
		gpa = keyboard.nextDouble();
	
		System.out.println( "Age is" +" "+ age + " "+ "\nHeight is" + " " + height + " " + "\ngpa is" + " " + gpa );
		//System.out.println("anotherAnswer"+ anotherAnswer);
		keyboard.close();

	}

}

