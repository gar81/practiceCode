package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragnDropinFrameUtil
{
	public static void DragDrop(WebDriver driver, WebElement dragSourceEle, WebElement dropSourceEle)
	{

		Actions action = new Actions(driver);
		action.dragAndDrop(dragSourceEle, dropSourceEle).perform();

	}

}
