package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {
	public static void main(String[] args) {
		// setup the browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser 
		driver.manage().window().maximize();
	
	
        driver.findElement(By.id("Username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("Password")).sendKeys("crmsfa");
        driver.findElement(By.className("decporativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_CompanyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_FirstName")).sendKeys("Nandhini");
        driver.findElement(By.id("createLeadForm_LastName")).sendKeys("J");
        driver.findElement(By.id("createLeadForm_FirstName(Local)")).sendKeys("Nandhini");
		driver.findElement(By.name("Department")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_Description")).sendKeys("TestLeaf- Always Ahead");
		driver.findElement(By.id("createLeadForm_Email address")).sendKeys("nandhinijeyanthi98@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ss = new Select(State);
		ss.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_Description")).clear();
		driver.findElement(By.id("updateLeadForm_ImportantNote")).sendKeys("TestLeaf provides quality Test Automation training");
		driver.findElement(By.name("submitButton")).click();
		//String title = driver.getTitle();
		System.out.println("The Title is :" +driver.getTitle());
		}
}
