package com.revature.day3PracticeAssignment;
import java.util.*;
public class MaximumMinimum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
//		Set<Integer> s=new TreeSet<>();
//		for(int i:arr) {
//			s.add(i);	
//		}
//		System.out.print(s);
		Arrays.sort(arr);
		int maximumDiff=arr[arr.length-1]-arr[0];
		int minimumDiff=arr[1]-arr[0];
		
		System.out.println("Maximum Diff: "+maximumDiff+ " Minimum Diff: "+ minimumDiff );
	}

}
