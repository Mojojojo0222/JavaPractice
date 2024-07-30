public class Percentage{

public static void TotalMarks(int maths,int science, int biology ){
   
int totalMarks= maths+science+biology;
double percentage= (totalMarks/3);
System.out.println("Total Marks "+totalMarks +" Percentage= "+percentage+"%");
}

public static void main(String args[]){

  int maths=Integer.parseInt(args[0]);
  int science=Integer.parseInt(args[1]);
  int biology=Integer.parseInt(args[2]);

  TotalMarks(maths,science,biology);
 
}
}