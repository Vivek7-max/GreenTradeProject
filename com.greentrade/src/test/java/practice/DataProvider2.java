package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@Test(dataProvider = "getData")
	public void execution(String empName, String empId) {
		System.out.println(empName+" "+empId);
	}
	@DataProvider
	public Object[][] getData(){
		Object [] [] obj = new Object[2][2];
		obj[0][0] = "Vivek";
		obj[0][1] = "INF001";
		
		obj[1][0] = "Rahul";
		obj[1][1] = "INF005";
		return obj;
	}
}
