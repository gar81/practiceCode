package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActionUtil
{
	public static void mouseHover(WebDriver driver, WebElement element)
	{

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

		WebElement newEle = driver.findElement(By.linkText("Smart Watches"));
		SynchUtil.dynamicwaitforVisivibilty(driver, newEle, 500);// wait method call here.

		action.moveToElement(newEle);
		action.click().build().perform();
	}

}
