package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TakeScreenShotEle {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com");
		String time = LocalDateTime.now().toString().replace(':', '_');
		System.out.println(time);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./testScreenShots"+time+".png");
		FileUtils.copyFile(src, dest);
		System.out.println("Done screen shot of webpage");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File src1 = logo.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		String time1 = LocalDateTime.now().toString().replace(':', '_');
		File dest1 = new File("./testScreenShots"+time1+".png");
		FileUtils.copyFile(src1, dest1);
		System.out.println("Done screenshot of element");
		
	}
}
