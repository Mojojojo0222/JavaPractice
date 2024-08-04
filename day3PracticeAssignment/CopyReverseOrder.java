package com.revature.day3PracticeAssignment;
import java.util.Scanner;
public class CopyReverseOrder {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	for(int i=0;i<10;i++) {
		arr[i]=sc.nextInt();
	}
	int arr2[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		arr2[arr.length-i-1]=arr[i];
	}
	for(int i:arr2) {
		System.out.println(i+" ");
	}
	
}
}
