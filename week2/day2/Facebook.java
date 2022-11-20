package week2.day2;
import java.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  
		//launch the browser
	      ChromeDriver driver=new ChromeDriver();
		 
		 //load the url
		 driver.get("https://en-gb.facebook.com/");
		 
		 //maximize the browser window 
		 driver.manage().window().maximize();
		 
		  //Implicit Wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 driver.findElement(By.linkText("Create New Account")).click();
			 driver.findElement(By.name("firstname")).sendKeys("Nandhini");
			 driver.findElement(By.name("lastname")).sendKeys("Jeganathan");
			 driver.findElement(By.name("mobile number")).sendKeys("9943786000");
	         driver.findElement(By.name("password")).sendKeys("Nandhu@02");
			 
			 WebElement sd = driver.findElement(By.id(" Select Day"));
			 Select SelectDay=new Select(sd);
			 SelectDay.selectByValue("2");
			 sd.sendKeys(Keys.TAB);
			 WebElement sm = driver.findElement(By.id(" Select Month"));
			 Select SelectMonth=new Select(sm);
			 SelectMonth.selectByValue("August");
			 sm.sendKeys(Keys.TAB);
			 WebElement sy = driver.findElement(By.id("Select Year"));
			 Select SelectYear=new Select(sy);
			 SelectYear.selectByValue("1998");
			 sy.sendKeys(Keys.TAB);
			 
			 driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			 Thread.sleep(1000);
			 driver.close();
	}
}



