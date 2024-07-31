import java.util.Scanner;
public class TwoDigitSum{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

if(n<10){
System.out.println("Enter number above 9");
System.exit(0);
}
int num=0;
int counter=1;
while(counter>0){
n/=10;
num=((n%10)+(n/1000));
counter--;
}
System.out.println(num);

}

}