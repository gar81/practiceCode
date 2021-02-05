import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.DatePickerUtil;

public class DatePickerTestnew extends BaseClass
{
	@Test
	public void datePicker()
	{
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();	
		
		//String date = "2-September-2021";
		String date = "10-January-2020";
		String[] dateArray = date.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		WebElement calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		WebElement calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));		
		
		WebElement monthNext = driver.findElement(By.xpath("//span[text()= 'Next']"));
		WebElement monthPrevious = driver.findElement(By.xpath("//span[text()= 'Prev']"));		
		
		DatePickerUtil.DatePick(driver, calenderMonth, calenderYear, month, year,monthNext);	
		DatePickerUtil.DatePick(driver, calenderMonth, calenderYear, month, year, monthPrevious);	
	}
}
