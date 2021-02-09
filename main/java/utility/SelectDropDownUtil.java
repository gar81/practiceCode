package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownUtil
{
	public static void selectBootStrapDD(WebDriver driver, String monthXpath, String Value)
	{
		List<WebElement> montList = driver.findElements(By.xpath(monthXpath));
		System.out.println(montList.size());

		for (int i = 0; i < montList.size(); i++)
		{
			System.out.println(montList.get(i).getText());
			if (montList.get(i).getText().equalsIgnoreCase(Value))
			{
				montList.get(i).click();
				break;
			}
		}

	}
	
	public static void selectDDValue(WebDriver driver, WebElement element, String value)
	{
		Select dropDown=new Select(element);
		dropDown.selectByVisibleText(value);
		System.out.println(dropDown.isMultiple());
	}
}
