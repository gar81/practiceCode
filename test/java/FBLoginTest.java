
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.FBLoginUtil;

public class FBLoginTest extends BaseClass
{
	@Test
	public void sign()
	{
		driver.get("https://www.facebook.com/r.php");
		
		String firstName = "//input[@name='firstname']";		
		WebElement firnameWebElemnet = driver.findElement(By.xpath(firstName)); // click signup
        FBLoginUtil.signUp(driver, firnameWebElemnet, "Sam");
		
		
	}

}
