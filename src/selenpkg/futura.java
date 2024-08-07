package selenpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class futura {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://thefuturalabs.com/");
		
		driver.manage().window().maximize();
		
         //placement section
		
        WebElement placements=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-32\"]/a"));
		    
        placements.click();
		   
        Thread.sleep(4000);
		  
        //WebElement placementsimg1=driver.findElement(By.xpath("//*[@id=\"MjI1OjE2Mg==-1\"]"));
        
        WebElement placementsimg1=driver.findElement(By.cssSelector("#post-24 > section.plcPeople > div > div > div:nth-child(2) > div > div > a > img"));
        
        placementsimg1.click();
        
        WebElement placementsimg1close=driver.findElement(By.xpath("//*[@id=\"lightbox\"]/div[2]/div/div[2]/a"));
		    
        placementsimg1close.click();
        
        driver.get("https://thefuturalabs.com/");
		
		
		
		//careers and contact section
		
		 WebElement careers=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-31\"]/a"));
		    
         careers.click();
		   
		  driver.get("https://thefuturalabs.com/");
		    
		  WebElement contact=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-30\"]/a"));
		    
		  contact.click();
		   
		  driver.get("https://thefuturalabs.com/");
		
		 
		
		
		//to click on get in touch
		
		WebElement getintouch=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[1]/div/div/div/div/div/a[1]"));
		
		getintouch.click();
		
		driver.get("https://thefuturalabs.com/");
		
		//to click on call
		
       //WebElement call=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[1]/div/div/div/div/div/a[2]"));
		
       //call.click();
       
       //Thread.sleep(4000);	
       
      
       
      // driver.navigate().to("https://thefuturalabs.com/");
       
       
		
		
		//to click on whatsapp
		
      //WebElement whatsup=driver.findElement(By.xpath("//*[@id=\"watsupId\"]"));
		
       //whatsup.click();
		
		
		WebElement pythonmover=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[1]/div/div[1]/img"));
		//WebElement pythonmover=driver.findElement(By.cssSelector("#post-5 > section.cources > div > div.homeCourse > div > div:nth-child(1) > div > div.ccHead"));
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(pythonmover).perform();
		
	
		
      WebElement viemore1=driver.findElement(By.cssSelector("#post-5 > section.cources > div > div.homeCourse > div > div:nth-child(1) > div > div.view > a"));
       
		// WebElement viemore1=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[1]/div/div[1]/div/div[4]/a"));
     
      action.moveToElement(viemore1).click().build().perform(); 
	   

       
       driver.get("https://thefuturalabs.com/");
       
       WebElement viemore2=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[5]/div/div[2]/a"));
       
      // WebElement viemore2=driver.findElement(By.cssSelector("#post-5 > section.cources > div > div.mt-4 > a"));
      
       action.moveToElement(viemore2).click().build().perform();
       //viemore2.click();
       
       driver.get("https://thefuturalabs.com/");
       
       
       WebElement viemore3=driver.findElement(By.cssSelector("#post-5 > section.partners > div > div.mt-4.mb-4 > a"));
       
       //WebElement viemore3=driver.findElement(By.xpath("//*[@id=\"post-5\"]/section[6]/div/div[2]/a"));
       
       
       action.moveToElement(viemore3).click().build().perform();
       //viemore3.click();
       
       driver.get("https://thefuturalabs.com/");
       
       
       WebElement name=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[2]/div[1]/div/p/span/input"));
       
       name.sendKeys("A");
       
     WebElement phoneno=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[2]/div[2]/div/p/span/input"));
       
     phoneno.sendKeys("1234567890");
     
     
     WebElement email=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[3]/div[1]/div/p/span/input"));
     
     email.sendKeys("himajosee@gmail.com");
     
     
     WebElement subj=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[3]/div[2]/div/p/span/input"));
     
     subj.sendKeys("bbb");
     
     
    WebElement msg=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/div[4]/div/div/p/span/textarea"));
     
    msg.sendKeys("just for test");	
   
    WebElement submit=driver.findElement(By.xpath("//*[@id=\"wpcf7-f19-p5-o1\"]/form/p/input"));
    
    submit.click();	
    
    driver.get("https://thefuturalabs.com/");
    
   //WebElement fb=driver.findElement(By.xpath("//*[@id=\"ODUwOjI1Mg==-1\"]"));
    
   //fb.click();	
    
    //driver.get("https://thefuturalabs.com/");
    
    
   // WebElement insta=driver.findElement(By.xpath("//*[@id=\"ODUwOjUwNg==-1\"]"));
    
    //insta.click();	
     
     //driver.get("https://thefuturalabs.com/");
    
    //WebElement linkin=driver.findElement(By.xpath("//*[@id=\"ODUwOjc2Mw==-1\"]"));
    
    //linkin.click();	
    
   //WebElement google=driver.findElement(By.xpath("//*[@id=\"ODUwOjEwMDU=-1\"]"));
    
   //google.click();	
    
   WebElement abt=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-34\"]/a"));
    
   //abt.click();	
   action.moveToElement(abt).click().build().perform();
   
   WebElement uihyplink=driver.findElement(By.xpath("//*[@id=\"post-20\"]/section[2]/div/div[1]/div[2]/div/p[1]/a[1]/strong"));
   
   uihyplink.click();	
   
   driver.get("https://thefuturalabs.com/about/");
   
   
  WebElement reahyplink=driver.findElement(By.cssSelector("#post-20 > section.aboutsec.inner > div > div:nth-child(1) > div:nth-child(2) > div > p:nth-child(1) > a:nth-child(2) > strong"));
   
 
  action.moveToElement(reahyplink).click().build().perform(); 
  
  
   driver.get("https://thefuturalabs.com/about/");
   
   WebElement fluhyplink=driver.findElement(By.cssSelector("#post-20 > section.aboutsec.inner > div > div:nth-child(1) > div:nth-child(2) > div > p:nth-child(1) > a:nth-child(3) > strong"));
   
   action.moveToElement(fluhyplink).click().build().perform(); 
    
   
   driver.get("https://thefuturalabs.com/");
    
   Thread.sleep(4000);
   WebElement internship=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-33\"]/a"));
   
   //WebElement internship=driver.findElement(By.cssSelector("#mega-menu-item-33 > a"));
   action.doubleClick(internship).perform();
  
   
    //WebElement pythonmover1=driver.findElement(By.cssSelector("#MjI2OjE4MQ\\=\\=-1"));
   WebElement pythonmover1=driver.findElement(By.cssSelector("#post-22 > section.cources.innCr > div > div > div > div:nth-child(1) > div > div.ccHead"));
	action.moveToElement(pythonmover1).perform();
   
	 WebElement viemoreint=driver.findElement(By.xpath("//*[@id=\"post-22\"]/section[2]/div/div/div/div[1]/div/div[4]/a"));
	    action.moveToElement(viemoreint).click().build().perform(); 
	    
	    driver.get("https://thefuturalabs.com/internship/");
	    
	 
	    WebElement phplarval=driver.findElement(By.cssSelector("#post-22 > section.cources.innCr > div > div > div > div:nth-child(2) > div > div.ccHead"));
		
		action.moveToElement(phplarval).perform();
	   
		 WebElement viemoreint2=driver.findElement(By.xpath("//*[@id=\"post-22\"]/section[2]/div/div/div/div[2]/div/div[4]/a"));
		    action.moveToElement(viemoreint2).click().build().perform(); 
		    
		    driver.get("https://thefuturalabs.com/");
		    
		    
		    WebElement internship1=driver.findElement(By.xpath("//*[@id=\"mega-menu-item-33\"]/a"));
		    internship1.click();
		    
		    
		    WebElement pythondropdown=driver.findElement(By.cssSelector("#mega-menu-item-212 > a > span"));
		    
		    pythondropdown.click();
		   
		    driver.get("https://thefuturalabs.com/");
	}

}
