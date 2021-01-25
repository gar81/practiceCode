
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class FBLoginTest extends BaseClass
{
	@Test
	public void sign()
	{
		signUp("sam", "deny");
	}

	public static void signUp(String firstname, String lastname)
	{
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.xpath("//input[contains(@id, 'u_0_j')]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(lastname);
		driver.findElement(By.id("u_0_10")).click(); // click signup
	}
}
