public class Prg3{
public static void p(int n){

double num=(((n+8)/3)%5)*5;
System.out.println(num);

}



public static void main(String args[]){
int num=Integer.parseInt(args[0]);
p(num);

}
}