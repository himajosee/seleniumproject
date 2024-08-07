package selenpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;





public class selencls {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
	
		Thread.sleep(4000);
		
		WebElement enter=driver.findElement(By.id("APjFqb"));
		
		enter.sendKeys("cat");
		
		enter.sendKeys(Keys.ENTER);
		
		
		//driver.findElement(By.name("btnK")).click();
		
		
		
		driver.quit();
	}

}
