package com.kn.mergearray;

public class MergeArray {

	public int[] merge2Arrays(int[] arr, int[] brr) {
		// TODO Auto-generated method stub
		int[] crr = new int[arr.length + brr.length];
		int j=0;
		for(int i=0;i<crr.length;i++) {
			if(i>=0 && i<arr.length) {
				crr[i]=arr[i];
			}else {
				crr[i]=brr[j];
				j++;
			}
		}
		return crr;
		
	}

}
