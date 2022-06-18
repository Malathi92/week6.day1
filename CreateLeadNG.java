package Week6day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadNG extends BaseClass {
//	1.create lead method
	@Test
	public void createLead() throws InterruptedException
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MALATHI");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("E");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("LocalName");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CORE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Grow with leaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("emalathi21@gmail.com");
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select obj=new Select(ele);
		Thread.sleep(2000);
		obj.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("the title is "+driver.getTitle());
		System.out.println("Create Lead");
	}
}