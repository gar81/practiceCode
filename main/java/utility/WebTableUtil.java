package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtil
{
	public static void webTable(WebDriver driver)
	{

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("total rows in web table :" + rowCount);

		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";

		for (int i = 2; i <= rowCount; i++)
		{
			String actualxpath = beforeXpath + i + afterXpath;
			WebElement ele = driver.findElement(By.xpath(actualxpath));
			System.out.println(ele.getText());
			if (ele.getText().equals("Island Trading"))
			{
				System.out.println("company name :" + ele.getText() + " is found" + "at position: " + (i - 1));
				break;
			}

		} // *[@id="customers"]/tbody/tr[2]/td[1]

	}

	public static void webTablecols(WebDriver driver)
	{

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th"));
		int colCount = cols.size();
		System.out.println("total rows in web table :" + colCount);

		String beforeXpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String afterXpath = "]";

		for (int i = 2; i <= colCount; i++)
		{
			String actualxpath = beforeXpath + i + afterXpath;
			WebElement ele1 = driver.findElement(By.xpath(actualxpath));
			String colText = ele1.getText();
			System.out.println("col values are :" + colText);

		}

	}

}
