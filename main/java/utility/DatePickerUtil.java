package utility;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerUtil
{
	public static void DatePick(WebDriver driver, WebElement calenderMonthEle, WebElement calenderYearEle,
			String monthEle, String yearEle, WebElement NextPreviousEle)
	{

		String[] monthNames =
		{ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
				"December" };

		/*
		 * String date = "10-January-2020"; String[] dateArray = date.split("-"); String
		 * day = dateArray[0];
		 */

		String calendermonthText = calenderMonthEle.getText();
		String calenderyearText = calenderYearEle.getText();

		int year1Tocompare = Integer.parseInt(calenderyearText);
		int year2Tocompare = Integer.parseInt(yearEle);

		int month1Tocompare = ArrayUtils.indexOf(monthNames, calendermonthText);
		int month2Tocompare = ArrayUtils.indexOf(monthNames, monthEle);

		if (year2Tocompare >= year1Tocompare && month2Tocompare >= month1Tocompare)
		{
			while (true)
			{
				calenderMonthEle = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				calenderYearEle = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
				// WebElement monthNext = driver.findElement(By.xpath("//span[text()=
				// 'Next']"));

				if ((calenderMonthEle.getText().contains(monthEle)) && (calenderYearEle.getText().contains(yearEle)))
				{
					driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
					break;

				}
				NextPreviousEle.click();

			}

		} else if (year2Tocompare <= year1Tocompare && month2Tocompare <= month1Tocompare)
		{

			while (true)
			{
				calenderMonthEle = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				calenderYearEle = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
				// WebElement monthPrevious = driver.findElement(By.xpath("//span[text()=
				// 'Prev']"));

				if ((calenderMonthEle.getText().contains(monthEle)) && (calenderYearEle.getText().contains(yearEle)))
				{
					driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
					break;

				}
				NextPreviousEle.click();

			}

		}
	}

}
