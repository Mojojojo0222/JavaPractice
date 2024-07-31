import java.util.Scanner;
public class ReverseThreeDigitNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(reverse(num));

}
public static int reverse(int num){

int rev=0;
while(num>0){
int n=num%10;
rev=(rev*10)+n;
num/=10;

}
return rev;
}
}