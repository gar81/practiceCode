import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testBase.BaseClass;
import utility.MouseActionUtil;
import utility.SynchUtil;

public class MouseHoverTestAssignment1 extends BaseClass
{
	@Test(priority=1, enabled=false)
	public void mouseHoverAssign1()
	{
		driver.get("https://demosite.executeautomation.com/index.html");
		
		WebElement element1= driver.findElement(By.xpath("//span[@id='Automation Tools']"));
		WebElement element2 = driver.findElement(By.xpath("//span[@id='Selenium']"));
		WebElement element3= driver.findElement(By.xpath("//span[@id='Selenium WebDriver']"));
		
		//SynchUtil.dynamicwaitforClickabilty(driver,element1, 10);	
		//SynchUtil.dynamicwaitforClickabilty(driver,element2, 20);	
		MouseActionUtil.mouseHoverAndClicknew(driver, element1, element2, element3);

	}
	
	
	@Test(priority=2, enabled= true)
	public void mouseHoverAssign2()
	{
		driver.get("https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/");
		
		WebElement element1= driver.findElement(By.xpath("(//span[text()= 'VIDEOS'])[1]"));
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Paid Selenium Video Tutorial'])[1]"));
		
		
		//SynchUtil.dynamicwaitforClickabilty(driver,element1, 10);	
		//SynchUtil.dynamicwaitforClickabilty(driver,element2, 20);	
		MouseActionUtil.mouseHoverAndClick(driver, element1, element2);

	}
	
	
	
	
	
	
	
	
	
	
	

}
