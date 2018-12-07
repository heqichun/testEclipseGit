package com.heqichun.test;

public class MaoPao {

	public static void main(String[] args) {
		int[] a =  {2,3,5,6,87,564,3,1,54,3,667};
		int temp;
		for(int i =0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i] >a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		for(int i : a) {
			System.out.println(i);
		}

	}

}
