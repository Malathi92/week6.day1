package Week6day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadNG extends BaseClass {
	
//	3.Duplicate Lead
	@Test
	public void duplicateLead() throws InterruptedException
	{
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String r=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='Babu']")).getText();
	System.out.println(r);
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[text()='Babu']")).click();
	String n=driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(n);
	driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	System.out.println("the title is: "+driver.getTitle());
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	String m=driver.findElement(By.id("viewLead_companyName_sp")).getText();

	System.out.println(m);
	if(n.equals(m))
	{
		System.out.println("duplicate record having same name as actual record");
	}
	else
	{
		System.out.println("record names are different");
	}
	System.out.println("duplicate Lead");
	}
}