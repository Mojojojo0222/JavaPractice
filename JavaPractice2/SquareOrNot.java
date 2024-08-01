 
import java.util.Scanner;
public class SquareOrNot {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int breadth=sc.nextInt();
		SqaureOrNot(len,breadth);
		
		
	}
	public static void SqaureOrNot(int len,int breadth) {
	double area=len*breadth;
		if(len==breadth) {
			System.out.println("It is a square");
		}
		else {
			System.out.print("It is not a sqaure");
		}
	}
	
	
}
