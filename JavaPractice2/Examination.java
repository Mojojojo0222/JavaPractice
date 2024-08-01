import java.util.Scanner;
public class Examination{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number classes held");
        int classesHeld=sc.nextInt();
        System.out.println("Enter the number of classes attended");
        int classesAttended=sc.nextInt();
                double percentage = ((double) classesAttended / classesHeld) * 100;
        System.out.println("Classes held:  "+classesHeld+" Classes attended: "+classesAttended+" Percentage of classes Atended: "+ percentage+"%");
        boolean canAttendExam=false;
        if(percentage>=75){
        canAttendExam=true;
        System.out.println("Student can attend the examination");
        }
         else {
            System.out.println("If the student has any medical issues, enter Y or N:");
            String s = sc.nextLine(); 
        
            if (s.isEmpty()) {
                System.out.println("No input provided.");
            } else {
                char c = s.charAt(0); 
                if (c == 'Y' || c == 'y') {
                    System.out.println("Student can write the exam on medical grounds.");
                } else {
                    System.out.println("Student cannot write the exam.");
                }
            }
        }
        
    }
}