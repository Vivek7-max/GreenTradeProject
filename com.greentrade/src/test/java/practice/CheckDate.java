package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.WebElement;

public class CheckDate {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat s =new SimpleDateFormat("hh:mm");
		String time = s.format(d);
		System.out.println(time);
		
		System.out.println(LocalDateTime.now().toString());
		WebElement w;
		
	}

}
