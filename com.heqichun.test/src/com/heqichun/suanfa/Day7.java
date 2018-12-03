package com.heqichun.suanfa;

public class Day7 {

	public static void main(String[] args) {
		char[] a = {'a','b','c'};
		System.out.println(find(a,a.length,'a'));

	}
	//在数组a中，查找key，返回key所在的位置
	//其中，n表示数组a的长度
	public static int find(char[] a,int n,char key) {
		if(a == null || n <=0) {
			return -1;
		}
		int i = 0;
		while(i<n) {
			if(a[i] == key) {
				return i;
			}
			++i;
		}
		return -1;
	}
	public static int find1(char[] a, int n,char key) {
		if(a== null || n <= 0) return -1;
		if(a[n-1] == key) return n-1;
		char tmp = a[n-1];
		a[n-1] =key;
		int i = 0;
		while(a[i] != key) { ++i;}
		a[n-1] = tmp;
		if(i == n-1) {
			return -1;
		}else {
			return i;
		}
	}

}
