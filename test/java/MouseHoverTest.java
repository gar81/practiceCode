import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testBase.BaseClass;

//mousehover using action class

public class MouseHoverTest extends BaseClass
{
	@Test
	public void mouseHover()
	{
		driver.get("https://www.ebay.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();

		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText("Smart Watches")));

		action.moveToElement(driver.findElement(By.linkText("Smart Watches")));
		action.click().build().perform();

	}

}
