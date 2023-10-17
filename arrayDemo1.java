package com.kn.arrayDemo1;

import java.util.Scanner;

public class arrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr;
		//Array creation
		arr=new int[4];
		System.out.println("===> Array Elements Before initialization");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
			 System.out.println("===> Array Elements after initialization");
			for(int i=0;i<arr.length;i++) {
			 arr[i]=10*(i+1);
			 System.out.println(arr[i]);
			}
		
		

	}

}
