package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUsingActionClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/doodles");
		int yAxis=driver.findElement(By.xpath("//a[text()='Peru Independence Day 2023']")).getRect().getY();
		Actions action = new Actions(driver);
		action.scrollByAmount(0, yAxis).perform();
	}
}
