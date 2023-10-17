package com.kn.array2D;

import java.util.Scanner;

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Array declaration and creation
		int arr[][] =new int[2][2];
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1) + " element in the 2D array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1) + " elements in 2D array = ");
				arr[i][j]=scan.nextInt();
				
			}
			
		}
		//Array traversing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		//Release the resource
		scan.close();

	}

}
