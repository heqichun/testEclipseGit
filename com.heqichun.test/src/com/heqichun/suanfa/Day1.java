package com.heqichun.suanfa;

public class Day1 {

	public static void main(String[] args) {
		Day1 d = new Day1();
		System.out.println(d.cal(4));
		System.out.println(d.cal1(3));
		System.out.println(d.cal2(4, 4));

	}
	public int cal(int n) {
		int sum = 0;
		int i = 1;
		for(;i<=n;++i) {
			sum +=i;
		}
		return sum;
	}
	public int cal1(int n) {
		int sum = 0;
		int i = 1;
		int j = 1;
		for(;i<=n;++i) {
			j = 1;
			for(;j<=n;++j) {
				sum = sum + i*j;
			}
		}
		return sum;
	}
	
	public int cal2(int n, int m) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i<=n;++i) {
			sum1 += i;
		}
		
		for(int i =1; i<=m;++i) {
			sum2 += i;
		}
		sum = sum1+sum2;
		return sum;
	}

}
