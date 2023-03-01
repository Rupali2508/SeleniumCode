package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupal\\Documents\\SeliniumProject\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get(" https://selenium-apps.doselect.in/age-calculator/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("birth_date")).sendKeys("12/01/1998");
	      driver.findElement(By.id("calculate")).click();
	      
	      Thread.sleep(5000);
	     
	      driver.findElement(By.xpath("//*[@id=\"birth_date\"]")).sendKeys("26/02/2000"); 
	      driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();
	}

}
