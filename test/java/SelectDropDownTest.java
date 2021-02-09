import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.SelectDropDownUtil;

public class SelectDropDownTest extends BaseClass
{
	@Test(enabled=true)
	public void signselectDropdown()
	{
		driver.get("https://www.facebook.com/r.php");
		String monthList = "//select[@id='month']//option";
		WebElement ddelement=driver.findElement(By.xpath(monthList));
//		SelectDropDownUtil.selectd(driver, monthList, "May");
		
		WebElement monthElement=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement dayElement=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement yearElement=driver.findElement(By.xpath("//select[@id='year']"));
		
		SelectDropDownUtil.selectDDValue(driver, monthElement, "May");
		SelectDropDownUtil.selectDDValue(driver, dayElement, "11");
		SelectDropDownUtil.selectDDValue(driver, yearElement, "2020");
	}
	
	
	@Test(enabled=false)
	public void selectDropdown()
	{
		driver.get("https://www.facebook.com/r.php");
		
		
		WebElement monthElement=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement dayElement=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement yearElement=driver.findElement(By.xpath("//select[@id='year']"));
		
		String dob= "10-May-2021";
		String dobArr[]= dob.split("-");
		
		SelectDropDownUtil.selectDDValue(driver, dayElement, "dobArr[0]");
		SelectDropDownUtil.selectDDValue(driver, monthElement, "dobArr[1]");		
		SelectDropDownUtil.selectDDValue(driver, yearElement, "dobArr[2]");
	}
	
	
	
	
	
	
	
	
	
	

}
