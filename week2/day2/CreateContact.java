package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jeganathan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nandhini");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("TestLeaf-Always Ahead");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nandhinijeyanthi98@gmail.com");
		 WebElement stateTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select st=new Select(stateTool);
		 st.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
	     driver.findElement(By.id("updateLeadForm_description")).clear();
	     driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Best Automation Training");
	     driver.findElement(By.xpath("//input[@value='Update']")).click();
	     System.out.println("The Title is: "+driver.getTitle());
		 Thread.sleep(1000);
		 driver.close();
	}

}
