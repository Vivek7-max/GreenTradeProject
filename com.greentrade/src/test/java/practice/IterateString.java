package practice;

import java.text.StringCharacterIterator;
import java.util.Iterator;

public class IterateString {
	public static void main(String[] args) {
		String s = "Vivek";
		String ans = "";
		StringCharacterIterator sci = new StringCharacterIterator(s);
		System.out.println(sci.getEndIndex());
		System.out.println(sci.getBeginIndex());
		for (int i = sci.getEndIndex(); i >=sci.getBeginIndex(); i--) {
			ans = ans+sci.next();
		}
		System.out.println(ans);
	}
}
