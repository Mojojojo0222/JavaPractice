public class TringleArea{

public  static double area(double base, double height){
   double area=base*height;
return area;
}

public static void main(String args[]){
double h=Double.parseDouble(args[0]);
Double b=Double.parseDouble(args[1]);

System.out.println(area(b,h));
}
}