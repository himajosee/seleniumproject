package selenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagcomplete {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		WebElement usrname=driver.findElement(By.id("user-name"));
		
		usrname.sendKeys("standard_user");
		
        WebElement pwd=driver.findElement(By.id("password"));
		
		pwd.sendKeys("secret_sauce");
		
       WebElement loginbtn=driver.findElement(By.id("login-button"));
		
       loginbtn.click();
       
       WebElement pdtview=driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
		
       pdtview.click();
       
       WebElement addtocrt=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		
       addtocrt.click();
       
       WebElement back=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
		
       back.click();

       WebElement drdwnztoa=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		
       drdwnztoa.sendKeys("Price (high to low)");
       
       //WebElement drdwnatoz=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		
       //drdwnatoz.sendKeys("Name (A to Z)");
       
       //driver.findElement(By.cssSelector("#inventory_filter_container > select")).sendKeys("Price (low to high)");
		
       
       
       //WebElement drdwnhitolo=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select"));
		
       //drdwnhitolo.sendKeys("Price (high to low)");
       
       //select add to cart page
       
       WebElement adtocart=driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path"));
		
       adtocart.click();
       
       //click on continue shopping
       
       WebElement cntinshop=driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[1]"));
		
       cntinshop.click();
       
       //second product added to cart
       
       WebElement adtocrt2=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
		
       adtocrt2.click();
       
       //again click add to cart
       
       WebElement adtocart3=driver.findElement(By.cssSelector("#shopping_cart_container > a > svg"));
		
       adtocart3.click();
       
     //to click on checkout of cart page
       
       
       WebElement checkout=driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
		
       checkout.click();
       
       
       //to click on continue of checkout
       
       WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("A");
		
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("B");
		
		WebElement pcode=driver.findElement(By.id("postal-code"));
		pcode.sendKeys("68003");
		
		
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
		
		//to click on finish
		
		  WebElement finish=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
			
		  finish.click();
		  
		  //to click on menubar
		  
		  WebElement menubar=driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
		  
		  menubar.click();
		  
		  //to click on all items of menubar
		  
		  WebElement allitems=driver.findElement(By.id("inventory_sidebar_link"));
		  
		  allitems.click();
		  
		  //to view one product page
		  
		  WebElement pdt=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
		  
		  pdt.click();
		  
		  
		  //add to cart that product
		  
		  WebElement adtocartp=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		  adtocartp.click();
		  
		 //remove from cart
		  
		  WebElement rem=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div/button"));
		  
		  rem.click();
		  
		  
		  //click on back button
		  
		  WebElement back1=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button"));
		  
		  back1.click();
		  
        //to click on menubar1
		  
		  WebElement menubar1=driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
		  
		  menubar1.click();
		  
		  //click on about us from menubar1
		  
		 
		  //WebElement abt=driver.findElement(By.xpath("//*[@id=\"about_sidebar_link\"]"));
		  
		  Thread.sleep(4000);
		  
		  WebElement abt=driver.findElement(By.id("about_sidebar_link"));
		  
		  abt.click();
		  
		  //to get home page
		
		
		  driver.get("https://www.saucedemo.com/v1/inventory.html");
		  
		  
		  //to click on menubar
		  
          WebElement menubar2=driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button"));
		  
		  menubar2.click();
		  
		  //to click on logout
		  
         // WebElement logout1=driver.findElement(By.id("logout_sidebar_link"));
		  
		  WebElement logout1=driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		  
		  
          logout1.click();
		  
          driver.quit();
		
	}

}
