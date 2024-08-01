import java.util.Scanner;
public class Averageof10{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        double avg=0;
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            avg+=a[i];
        }
        System.out.println("Average of 10 numbers is: "+avg);
    }
}