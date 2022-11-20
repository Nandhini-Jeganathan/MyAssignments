package week2.day1;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  
		    //launch the browser
		    ChromeDriver driver=new ChromeDriver();
		    //load the url
		    driver.get("http://leaftaps.com/opentaps/control/main");
		    //maximize the browser window 
		    driver.manage().window().maximize();
		    
		   driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		   
		   driver.findElement(By.id("password")).sendKeys("crmsfa");
		   
		   driver.findElement(By.className("decorativeSubmit")).click();  
		   
		   driver.findElement(By.linkText("CRM/SFA")).click();
		   
		   driver.findElement(By.linkText("Leads")).click();
		   
		   driver.findElement(By.linkText("Create Lead")).click();
		   
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		   
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NANDHINI");
		   
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JEGANATHAN");
		   
		   driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("N");
		   
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		   
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeaf");
		   
		   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhinijegan@gmail.com");
		   
		   WebElement stateTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		   Select aa =new Select(stateTool);
		   aa.selectByVisibleText("Hawaii");
		   
		   driver.findElement(By.className("smallSubmit")).click();
	       //duplicatelead
	       driver.findElement(By.linkText("Duplicate Lead")).click();
	       
	       driver.findElement(By.id("createLeadForm_companyName")).clear();
	       
	       driver.findElement(By.id("createLeadForm_companyName")).sendKeys(" ABC company");
	       
	       driver.findElement(By.id("createLeadForm_firstName")).clear();
	       
	       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hai");
	       
	       driver.findElement(By.className("smallSubmit")).click();
	       
	       System.out.println("The Title is: "+driver.getTitle());
		   Thread.sleep(2000);
		   driver.close();
	}
        
}
