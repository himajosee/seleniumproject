package selenpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblaze {

	public static void main(String[] args) throws InterruptedException {
		 
		
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			
			//contact section
			
			 WebElement contacts=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a"));
			 contacts.click();
			 
			 Thread.sleep(4000);
			 
			 WebElement contactemail=driver.findElement(By.xpath("//*[@id=\"recipient-email\"]"));
			 contactemail.sendKeys("a@gmail.com");
			 
			 WebElement contactname=driver.findElement(By.id("recipient-name"));
			 contactname.sendKeys("Hima");
			 
			 WebElement message=driver.findElement(By.id("message-text"));
			 message.sendKeys("hiii"); 
			 
			 
			 WebElement sendmsg=driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]"));
			 sendmsg.click(); 
			 
			 driver.switchTo().alert().dismiss();
			 
			 //about us
			 
			 WebElement abtus=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]/a"));
			 abtus.click();
			 
			 Thread.sleep(4000);
			 
			 WebElement closevideo=driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button"));
			 closevideo.click(); 

			 //cart
			 
			 WebElement cart=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
			 cart.click();
			 
			 
			
			 
			 //login
			 
			 WebElement login=driver.findElement(By.xpath("//*[@id=\"login2\"]"));
			 login.click();
			 
			 Thread.sleep(4000);
			 WebElement closelogin=driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]"));
			 closelogin.click();
			 
			 //signup
			 
			 WebElement signup=driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
			 signup.click();
			 
			 Thread.sleep(4000);
			 WebElement closesignup=driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]"));
			 closesignup.click();
			 
			 //phones
			 
			 WebElement homepdtstore=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore.click();
			 
			 Thread.sleep(4000);
			 WebElement phones=driver.findElement(By.xpath("//*[@id=\"itemc\"]"));
			 phones.click();
			 
			 //samsunggalaxy
			 
			 WebElement samsunggalaxy=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
			 samsunggalaxy.click();
			 
			 Thread.sleep(4000);
			 WebElement samsunggalaxyadd2cart=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
			 samsunggalaxyadd2cart.click(); 
			 
			 Thread.sleep(4000);
			 
			 driver.switchTo().alert().accept();
			 
			
		
			
			 
		//Nokia lumia 1520
			 Thread.sleep(4000);
			 
			 WebElement homepdtstore0=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore0.click();
			 
			 Thread.sleep(4000);
			 WebElement nokialumia=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
			 nokialumia.click();
			 
			 WebElement homepdtstore1=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore1.click();
			
			 //nexus6
			 Thread.sleep(4000);
			 WebElement nexus6=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));
			 nexus6.click();
			 
			 WebElement homepdtstore2=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore2.click();
			
			 //Samsung galaxy s7
			 Thread.sleep(4000);
			 WebElement samgala7=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
			 samgala7.click();
			 
			 WebElement homepdtstore3=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore3.click();
			 
			 //Iphone 6 32gb
			 
			 Thread.sleep(4000);
			 WebElement iphone32=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a"));
			 iphone32.click();
			 
			 WebElement homepdtstore4=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore4.click();
			 
			 //Sony xperia z5
			 
			 Thread.sleep(4000);
			 WebElement sonyxperia=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a"));
			 sonyxperia.click();
			 
			 WebElement homepdtstore5=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore5.click();
			 
			 //HTC One M9
			 
			 Thread.sleep(4000);
			 WebElement htcone=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a"));
			 htcone.click();
			 
			 WebElement homepdtstore6=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore6.click();
			 
			 //Sony vaio i5
			 
			 
			 Thread.sleep(4000);
			 WebElement sonyvaio=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a"));
			 sonyvaio.click();
			 
			 WebElement homepdtstore7=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore7.click();
			 
			 //Sony vaio i7
			 
			 Thread.sleep(4000);
			 WebElement sonyvaioi7=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a"));
			 sonyvaioi7.click();
			 
			 WebElement homepdtstore8=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore8.click();
			 
			 //next button
			 
			 WebElement nextbtn=driver.findElement(By.id("next2"));
			 nextbtn.click(); 
			 
			 //Apple monitor 24
			 
			 Thread.sleep(4000);
			 WebElement applemonitor=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
			 applemonitor.click();
			 
			 WebElement homepdtstore9=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore9.click();
			 
			 //MacBook air
			 Thread.sleep(4000);
			 WebElement macbookair=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
			 macbookair.click();
			 
			 WebElement homepdtstore10=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore10.click();
			 
			 //Dell i7 8gb
			 Thread.sleep(4000);
			 WebElement delli7=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a"));
			 delli7.click();
			 
			 WebElement homepdtstore11=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore11.click();
			 
			 //2017 Dell 15.6 Inch
			 
			 Thread.sleep(4000);
			 WebElement dell15=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
			 dell15.click();
			 
			 WebElement homepdtstore12=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore12.click();
			 
			 //ASUS Full HD
			 Thread.sleep(4000);
			 WebElement asus=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[5]/div/div/h4/a"));
			 asus.click();
			 
			 WebElement homepdtstore13=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore13.click();
			 
			 //MacBook Pro
			 
			 Thread.sleep(4000);
			 WebElement macpro=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a"));
			 macpro.click();
			 
			 Thread.sleep(4000);
			 WebElement macproadd2cart=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
			 macproadd2cart.click(); 
			 
			 Thread.sleep(4000);
			 
			 driver.switchTo().alert().accept();
			 
			
			 
			 
			 WebElement homepdtstore14=driver.findElement(By.xpath("//*[@id=\"nava\"]"));
			 homepdtstore14.click();
			 
			 //previous button
			 
			 
			 WebElement prevbtn=driver.findElement(By.id("prev2"));
			 prevbtn.click(); 
			 
			 //go to cart to place order
			 
			 Thread.sleep(4000);
			 WebElement cart1=driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
			 cart1.click();
			 
			 
			 //delete from cart
			 Thread.sleep(4000);
			 WebElement cartdel=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[4]/a"));
			 cartdel.click();
			 
			 Thread.sleep(4000);
			 
			 WebElement placeorder=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
			 placeorder.click();
			 
			 Thread.sleep(4000);
			 
			 WebElement name=driver.findElement(By.id("name"));
			 name.sendKeys("hima"); 
			 
			 WebElement country=driver.findElement(By.id("country"));
			 country.sendKeys("India");  
			 
			 WebElement city=driver.findElement(By.id("city"));
			 city.sendKeys("Thrissur"); 
			 
			 WebElement cardno=driver.findElement(By.id("card"));
			 cardno.sendKeys("abcdefgh"); 
			 
			 WebElement month=driver.findElement(By.id("month"));
			 month.sendKeys("July"); 
			 
			 WebElement year=driver.findElement(By.id("year"));
			 year.sendKeys("2024"); 
			 
			 WebElement purchase=driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
			 purchase.click();
			 
			 Thread.sleep(4000);
			 WebElement ok=driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button"));
			 ok.click();
			 
	}

}
