package com.kn.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// take input from user 
		System.out.println("Enter rows in array1 ");
		int row1=scan.nextInt();
		System.out.println("Enter cols in array1 ");
		int col1=scan.nextInt();
		int[][] arr =new int[row1][col1];
		System.out.println("Enter rows in array2 ");
		int row2=scan.nextInt();
		System.out.println("Enter cols in array2 ");
		int col2=scan.nextInt();
		int[][] brr =new int[row2][col2];
		System.out.println("Enter elements for array 1");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter elements for array 2");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				brr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<row1;i++) {
			System.out.print("[");
			for(int j=0;j<col1;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("]");
		}
		
		int[][] crr=new int[row1][col2];
		
		for(int i=0;i<row2;i++) {
			System.out.print("[");
			for(int j=0;j<col2;j++) {
				System.out.print(brr[i][j] + " ");
			}
			System.out.println("]");
		}
		
		//Matrix multiplication logic 
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				crr[i][j]=0;
				for(int k=0;k<col1;k++) {
					crr[i][j] += arr[i][k]*brr[k][j]; 
				}
			}
		}
		
		System.out.println("Resultant Matrix = ");
		for(int i=0;i<row1;i++) {
			System.out.print("[");
			for(int j=0;j<col2;j++) {
				System.out.print(crr[i][j] + " ");
			}
			System.out.println("]");
		}
		
		

	}

}
