package Week6day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadNG extends BaseClass {

//	2.Edit Lead method
	@Test
	public void editLead() throws InterruptedException
	{
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("babu");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	System.out.println("the title is:"+driver.getTitle());
	driver.findElement(By.xpath("//a[text()='Qualify Lead']/following-sibling::a")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("wipro");
	driver.findElement(By.name("submitButton")).click();
	WebElement s=driver.findElement(By.id("viewLead_companyName_sp"));
	System.out.println("the changed name is:"+s.getText());
	System.out.println("Edit lead");
	}
}