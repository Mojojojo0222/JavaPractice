import java.util.Scanner;
public class ThreeDigitSum{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(n<100){
System.out.println("Enter number above 99");
System.exit(0);
}
int num=0;
int counter=3;
while(counter>0){
num+=n%10;
n/=10;
counter--;
}
System.out.println(num);

}
}