import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class WebTableAssigmntTest extends BaseClass
{

	@Test()
	public void webTable()
	{

		driver.get("file:///D:/DhirajSirTasks/NewIndex.html");
		String text = "Cognizant";
		driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]//preceding-sibling::td//input[@type='checkbox']")).click();

	}

}
