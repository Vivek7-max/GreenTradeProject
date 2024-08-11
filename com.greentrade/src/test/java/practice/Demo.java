package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://erail.in/");
//		WebElement fromTbx = driver.findElement(By.id("txtStationFrom"));
//		fromTbx.clear();
//		fromTbx.sendKeys("DEL");
//		//Read the data from the drop down and write in file
//		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@title='Denduluru']/../div"));
//		
//		 // Create a new Excel workbook and sheet
//		FileInputStream fis = new FileInputStream("./testdata/demo.xlsx");
//        Workbook workbook = WorkbookFactory.create(fis);
//        Sheet sheet = workbook.getSheet("Sheet1");
//        
//        // Write the drop down options to Excel
//        int rowNum = 0;
//        for (WebElement option : allOptions) {
//            Row row = sheet.createRow(rowNum++);
//            row.createCell(0).setCellValue(option.getText());
//        }
//
//        // Save the workbook to a file
//        String excelFilePath = "./testdata/demo.xlsx";
//        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
//            workbook.write(outputStream);
//            System.out.println("Dropdown options successfully written to Excel!");
//        }catch (IOException e) {
//        	 System.out.println("Issue..!");
//    } finally {
//        workbook.close();
//    }
//		
		//select the date 30 days after from current date
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 30);
		Date date = cal.getTime();
		int rdate = date.getDate();
		int rmonth = date.getMonth();
 		String monthTxt = getMonth(rmonth);
 		System.out.println(monthTxt);
 		driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
 		driver.findElement(By.xpath("//td[contains(text(),'"+monthTxt+"')]/../../descendant::td[text()='"+rdate+"']")).click();
 		System.out.println("Required date is selected in sort date option");
	}
	public static String getMonth(int rmonth) {
		switch (rmonth) {
		case 0:
			return "Jan";
		case 1:
			return "Feb";
		case 2:
			return "Mar";
		case 3:
			return "Apr";
		case 4:
			return "May";
		case 5:
			return "Jun";
		case 6:
			return "Jul";
		case 7:
			return "Aug";
		case 8:
			return "Sep";
		case 9:
			return "Oct";
		case 10:
			return "Nov";
		case 11:
			return "Dec";
		}
		return null;
	}
}
