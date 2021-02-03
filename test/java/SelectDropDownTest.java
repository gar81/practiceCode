import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.SelectDropDownUtil;

public class SelectDropDownTest extends BaseClass
{
	@Test
	public void signselectDropdown()
	{
		driver.get("https://www.facebook.com/r.php");
		String monthList = "//select[@id='month']//option";
		WebElement ddelement=driver.findElement(By.xpath(monthList));
//		SelectDropDownUtil.selectd(driver, monthList, "May");
		SelectDropDownUtil.selectDDValue(driver, ddelement, "May");
	}

}
