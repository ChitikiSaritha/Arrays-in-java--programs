package com.kn.arrayDemo3;

import java.util.Scanner;

public class arrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int size=scan.nextInt();
		//Array Declaration
		int[] arr;
		//array creation
		arr=new int[size];
		System.out.println("Enter data for array elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("data within array ");
		//print array elements
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		scan.close();

	}

}
