import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.DragnDropinFrameUtil;
import utility.iFrameUtil;

public class DragnDropiniframeTest extends BaseClass
{

	@Test
	public void dragNdrop()
	{
		driver.get("https://jqueryui.com/droppable/");
		WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		iFrameUtil.frame(driver, iFrame);

		WebElement dragSource = driver.findElement(By.id("draggable"));
		WebElement dropSource = driver.findElement(By.id("droppable"));

		DragnDropinFrameUtil.DragDrop(driver, dragSource, dropSource);

	}

}
