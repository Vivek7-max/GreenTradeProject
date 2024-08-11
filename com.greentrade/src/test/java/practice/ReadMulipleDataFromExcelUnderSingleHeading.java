package practice;

import java.io.IOException;

import com.greentrade.genericutility.ExcelUtlity;

public class ReadMulipleDataFromExcelUnderSingleHeading {

	public static void main(String[] args) throws IOException, Throwable {
		ExcelUtlity eLib = new ExcelUtlity();
		String data = eLib.getMultipleDataFromExcelBasedTestId(null, null, null, null);
	}

}
