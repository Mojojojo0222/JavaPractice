public class PerimeterAndArea{

public static double area(double length, double breadth){
  
double a=length*breadth;
return a; 

}
public static double perimeter(double length, double breadth){

double p=2*(length+breadth);
return p;
}

public static void main(String args[]){

double len=Double.parseDouble(args[0]);
double breadth=Double.parseDouble(args[1]);

System.out.println("Area of rectangle "+area(len,breadth));
System.out.println("Perimeter of rectangle "+perimeter(len,breadth));

}
}