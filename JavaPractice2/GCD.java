import java.util.Scanner;
public class GCD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        int result=Math.min(firstNumber,secondNumber);
        while(result>0){
            if(firstNumber%result==0 && secondNumber%result==0){
                break;
            }
            result--;
        }
        System.out.println(result);
        
    }
}