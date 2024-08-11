package javaPractice;

import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ArrayPrograms {
	@Test
	public void SortArrayAscedingOrderUseBBSort() {
		int [] a = {5,2,1,0,4};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}				
			}
		}
		System.out.println("Sorted Array Asceding Order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted Array Desceding Order : ");
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	/*3. Find 1st minimum number in an array*/
	@Test
	public void FirstMinNumberInArray() {
		int a[] = {0,5,3,8,1};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min = a[i];			
			}
		}
		System.out.println("1st Minimum Number : "+min);
	}
	/* 4. Find 1st maximum number in an array*/
	@Test
	public void FirstMaxNumberInArray() {
		int a[] = {0,5,3,8,1};
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];			
			}
		}
		System.out.println("1st Maximum Number : "+max);
	}

	/* 5. Find 2nd minimum number in an array*/
	@Test
	public void SecondMinNumberInArray() {
		int a[] = {0,5,3,8,1};
		Arrays.sort(a);
		System.out.println("2nd Min: "+a[1]);
	}

	/* 6. Find 2nd maximum number in an array*/
	@Test
	public void SecondMaxNumberInArray() {
		int a[] = {0,5,3,8,1};
		Arrays.sort(a);
		System.out.println("2nd Max: "+a[a.length-2]);
	}

	/* 7. Find the sum of 1st 3 minimum numbers in an array*/
	@Test
	public void SumOfFirstThreeMinNumbers() {
		int a[] = {0,5,3,8,1};
		Arrays.sort(a);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum +a[i];
		}
		System.out.println("SumOfFirstThreeMinNumbers: "+sum);
	}

	/* 8. Find the sum of 1st 3 maximum numbers in an array*/
	@Test
	public void SumOfFirstThreeMaxNumbers() {
		int a[] = {0,5,3,8,1};
		Arrays.sort(a);
		int sum = 0;
		for (int i = a.length-1; i >= a.length-3; i--) {
			sum = sum +a[i];
		}
		System.out.println("SumOfFirstThreeMaxNumbers: "+sum);
	}

	/* 9. Find the multiplication of 1st 3 minimum numbers in an array*/
	@Test
	public void MulOfFirstThreeMinNumbers() {
		int a[] = {5,3,8,1};
		Arrays.sort(a);
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul = mul *a[i];
		}
		System.out.println("MulOfFirstThreeMinNumbers: "+mul);
	}
	/* 10. Find the multiplication of 1st 3 maximum numbers in an array*/
	@Test
	public void MulOfFirstThreeMaxNumbers() {
		int a[] = {0,5,3,8,1};
		Arrays.sort(a);
		int mul = 1;
		for (int i = a.length-1; i >= a.length-3; i--) {
			mul = mul *a[i];
		}
		System.out.println("MulOfFirstThreeMaxNumbers: "+mul);
	}

	/*Find 1st and 2 minimum number without using sort*/
	@Test
	public void FirstAndSecondMinNumber() {
		int a[] = {15,5,15,15,8};
		int min1 = a[0];
		int min2 = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]<=min1) {
				if (a[i]!=min1) {
					min2 = min1;
				}
				min1 = a[i];
			}else if (a[i]<min2 || min1==min2) {
				min2=a[i];
			}
		}
		System.out.println("FirstMinNumber: "+min1);
		System.out.println("SecondMinNumber: "+min2);
	}
	/*Find 1st and 2nd maximum numbers without using sort*/
	@Test
	public void firstAndSecondMaxNumber() {
		int a [] = {0,2,5,4,6};
		int max1 = a[0];
		int max2 = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=max1) {
				if (a[i]!=max1) {
					max2 = max1;
				}
				max1 = a[i];
			}else if (a[i]>max2 || max1 == max2) {
				max2 = a[i];
			}
		}
		System.out.println("FirstMaxNumber: "+max1);
		System.out.println("SecondMaxNumber: "+max2);
	}

	/*Find the sum of first 3 minimum numbers*/
	@Test
	public void sumOfFirstThreeMinNumbers() {
		int a [] = {0,5,3,6,1};
		int sum = 0;
		int min1 = a[0];
		int min2= a[0];
		int min3 = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i]<=min1) {
				if (a[i]!=min1) {
					min3 = min2;
					min2 = min1;
				}
				min1 = a[i];
			}else if (a[i]<=min2 || min2 == min1) {
				min2 = a[i];
			}else if (a[i]<min3 || min3==min2 || min3==min1) {
				min3 = a[i];
			}
		}
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		sum = min1+min2+min3;
		System.out.println(sum);
	}
	/*Append all zeros at the last of the array*/
	@Test
	public void append0sAtLast() {
		int [] a = {0,1,0,-1,0};
		int [] b = new int[a.length];
		int m = 0;
		int n = a.length-1;
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				b[m] = a[i];
				m++;
			}else {
				b[n] = a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

	/*Find all the combinations of numbers which will give sum 11*/
	@Test
	public void findCombinationsOfnumber() {
		int [] a = {9,7,8,5,2,4,3,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] + a[j] ==11) {
					System.out.println(a[i]+" "+a[j]);
					break;
				}
			}
		}
	}

	/*Add two arrays*/
	@Test
	public void addTwoArrays() {
		int [] a = {1,8,2,4};
		int [] b = {3,2,4,1,5};
		int length = a.length;
		if (a.length<b.length) {
			length = b.length;
		}
		int [] c = new int[length];
		for (int i = 0; i <length; i++) {
			try {
				c[i] = a[i] + b[i];
			} catch (Exception e) {
				if (a.length<b.length) {
					c[i] = b[i];
				}else {
					c[i] = a[i];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
	@Test
	public void test() {
		//O/P Required : 1,7,15,31,63
		for (int i = 1; i < 70; i=i*2+1) {
			System.out.print(i+" ");
		}
	}
	/*number of occurrence of element */
	@Test
	public void occurance() {
		int a [] = {1,0,1,0,1,5,3,4,5};
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			System.out.println("Occurace of "+a[i]+": "+count);
		}
	}
}
