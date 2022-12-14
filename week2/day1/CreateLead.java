package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {
	public static void main(String[] args) throws   InterruptedException{
		// setup the browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
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
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeaf- Always Ahead");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhinijegan@gmail.com");
		
		WebElement stateTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select aa=new Select(stateTool);
	    aa.selectByVisibleText("Hawaii");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    System.out.println("The Title is: "+driver.getTitle());
		Thread.sleep(2000);
		  driver.close();
		   
		}
		
        
}
