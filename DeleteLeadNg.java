package Week6day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadNg extends BaseClass{

		// TODO Auto-generated method stub
		//4.Delete Lead method
		@Test
		public void deleteLead() throws InterruptedException
		{
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.linkText("Phone")).click();
			driver.findElement(By.name("phoneNumber")).sendKeys("9095326910");
			driver.findElement(By.linkText("Find Leads")).click();
			Thread.sleep(2000);
			String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			System.out.println(text);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.name("id")).sendKeys(text); 
			driver.findElement(By.className("x-btn-text")).click();
			if(driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).isDisplayed())

			{
				System.out.println("no records to display");

			}
			else
			{
				System.out.println("records available");
			}

			System.out.println("Delete lead");
		}

	}
