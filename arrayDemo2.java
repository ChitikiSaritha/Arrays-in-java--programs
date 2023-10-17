package com.kn.arrayDemo2;

import java.util.Scanner;

public class arrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Array declaration
		int[] arr;
		//Array creation
		arr=new int[4];
		System.out.println("===> Array Elements Before initialization");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
			 System.out.println("===> Array Elements after initialization");
			 System.out.println(arr[0]);
			 System.out.println(arr[1]);
			 System.out.println(arr[2]);
			 System.out.println(arr[3]);
		
		

	}

}
