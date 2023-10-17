package com.kn.array3D;

import java.util.Scanner;

public class array3DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Array declaration and creation
		int arr[][] []=new int[1][2][3];
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1) + " element in the 3D array");
			for(int j=0;j<arr[i].length;j++) {
				System.out.println((j+1) + " elements in 3D array = ");
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("====>" + (k+1) + " elements in 3d array = ");
					arr[i][j][k]=scan.nextInt();
				}
				
			}
			
		}
		//Array traversing
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			
			}
		}
		//Release the resource
		scan.close();


	}

}
