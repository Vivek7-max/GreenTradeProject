package practice;

import org.testng.annotations.Test;

public class DataProvider {
	@Test(dataProvider = "readData")
	public void execute(String name, String location) {
		System.out.println(name+" "+location);
	}
	@org.testng.annotations.DataProvider
	public Object[][] readData() {
		Object [][] obj = new Object [2] [2];
		obj[0][0] = "Vivek";
		obj[0][1] = "001";
		
		obj[1][0]  = "Rajesh";
		obj[1][1] = "002";
		return obj;
		
	}
}
