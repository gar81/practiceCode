import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.WindowPopUpUtil;

public class BrowserTabsPopUpTest extends BaseClass
{
	@Test
	public void windowPopup() throws InterruptedException
	{   
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.findElement(By.xpath("//a[contains(@href, 'http://www.google.com')]")).click();		
		WindowPopUpUtil.winPopUp(driver);
	}

}
