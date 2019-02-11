package com.heqichun.test;

public class ChaRu {

	public static void main(String[] args) {
		int[] a = {4,5,6,1,3,2};
		int[] newArry = ChaRu.insertionSort(a, a.length);
		for(int i : newArry) {
			System.out.println(i);
		}

	}
	public static int[] insertionSort(int[] a,int n) {
		if(n <= 1) return a;
		for(int i =1;i<n;++i) {
			int value = a[i];
			int j = i-1;
			for(;j>=0;--j) {
				if(a[j]>value) {
					a[j+1] = a[j];
				}else {
					break;
				}
			}
			a[j+1] = value;
		}
		return a;
	}

}
