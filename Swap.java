public class Swap {

    public static void main(String[] args) {
      
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before Swap: " + a + " " + b);

   
        //int[] swapped = swap(a, b);
         swap2(a,b);

      
        //System.out.println("After Swap: " + swapped[0] + " " + swapped[1]);
    }

   
    public static int[] swap(int a, int b) {
        int[] result = new int[2];
        result[0] = b; 
        result[1] = a; 
        return result;
    }
public static void swap2(int a, int b){
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping a"+a+" b "+ b);
}
}
