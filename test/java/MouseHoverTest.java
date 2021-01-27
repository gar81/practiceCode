import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.MouseActionUtil;

//mousehover using action class

public class MouseHoverTest extends BaseClass
{
	@Test
	public void mouseHover()
	{
		driver.get("https://www.ebay.com/");
		WebElement e= driver.findElement(By.linkText("Electronics"));
		MouseActionUtil.mouseHover(driver, e);

	}

}
