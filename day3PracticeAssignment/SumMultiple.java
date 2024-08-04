package com.revature.day3PracticeAssignment;
import java.util.Scanner;
public class SumMultiple {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	for(int i=0;i<10;i++) {
		arr[i]=sc.nextInt();
	}
	double multiple=1;
	int sum=0;
	for(int i=0;i<10;i++) {
		sum+=arr[i];
		multiple*=arr[i];
	}
	System.out.println("Sum is: "+sum+ " Product is: "+multiple);
	sc.close();
}
}
