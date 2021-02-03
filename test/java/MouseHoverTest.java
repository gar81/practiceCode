import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.MouseActionUtil;
import utility.SynchUtil;

//mousehover using action class

public class MouseHoverTest extends BaseClass
{
	@Test
	public void mouseHover()
	{
		driver.get("https://www.ebay.com/");
		
		WebElement e= driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		WebElement newEle = driver.findElement(By.xpath("//a[text()='Smart Watches']"));
		SynchUtil.dynamicwaitforClickabilty(driver, e, 10);
//		SynchUtil.dynamicwaitforClickabilty(driver, newEle, 5000);
//		MouseActionUtil.mouseHover(driver, e);
		MouseActionUtil.mouseHoverAndClick(driver, e, newEle);

	}

}
