package com.revature.day3PracticeAssignment;
import java.util.*;
public class LargestAndSmallest {
	public static void main(String args[]) {
		
	Scanner sc=new Scanner(System.in);
	int arr[] = new int[10];
	
	for(int i=0;i<10;i++) {
		arr[i]=sc.nextInt();
	}
	int highest=arr[0];
	int lowest=arr[0];
	
	for(int j=0;j<arr.length;j++) {
		for(int i=j+1;i<=arr.length-1;i++) {
			if(arr[i]>arr[j]) {
				highest=arr[i];
			}
			if(arr[i]<arr[j]) {
				lowest=arr[i];
			}
		}
		
		
	}
	System.out.print("Highest value: "+highest+ " Lowest value: "+lowest);

}
}