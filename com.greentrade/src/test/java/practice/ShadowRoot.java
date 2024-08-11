package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowRoot {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		Thread.sleep(20000);
		driver.navigate().to("chrome://downloads/");
		SearchContext FirstEle = driver.findElement(By.tagName("downloads-manager")).getShadowRoot();
		SearchContext secondEle = FirstEle.findElement(By.id("toolbar")).getShadowRoot();
		secondEle.findElement(By.id("moreActions")).click();
		//thirdEle.findElement(By.id("moreActions")).click();
		
	
	}

}
