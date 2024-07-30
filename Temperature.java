import java.util.Scanner;
public class Temperature{

public static void  main(String args[]){

Scanner sc=new Scanner(System.in);
double f=sc.nextDouble();
double c=conversion(f);
System.out.println(c);
}


public static double conversion(double f){

double c=((double)(5.0/9.0)*(f-32));
return c;

}
}