package selenpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement usrname=driver.findElement(By.id("user-name"));
		
		usrname.sendKeys("standard_user");
		
        WebElement pwd=driver.findElement(By.id("password"));
		
		pwd.sendKeys("secret_sauce");
		
       WebElement loginbtn=driver.findElement(By.id("login-button"));
		
       loginbtn.click();
       
       Thread.sleep(4000);
       
       driver.quit();
		

	}

}
