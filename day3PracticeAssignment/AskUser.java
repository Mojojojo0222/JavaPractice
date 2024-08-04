package com.revature.day3PracticeAssignment;
import java.util.Scanner;
public class AskUser {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
	System.out.println("Enter the nuber to find");
	int n=sc.nextInt();
	for(int i=0;i<10;i++) {
		if(n==arr[i]) {
			System.out.println("Number found "+ n);
			System.exit(0);
		}
		
		
	}
	System.out.println("Number not Found");
		
	}

}
