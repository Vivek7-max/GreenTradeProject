package practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInitializer {
	int i = meth1();
	int meth1() {
		System.out.println("Hi");
		return 99;
	}
	public static void main(String[] args) {
		new TestInitializer().meth1();
		System.out.println(new TestInitializer().i);
		
		
	}
}
