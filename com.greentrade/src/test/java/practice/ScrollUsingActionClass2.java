package practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingActionClass2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for(;;) {
			try {
				WebElement ele = driver.findElement(By.xpath("//a[text()='Peru Independence Day 2023']"));
				System.out.println(ele.getText());
				jse.executeScript("window.scrollTo(ele)");
				System.out.println("scrolled using scrollTo");
				break;
			} catch (Exception e) {
			System.out.println(e);
				jse.executeScript("window.scrollBy(0,500)");
			System.out.println("Scrolled using scrollBy");
			}
		}
	}

}
