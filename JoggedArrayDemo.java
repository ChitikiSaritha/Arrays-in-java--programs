package com.kn.joggedArray;

import java.util.Scanner;

public class JoggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		//Array declaration and creation
		int arr[][] =new int[scan.nextInt()][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		arr[4]=new int[2];
		
		
		
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1) + " element in the array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1) + " elements in array = ");
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
