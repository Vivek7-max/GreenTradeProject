package javaPractice;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Patterns {
	              /*
	 * * * * *
	 * * * * *
	 * * * * *
	 * * * * *
	              */
	@Test
	public void p1() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	             /*
	 * 
	 * *
	 * * *
	 * * * *
	 * * * * *
	             */
	@Test
	public void p2() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	                    /*
	   * * * * * 
	   * * * * 
	   * * * 
	   * * 
	   *
	                   */
	@Test
	public void p3() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j>=i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	       /*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 	 
	       */
	@Test
	public void p4() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j>=n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	               /*
	 * * * * * 
      * * * * 
       * * * 
        * * 
         * 
	                */
	@Test
	public void p7() {
		int n = 5;
		for (int i =0; i<n; i++) 
		{
			for (int j = 0; j<n; j++) {
				if (i<=j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//Or		for(int i=1; i<=n; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = i; j<=n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
	/*
	 1 1 1 1 1
	 1 1 1 1 1
	 1 1 1 1 1
	 1 1 1 1 1 
	 1 1 1 1 1
	 */
	@Test
	public void q1() {
		int n = 5;
		int num = 1;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	/*
	 1 2 3 4 5 
	 1 2 3 4 5
	 1 2 3 4 5
	 1 2 3 4 5
	 1 2 3 4 5
	 */
	@Test
	public void q2() {
		int n = 5;
		for(int i = 0; i<n; i++) {
			int num = 1;
			for (int j = 0; j < n; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
	
	/*
	 1 1 1 1 1
	 2 2 2 2 2
	 3 3 3 3 3
	 4 4 4 4 4
	 5 5 5 5 5
	 */
	@Test
	public void q3() {
		int n = 5;
		int num = 1;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num +" ");
			}
			num++;
			System.out.println();
		}
	}
	
	/*
	 1
	 2 2
	 3 3 3
	 4 4 4 4
	 5 5 5 5 5
	 */
	@Test
	public void q4() {
		int n = 5;
		int num = 1;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(num +" ");
				}else {
					System.out.print("  ");
				}
			}
			num++;
			System.out.println();
		}
	}
	/*
	 5 5 5 5 5
	 4 4 4 4
	 3 3 3
	 2 2 
	 1
	 */
	@Test
	public void q5() {
		int n = 5;
		int num = 5;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j<=n-1) {
					System.out.print(num +" ");
				}else {
					System.out.print("  ");
				}
			}
			num--;
			System.out.println();
		}
	}
	
	/*  
	     1
	    2 2 
	   3 3 3
	  4 4 4 4
	 5 5 5 5 5 
	 */
	@Test
	public void q6() {
		int n = 5;
		int num = 1;
		for (int i =0; i<n; i++) 
		{
			for (int j = 0; j<n; j++) {
				if (i+j>=n-1) {
					System.out.print(num+" ");
				}else {
					System.out.print(" ");
				}
			}
			num++;
			System.out.println();
		}
	}
	/*
	 1
	 2 3
	 4 5 6
	 7 8 9 1
	 2 3 4 5 6
	 */
	@Test
	public void q7() {
		int n = 5;
		int num = 1;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print(num++ +" ");
					if (num>9) {
						num = 1;
					}
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
	/*
	 A B C D E
	 F G H I J 
	 K L M N O
	 P Q R S T
	 U V W X Y 
	 */
	@Test
	public void q8() {
		int n = 5;
		char ch = 'A';
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	/*
	   A A A A A
	   B B B B B
	   C C C C C
	   D D D D D
	 */
	@Test
	public void q9() {
		int n = 5;
		char ch = 'A';
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ch +" ");
			}
			ch++;
			System.out.println();
		}
	}
	/*
	 A B C D E
	 A B C D E
	 A B C D E
	 A B C D E
	 A B C D E
	 */
	@Test
	public void q10() {
		int n = 5;
		
		for(int i = 0; i<n; i++) {
			char ch = 'A';
			for (int j = 0; j < n; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	/* 
	  
	         *
	       * * *
	     * * * * *    
	   * * * * * * * 
	 * * * * * * * * * 
	                      */
	@Test
	public void q11() {
		int n = 5;
		char ch = 1;
		int sp = 3;
		for(int i = 0; i<n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < ch; j++) {
				System.out.print("* ");
			}
			ch+=2;
			sp--;
			System.out.println();
		}
	}
}

