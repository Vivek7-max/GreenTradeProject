package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot2 {

	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		SearchContext shadow1 = driver.findElement(By.tagName("book-app")).getShadowRoot();
		shadow1.findElement(By.cssSelector("app-header[effects='waterfall']")).findElement(By.cssSelector("app-toolbar[class='toolbar-bottom']")).findElement(By.tagName("book-input-decorator")).findElement(By.id("input")).sendKeys("Vivek");
		
	}
	

}
