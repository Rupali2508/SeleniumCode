package assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rupal\\Documents\\SeliniumProject\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://selenium-apps.doselect.in/change-text/");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("bigger")).click();
	     Thread.sleep(2000);
	      driver.findElement(By.id("smaller")).click();
	      Thread.sleep(2000);
	     driver.findElement(By.id("reset")).click();
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//*[@id=\"bigger\"]")).click();
	     Thread.sleep(2000);
		 
	     driver.findElement(By.xpath("//*[@id=\"smaller\"]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"reset\"]")).click();
	     Thread.sleep(2000);
	     driver.quit();
	  
	}

}
