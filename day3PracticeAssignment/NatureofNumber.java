package com.revature.day3PracticeAssignment;
import java.util.Scanner;
public class NatureofNumber {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int arr[]=new int[20];
	System.out.println("Enter the numbers: ");
	for(int i=0;i<20;i++) {
		arr[i]=sc.nextInt();
	}
	//Positive numbers
     for(int i=0;i<20;i++) {
    	 if(arr[i]==0) {
    		 System.out.println("Number is 0 " + arr[i]);
    	 }
    	 if(arr[i]>0) {
    		 System.out.println("Number is positive "+ arr[i]);
    	 }
    	 else {
    		 System.out.println("Number is Negative "+ arr[i]);
    	 }
    	 if(arr[i]%2==0) {
    		 System.out.println("Number is Even "+ arr[i]);
    	 }
    	 else {
    		 System.out.println("Number is odd "+ arr[i]);
    	 }
    	 
     }
}
}
