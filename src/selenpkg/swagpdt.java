package selenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagpdt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");
		
		WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("A");
		
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("B");
		
		WebElement pcode=driver.findElement(By.id("postal-code"));
		pcode.sendKeys("68003");
		
		
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		
	}

}
