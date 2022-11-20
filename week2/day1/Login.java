package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// setup the browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser 
		driver.manage().window().maximize();
	
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		driver.findElement(By.name("submitButton")).click();
		

		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equals("Nandhini")) {
			System.out.println("First name is correct");
		} else {
			System.out.println("First name is incorrect");
		}
		
		// close the browser
		Thread.sleep(2000);
		driver.close();
		
		WebElement ele = driver.findElement(By.id("viewLead_firstName_sp"));
		ele.clear();
		ele.sendKeys("test");
		ele.sendKeys(Keys.TAB);
	}

}


