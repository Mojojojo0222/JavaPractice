import java.util.Scanner;
public class Marks{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>100 || marks<=0){
            System.out.println("Please input the valid marks");
            System.exit(0);
        }
        if(marks>80){
            System.out.println("A");
        }
        else if((marks<=80) && marks>60){
            System.out.println("B");
        }
        else if(marks<=60 && marks>50){
            System.out.println("C");
        }
        else if(marks<=50 && marks>45){
            System.out.println("D");
        }
        else if(marks<=45 && marks>25){
            System.out.println("E");
        }
        else{
            System.out.println("F");
        }
    }
}