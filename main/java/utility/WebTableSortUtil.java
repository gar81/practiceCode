package utility;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableSortUtil
{
	public static void sortedTable(WebDriver driver)
	{

		List<WebElement> list = driver.findElements(By.xpath("(//tr/td)[1]"));
		List<String> originalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println("original list is:" + originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
