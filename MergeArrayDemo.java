package com.kn.mergearray;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// take size as input for array 1
		System.out.println("Enter the size for array 1= ");
		//Declare array 1
		int[] arr = new int[scan.nextInt()];
		//Ititialize array1
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter " + (i+1)+"element for array 1");
			arr[i]=scan.nextInt();
		}
		// take size as input for array 2
		System.out.println("Enter the size for array 2= ");
		//Declare array 2
		int[] brr = new int[scan.nextInt()];
		//Ititialize array2
		for(int i=0;i<brr.length;i++) {
			System.out.println("Enter " + (i+1)+"element for array 2");
			brr[i]=scan.nextInt();
		}
		System.out.println("array 1 data");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				System.out.print(arr[i]);
				
			}else {
				System.out.print(", "+arr[i]);
			}
		}
		System.out.println("]");
		System.out.println("array 2 data ");
		System.out.print("[");
		for(int i=0;i<brr.length;i++) {
			if(i==0) {
				System.out.print(brr[i]);
				
			}else {
				System.out.print(", "+brr[i]);
			}
		}
		System.out.println("]");
		
		//create object for merge array
		MergeArray mergearr = new MergeArray();
	    //call method to merge 2 arrays
		int[] crr = mergearr.merge2Arrays(arr,brr);
		
		//Traverse resultant array to print its elements
		System.out.println("merged array");
		System.out.print("[");
		for(int i=0;i<crr.length;i++) {
			if(i==0) {
				System.out.print(crr[i]);
				
			}else {
				System.out.print(", "+crr[i]);
			}
		}
		System.out.print("]");
		
	}

}
