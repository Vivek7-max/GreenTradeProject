package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Assignments {
	/*Find sum of 1st 3 minimum numbers without using BBSort*/
	@Test
	public void sumOfFirstThreeNumbers() {
		int [] a = {1,1,3,2,2,8,14,3,1};
		int min1 = a[0];
		int min2 = a[0];
		int min3 = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<=min1) {
				if (a[i]!=min1) {
					min3 = min2;
					min2= min1;
				}
				min1 = a[i];
			}
			else if (a[i]<=min2 || min2==min1) {
				if (a[i]!=min2) {
					min3 = min2;
				}
				min2 = a[i];
			}
			else if (a[i]<=min3 || min3==min1 || min3==min2) {
				min3 = a[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		int sum = min1+min2+min3;
		System.out.println("sum: "+sum);
	}
	
	/*input - i am sdet engineer*/
	/*output -r ee nign etedsmai*/ 
	@Test
	public void addSpaces() {
		String s = "I am from Maharashtra";
		System.out.println(s);
		ArrayList <Integer>spaces = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				spaces.add(i);
			}
		}
		//System.out.println(spaces);
		String [] arr = s.split(" ");
		String updated = "";
		for (int i = 0; i < arr.length; i++) {
			updated = updated+arr[i];
		}
		//System.out.println(updated);
		String rev = "";
		for (int i = 0; i < updated.length(); i++) {
			rev = updated.charAt(i)+rev;
		}
	//	System.out.println(rev);
		StringBuilder sb = new StringBuilder(rev);
		String ans = "";
		for (Integer position : spaces) {
			for (int i = 0; i < sb.length(); i++) {
				if (i==position) {
					sb.insert(i, ' ');
				}
			}
		}
		System.out.println(sb);
	}
	
	/*Find occurrence*/
	@Test
	public void occurrence() {
		int []  a = {5,3,1,1,2,5,6};
		for (int i = 0; i < a.length; i++) {
			int count =1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(a[i]+" "+count);
			}
		}
	}
	/*Remove duplicate from array*/
	@Test
	public void removeDuplicate() {
		int []  a = {5,3,1,1,2,5,6};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer i : set) {
			System.out.println(i);
		}
	}
	
	
	/*Find factorial of a number*/
	@Test
	public void factorial() {
		int num = 5;
		int prod = 1;
		while(num>0) {
			prod = prod * num;
			num--;
		}
		System.out.println("Factorial of "+num+" is: "+prod);
	}
	
	/* Fibonacci series 0 - 10*/
	@Test
	public void fibonacci() {
		int a =0;
		int b = 1;
		int c =0;
		System.out.println(a);
		System.out.println(b);
		while(c<10) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	/*Check whether given number is prime or not*/
	@Test
	public void primeNumber() {
		int num = 14 ;
		int i = 2;
		int count = 0;
		while (i<num/2) {
			if (num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if (count==1) {
			System.out.println(num+" is not a prime number");
		}else {
			System.out.println(num+" is a prime number");
		}
	}
	
	/*int [] a = {1,3,2,4,5,7,}; find prime numbers in array*/
	@Test
	public void findPrime() {
		int [] a = {1,3,2,4,5,7,};
		for (int i = 0; i < a.length; i++) {
			int j = 2;
			int count = 0;
			while (j<=a[i]/2) {
				if (a[i]%j==0) {
					count++;
					break;
				}
				j++;
			}
			if (count==1) {}else {
				System.out.print(a[i]+" ");
			}
		}
	}
	
	/*print prime numbers form 1 to 10*/
	@Test
	public void primeNumbersSeries() {
		for (int i = 1; i <= 10; i++) {
			int j = 2;
			int count = 0;
			while (j<=i/2) {
				if (i%j==0) {
					count++;
					break;
				}
				j++;
			}
			if (count==1) {}else {
				System.out.print(i+" ");
			}
		}
	}
}