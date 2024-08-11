package practice;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCondition implements ExpectedCondition<Boolean>{
	String title;
	public MyCondition(String title) {
		this.title = title;
	}
	@Override
	public Boolean apply(WebDriver driver) {
		return driver.getTitle().equals(title);
	}

	@Override
	public String toString() {
		return "Titel is not "+title;
	}
	

}
