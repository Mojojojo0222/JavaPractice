package revature.Day3;
import java.util.Scanner;
public class ExceptionMainClass {
	public static void main(String args[]) {
		CheckExceptions ce=new CheckExceptions();
		Scanner sc=new Scanner(System.in);
	    System.out.println("input the age");
		try {
			System.out.println("Starting try block");
			int age=sc.nextInt();
			ce.validateChecked(age);
			//System.exit(0);
			System.out.println("Ending try block");
		}
		 catch (InvalidAge|InvalidInput e) {
			// TODO Auto-generated catch block
			 System.out.println("Starting catch block");
			e.printStackTrace();
			System.out.println("Ending catch block");
		}
	   finally {
		   System.out.println("Finally block excuted");
	   }
	}

}
