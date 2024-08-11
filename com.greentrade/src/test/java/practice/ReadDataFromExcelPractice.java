package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelPractice {
	public static void main(String[] args) throws Throwable, Throwable {
		String Result = getDataFromExcelBasedTestId("./testdata/TestScriptdata.xlsx", "vendor", "TC_33", "Vendor Name");
		System.out.println(Result);
	}
	public static String getDataFromExcelBasedTestId(String path, String sheetName, String testId, String colHeader) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		int testRowNum = 0;
		
		String actTestId = "";
		String actColHeader = "";
		for (int i = 0; i <= rowCount; i++) {
			actTestId = sheet.getRow(i).getCell(0).toString();
			if (actTestId.equalsIgnoreCase(actTestId)) {
				break;
			}
			testRowNum++;
		}
		System.out.println(testRowNum);
		int testColNum = 0;
		int cellCountTest = sheet.getRow(testRowNum-1).getLastCellNum();
		for (int i = 0; i <= cellCountTest; i++) {
			actColHeader = sheet.getRow(testRowNum-1).getCell(i).toString();
			if (actColHeader.equalsIgnoreCase(colHeader)) {
				break;
			}
			testColNum++;
		}
		String data = sheet.getRow(testRowNum).getCell(testColNum).toString();
		return data;
	}
}
