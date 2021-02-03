import org.openqa.selenium.By;
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
		
		DatePickerUtil.DatePick(driver);	
		
	}
}
