package javaPractice;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;
import org.testng.reporters.jq.ChronologicalPanel;

public class StringPrograms {
	@Test
	public void reverseString() {
//		String s = "software";
//		String ans = "";
//		for (int i = 0; i < s.length(); i++) {
//			ans=s.charAt(i)+ans;
//		}
//		System.out.println(ans);
		//2
//		String t = "software";
//		char[] str = t.toCharArray();
//		for (int i = str.length-1; i >=0; i--) {
//			System.out.println(str[i]);
//		}
		//3
//		String u = "software";
//		for (int i = u.length()-1; i >=0; i--) {
//			System.out.print(u.charAt(i));
//		}
		//4
//		String u = "software";
//		char [] st = u.toCharArray();
//		int count=0;
//		for (char c : st) {
//			count++;
//		}
//		for(int i=count-1;i>=0;i--) {
//			System.out.print(st[i]);
//		}
		//5
		String s = "software";
		StringBuilder st = new StringBuilder(s);
		System.out.println(st.reverse());	
	}
	/*Check weather string is palyndrome or not*/
	@Test
	public void stirngPalyndrome() {
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String s = sc.next();
			String rev = "";
			for (int i = 0; i < s.length(); i++) {
				rev = s.charAt(i)+rev;
			}
			System.out.println("Reversed Stirng: "+rev);
			if (s.equals(rev)) {
				System.out.println("Stirng is pallendrome");
			}else {
				System.out.println("Stirng is not pallendrome");
			}
		}
		
	}
	/*Remove duplicate characters form the string*/
	@Test
	public void removeDuplicates() {
		String s = "Kannada";
		String ans = "";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			ans = ans + ch;
		}
		System.out.println(ans);
	}
	
	/*Print the occurrence of each character in string*/
	@Test
	public void occurrence() {
		String s = "Kannada";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) {
//			int count = 0;
//			for (int i = 0; i < s.length(); i++) {
//				if (ch==s.charAt(i)) {
//					count++;
//				}
//			}
//			System.out.println("Occurance of "+ch+" is: "+count);
//		}
		//Using Map
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i+1);
		}
		for (Character m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (m==s.charAt(i)) {
					count++;
				}
			}
			System.out.println("Occurance of "+m+" is: "+count);
		}
	}
	
	/*Print duplicate characters with count */
	@Test
	public void duplicatesWithCount() {
		String s = "Malayalam";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) {
//			int count = 0;
//			for (int i = 0; i < s.length(); i++) {
//				if (ch==s.charAt(i)) {
//					count++;
//				}
//			}
//			if (count>1) {
//				System.out.println("Occurance of "+ch+" is: "+count);
//			}
//		}
		//Using Map
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i+1);
		}
		for (Character ch : map.keySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i)) {
					count++;
				}
			}
			if (count>1) {
				System.out.println("Occurance of "+ch+" is: "+count);
			}
		}
	}
	
	/*Print position of each character*/
	@Test
	public void positon() {
		String s = "Kannada";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+" is present at "+(i+1)+" position");  
		}
	}
	
	/*Print position of each character without duplicates*/
	@Test
	public void positionWithoutDuplicates() {
		//1
//		String s = "Kannada"; //O/P => k=1, a=2, n=3, d=6
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) {
//			System.out.println(ch+" is present at "+(s.indexOf(ch)+1)+" position");
//		}
		//2
		String s = "Kannada";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) {
//			for (int i = 0; i < s.length(); i++) {
//				if (ch==s.charAt(i)) {
//					System.out.println(s.charAt(i)+" is present at "+(i+1)+" position");
//					break;
//				}
//			}
//			
//		}
		//3 Using Map
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i+1);
		}
		for (Character ch : map.keySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch==s.charAt(i)) {
					System.out.println(s.charAt(i)+" is present at "+(i+1)+" position");
					break;
				}
			}
		}
		
	}
	/*Print the position of each character without duplicate*/
	@Test
	public void positionWithoutDuplicates1() {
		String s = "Kannada"; //O/P => k=1, a=7, n=4, d=6
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		for (Character ch : set) {
//			for (int i = s.length()-1; i >=0; i--) {
//				if (ch==s.charAt(i)) {
//					System.out.println(s.charAt(i)+" is present at "+(i+1)+" position");
//					break;
//				}
//			}
//		}
		//Using Map
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), i+1);
		}
		for (Character ch : map.keySet()) {
			for (int i = s.length()-1; i >= 0; i--) {
				if (ch==s.charAt(i)) {
					System.out.println(s.charAt(i)+" is present at "+(i+1)+" position");
					break;
				}
			}
		}
	}
	/*Reverse the sentence*/
	@Test
	public void reverseSenten() {
		String s = "All the best"; 
		//o/p => tseb eht llA
//		String rev = "";
//		for (int i = 0; i < s.length(); i++) {
//			rev = s.charAt(i)+rev;
//		}
//		System.out.println(rev);
		
		//O/p => best the All
//		String[] arr = s.split(" ");
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.print(arr[i]+" ");
//		}
		
		//O/P => llA eht tseb
		String [] arr = s.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
			String rev = "";
			for (int j = 0; j < arr[i].length(); j++) {
				rev = arr[i].charAt(j)+rev;
			}
			ans = ans + rev+" ";
		}
		System.out.println(ans);
	}
	
	
	/*swap the first and last word of a string*/
	@Test
	public void swapFirstAndLast() {
		String s = "All the best do good";
		//o/p => good the best do All
		String[] str = s.split(" ");
		String temp = str[0];
		str[0] = str[str.length-1];
		str[str.length-1] = temp;
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+" ");
		}
	}
	
	/*swap string without extra variable*/
	public void swapString() {
		String s1 = "Vivek";
		String s2 = "Rajesh";
		
		s1 = s1+s2;
		s1 = s1.substring(0,s1.length()-s2.length());
		s2 = s1.substring(0);
	}
	/*Remove spaces between the string*/
	@Test
	public void removeSpaces() {
		String s = "All the best";
		String [] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}
	
	/*Remove duplicate words from the string*/
	@Test
	public void removeDuplicateWords() {
		String str = "My name My name is Vivek";
		String [] arr = str.split(" ");
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		for (String string : set) {
//			System.out.print(string+" ");
//		}
		//Using Map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		for (String string : map.keySet()) {
			System.out.print(string+" ");
		}
	}
	
	/*Print the occurrence of each word in string*/
	@Test
	public void occurrenceOfWord() {
		String str = "His name is vivek vivek is java trainer";
		String [] arr = str.split("\\s+");
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		for (String s : set) {
//			int count = 0;
//			for (int i = 0; i < arr.length; i++) {
//				if (s.equals(arr[i])) {
//					count++;
//				}
//			}
//			System.out.println("Occurance of "+s+": "+count);
//		}
		//Using Map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		for (String m : map.keySet()) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (m.equals(arr[i])) {
					count++;
				}
			}
			System.out.println("Occurance of "+m+": "+count);
		}
	}
	
	/*Print duplicate words with count */
	@Test
	public void duplicateWordsWithCount() {
		String str = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String [] arr = str.split("\\s+");
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		for (String ch : set) {
//			int count = 0;
//			for (int i = 0; i < arr.length; i++) {
//				if (ch.equals(arr[i])) {
//					count++;
//				}
//			}
//			if (count>1) {
//				System.out.println("Occurance of "+ch+" is: "+count);
//			}
//		}
		//Using Map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		for (String ch : map.keySet()) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (ch.equals(arr[i])) {
					count++;
				}
			}
			if (count>1) {
				System.out.println("Occurance of "+ch+" is: "+count);
			}
		}
	}
	/*Print position of each word without duplicates*/
	@Test
	public void positionOfWordWithoutDuplicates() {
		//1
		String str = "His name is vivek vivek is java trainer";
		String arr [] = str.split("\\s+");
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		for (String ch : set) {
//			for(int i = 0; i<str.length(); i++) {
//				if (ch.equals(arr[i])) {
//					System.out.println(ch+" is present at "+(i+1)+" position");
//					break;
//				}
//			}
//		}
		
		//2 Using Map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		for (String ch : map.keySet()) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (ch==arr[i]) {
					System.out.println(ch+" is present at "+(i+1)+" position");
					break;
				}
			}
		}
	}
	
	/*Print the position of each character without duplicate*/
	@Test
	public void positionOfWordWithoutDuplicates1() {
		String str = "His name is vivek vivek is java trainer";
		String arr [] = str.split("\\s+");
//		LinkedHashSet<String> set = new LinkedHashSet<String>();
//		for (int i = 0; i < arr.length; i++) {
//			set.add(arr[i]);
//		}
//		for (String ch : set) {
//			for (int i = arr.length-1; i >=0; i--) {
//				if (ch.equals(arr[i])) {
//					System.out.println(ch+" is present at "+(i+1)+" position");
//					break;
//				}
//			}
//		}
		//Using Map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i+1);
		}
		for (String ch : map.keySet()) {
			for (int i = arr.length-1; i >= 0; i--) {
				if (ch.equals(arr[i])) {
					System.out.println(ch+" is present at "+(i+1)+" position");
					break;
				}
			}
		}
	}
	/*Count and Remove vowels from the given string*/
	@Test
	public void removeVowels() {
		String s = "Bengalore is metro city";
		ArrayList <Character>vowels = new ArrayList<Character>();
		ArrayList <Character>nvowels = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
				ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels.add(ch);
			}else {
				nvowels.add(ch);
			}
		}
		System.out.println("no. of vowels: "+vowels.size());
		for (Character ch : nvowels) {
			System.out.print(ch);
		}
	}
	/*Count vowels without duplicates*/
	@Test
	public void countVowelsWithoutDuplicates() {
		String s = "India";
		String str = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				set.add(str.charAt(i));
			}
		}
		System.out.println(set);
		System.out.println(set.size());
			
		}
	/*Occurrence of vowel in the string*/
	@Test
	public void occurrenceOfvowels() {
		String s = "India is my country";
		String v = "aeiouAEIOU";
		char [] ch = v.toCharArray();
		for (char c : ch) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (c==s.charAt(i)) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(c+" "+count);
			}		
		}
	}
	
	/*find the minimum length string from the string array*/
	@Test
	public void minLengthString() {
		String [] s = {"ab", "abc", "bd", "abcd", "abcde"};
		String minLStr = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()<minLStr.length()) {
				minLStr = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==minLStr.length()) {
				System.out.println(s[i]+" ");
			}
		}
	}
	/*max length string*/
	@Test
	public void maxLengthString() {
		String [] s = {"ab", "abc", "bd", "abcd", "abcde"};
		String maxLStr = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>maxLStr.length()) {
				maxLStr = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==maxLStr.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	/*Find the sum of digits in a string*/
	@Test
	public void findSumOfDigits() {
		String s = "Vivek@55.55.com"; //OP=> 5+5+5+5=>20
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char  ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum+Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}
	
	
	/*Find the sum of two digits in a string*/
	@Test
	public void findSumOfTwoDigits() {
		String s = "Vivek@100.55.com";//OP=> 100+55 => 110
		int sum = 0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) {
			char  ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				tsum = tsum*10+Character.getNumericValue(ch);
			}else {
				sum = sum + tsum;
				tsum=0;
			}
		}
		sum = sum + tsum;
		System.out.println(sum);
	}
	/*segregate alphanumeric and special characters*/
	@Test
	public void alphaNumericAndSpecialCharSegragate() {
		String s = "1b2%a3(t"; //OP=> 123 bat %(
		String num = "";
		String alpha ="";
		String sp = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num = num + s.charAt(i);
			}else if (Character.isAlphabetic(ch)) {
				alpha = alpha + s.charAt(i);
			}else {
				sp = sp+s.charAt(i);
			}
		}
		System.out.println(num+" "+alpha+" "+sp);
		
	}
	@Test
	public void maxAndMinCharacter() {
		String s = "abcda";
		//Create int [] equals to length of string
		int [] frequency = new int[s.length()];
		//convert string to char []
		char [] charArr = s.toCharArray();
		//count each character and store in frequency array
		for (int i = 0; i < charArr.length; i++) {
			frequency[i] = 1;
			for (int j = i+1; j < charArr.length; j++) {
				if (charArr[i]==charArr[j] && charArr[i]!='0') {
					frequency[i]++;
					charArr[j]='0';
				}
				
			}
		}
		int min = frequency[0];
		char minChar = charArr[0];
		int max = frequency[0];
		char maxChar = charArr[0];
		
		for (int i = 0; i < charArr.length; i++) {
			if (frequency[i]<min && frequency[i]!='0') {
				min = frequency[i];
				minChar=charArr[i];
			}
			if (frequency[i]>max) {
				max = frequency[i];
				maxChar = charArr[i];
			}
			
		}
		System.out.println("minChar: "+minChar);
		System.out.println("maxChar: "+maxChar);
		
	}
	
}
