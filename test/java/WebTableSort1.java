
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.WebTableSortUtil;

public class WebTableSort1 extends BaseClass
{
	@Test
	public void webSort()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();

		WebTableSortUtil.sortedTable(driver);

	}
}
