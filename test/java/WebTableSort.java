import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class WebTableSort extends BaseClass
{

	@Test
	public void webSort() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		
		List<WebElement> list= driver.findElements(By.xpath("(//tr/td)[1]"));
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			
		}*/
		
		List<String> originalList= list.stream().map(s-> s.getText()).collect(Collectors.toList());
		System.out.println("original list is:" +originalList);
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
		
		
	}
}
