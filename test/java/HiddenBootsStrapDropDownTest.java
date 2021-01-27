import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.HiddenDropDownUti;
import utility.ValidateDropDownValues;

class HiddenBootsStrapDropDownTest extends BaseClass
{

	@Test(priority = 1, enabled = false)
	public void bootStrap_droDown() throws AWTException
	{
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement state = driver.findElement(By.id("state"));
		HiddenDropDownUti.hiddendropDown(driver, state);
	}

	@Test(priority = 2, enabled = true)
	public void nextList() throws AWTException
	{
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dayDropDown = driver.findElement(By.id("select-demo"));
		String [] values= {"Please select","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		ValidateDropDownValues.validateDropDown(driver, dayDropDown, values);

	}

}
