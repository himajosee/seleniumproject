package selenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class bms {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.bmsauditing.com/");
		
		driver.manage().window().maximize();
		
		 
		
		
		WebElement audit=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[1]/a/div"));
		
		audit.click();
		
		driver.get("https://www.bmsauditing.com/");
		
         WebElement account=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[2]/a/div"));
		
         account.click();
		
		driver.get("https://www.bmsauditing.com/");
		
		 WebElement business=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[3]/a/div"));
			
		 business.click();
		
		driver.get("https://www.bmsauditing.com/");
		
		WebElement feasibility=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[4]/a/div/h3"));
		
		feasibility.click();
		
		driver.get("https://www.bmsauditing.com/");
		
		
       WebElement vat=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[5]/a/div"));
		
      vat.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement excise=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[6]/a/div"));
		
	  excise.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement corporate=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[7]/a/div"));
		
	  corporate.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement tax=driver.findElement(By.xpath("//*[@id=\"team\"]/div/div/div[2]/div/div/div[8]/a/div"));
		
	  tax.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement mreabt=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/section[4]/div/div/div/div[2]/a"));
		
	  mreabt.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  
	  WebElement remreblog=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div[1]/div/div/div[2]/a"));
		
	  remreblog.click();
		
	  driver.get("https://www.bmsauditing.com/");
	  
	  
	  WebElement name=driver.findElement(By.xpath("//*[@id=\"fullname\"]"));
	  
	 // name.click();	  
	  
	  //Thread.sleep(4000);
	  
	  name.sendKeys("A");
	  
	  WebElement contactno=driver.findElement(By.xpath("//*[@id=\"landline\"]"));
		
	  contactno.sendKeys("123456");
	  
	  Select country=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		
	  country.selectByVisibleText("India");
	  
	  WebElement emailid=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		
	  emailid.sendKeys("a@gmail.com");
	  
	  WebElement msg=driver.findElement(By.xpath("//*[@id=\"message\"]"));
		//msg.click();
	  msg.sendKeys("hiii");
	 
	 
	  
	  
	  //WebElement robotchckbox=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor-label\"]"));
		
	  //robotchckbox.click();
	  
	  WebElement submit=driver.findElement(By.xpath("//*[@id=\"contact_form_btn\"]"));
		
	  submit.click();
	
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement abtus=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[2]/a"));
		
	  abtus.click();
	
	  driver.get("https://www.bmsauditing.com/");
	  
	  WebElement services=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[4]/a"));
		

		Actions action = new Actions(driver);
		
		action.moveToElement(services).perform();
		
		 WebElement audi=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[4]/div/div/div[1]/h4/a"));	
	  		
		 audi.click();
		 
		 driver.get("https://www.bmsauditing.com/");
		 
		 
		 WebElement services1=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[4]/a"));
		 
		 services1.click();
		 
		 driver.get("https://www.bmsauditing.com/");
		 
		 WebElement insights=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[5]/a"));
		 
		 action.moveToElement(insights).perform();
		 
		 WebElement news=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[5]/ul/li[1]/a"));	
	  		
		 news.click();
		 
         WebElement insights1=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[5]/a"));
		 
		 action.moveToElement(insights1).perform();
		 
		 WebElement blogs=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[5]/ul/li[2]/a"));	
	  		
		 blogs.click();
		 
		 WebElement industries=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[6]/a"));	
	  		
		 industries.click();
		 
		 WebElement careers=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[7]/a"));	
	  		
		 careers.click();
		 
		 WebElement contact=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[8]/a"));	
	  		
		 action.moveToElement(contact).perform();
		 
		 WebElement dubai=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[8]/ul/li[1]/a"));	
	  		
		 dubai.click();
		 
		 driver.get("https://www.bmsauditing.com/");
		 
		 WebElement contact1=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[8]/a"));	
	  		
		 action.moveToElement(contact1).perform();
		 
		 WebElement abudhabi=driver.findElement(By.xpath("//*[@id=\"menuzord-right\"]/ul/li[8]/ul/li[2]/a"));	
	  		
		 abudhabi.click();
		 
		 driver.get("https://www.bmsauditing.com/");
		 

	}

}
