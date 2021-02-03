import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class DatePickerTest extends BaseClass
{
	
	@Test
	public void datePicker()
	{
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		
		String[] monthNames= {"January",  "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String date= "2-September-2021";
		String[] dateArray= date.split("-");
		String day= dateArray[0];
		String month= dateArray[1];
		String year= dateArray[2];
		
		WebElement calenderMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		WebElement calenderYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		
		String monthText= calenderMonth.getText();
		String yearText= calenderYear.getText();		
		
		int year1Tocompare= Integer.parseInt(yearText);
		int year2Tocompare= Integer.parseInt(year);
		
		int month1Tocompare=ArrayUtils.indexOf(monthNames,monthText );
		int month2Tocompare=ArrayUtils.indexOf(monthNames,month);
		
		if(year2Tocompare>= year1Tocompare && month2Tocompare>= month1Tocompare) 
		{
			while(true)
			{
				 calenderMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				 calenderYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
				 WebElement monthNext= driver.findElement(By.xpath("//span[text()= 'Next']"));
				 
				 if((calenderMonth.getText().contains(month)) && (calenderYear.getText().contains(year))) 
				 {
					driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
					 break;				 
					 
				 }
				 monthNext.click();		 
				
			}
			
		}
		
		
		
		
		
		
		
	}
}
