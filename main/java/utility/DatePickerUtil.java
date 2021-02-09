package utility;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerUtil
{
	public static void DatePick(WebDriver driver, WebElement calenderMonthEle, WebElement calenderYearEle,
			String dayEle, String monthEle, String yearEle, WebElement NextPreviousEle)
	{

		String[] monthNames =
		{ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
				"December"};

		String calendermonthText = calenderMonthEle.getText();
		String calenderyearText = calenderYearEle.getText();

		int year1Tocompare = Integer.parseInt(calenderyearText);
		int year2Tocompare = Integer.parseInt(yearEle);

		int month1Tocompare = ArrayUtils.indexOf(monthNames, calendermonthText); // CalendermonthToCompare
		int month2Tocompare = ArrayUtils.indexOf(monthNames, monthEle);

		if (year2Tocompare >= year1Tocompare && month2Tocompare >= month1Tocompare)
		{
			while (true)
			{

				if ((calendermonthText.contains(monthEle)) && (calenderyearText.contains(yearEle)))
				{
					driver.findElement(By.xpath("//a[text()='" + dayEle + "']")).click();
					break;

				}
				NextPreviousEle.click(); // click on next btn

			}

		} /*else if (year2Tocompare <= year1Tocompare && month2Tocompare <= month1Tocompare)
		{

			while (true)
			{

				if ((calenderMonthEle.getText().contains(monthEle)) && (calenderYearEle.getText().contains(yearEle)))
				{
					driver.findElement(By.xpath("//a[text()='" + dayEle + "']")).click();
					break;

				}
				NextPreviousEle.click(); // click on previous btn
			}

		}*/
	}
}
