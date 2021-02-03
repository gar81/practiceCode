package utility;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerUtil
{
	public static void DatePick(WebDriver driver)
	{

		String[] monthNames =
		{ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
				"December" };
		String date = "2-September-2021";
		String[] dateArray = date.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		WebElement calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		WebElement calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));

		String calendermonthText = calenderMonth.getText();
		String calenderyearText = calenderYear.getText();

		int year1Tocompare = Integer.parseInt(calenderyearText);
		int year2Tocompare = Integer.parseInt(year);

		int month1Tocompare = ArrayUtils.indexOf(monthNames, calendermonthText);
		int month2Tocompare = ArrayUtils.indexOf(monthNames, month);

		if (year2Tocompare >= year1Tocompare && month2Tocompare >= month1Tocompare)
		{
			while (true)
			{
				calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
				WebElement monthNext = driver.findElement(By.xpath("//span[text()= 'Next']"));

				if ((calenderMonth.getText().contains(month)) && (calenderYear.getText().contains(year)))
				{
					driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
					break;

				}
				monthNext.click();

			}

		} else if (year2Tocompare <= year1Tocompare && month2Tocompare <= month1Tocompare)
		{

			while (true)
			{
				calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
				WebElement monthPrevious = driver.findElement(By.xpath("//span[text()= 'Prev']"));

				if ((calenderMonth.getText().contains(month)) && (calenderYear.getText().contains(year)))
				{
					driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
					break;

				}
				monthPrevious.click();

			}

		}
	}

}
