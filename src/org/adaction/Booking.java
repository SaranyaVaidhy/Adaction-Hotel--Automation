package org.adaction;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarayana\\eclipse-workspace\\Project2\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        
        driver.get("https://adactinhotelapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        
        WebElement username = driver.findElement(By.cssSelector("input[id=username]"));
        username.sendKeys("SaranyaSreehari17");
        
        WebElement password = driver.findElement(By.cssSelector("input[id=password]"));
        password.sendKeys("C1KLAU");
        
        WebElement login = driver.findElement(By.cssSelector("input[id=login]"));
        login.click();
        Thread.sleep(2000);
        
        Set<String> d = driver.getWindowHandles();
        
        ArrayList<String> gh = new ArrayList<String>(d);
        
        driver.switchTo().window(gh.get(0));
        
        WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
        Select lo = new Select(location);
        lo.selectByValue("Paris");
        Thread.sleep(2000);
        
        WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
        Select ho = new Select(hotel);
        ho.selectByVisibleText("Hotel Sunshine");
        Thread.sleep(2000);
        
        WebElement room = driver.findElement(By.cssSelector("select[id='room_type']"));
        Select ro = new Select(room);
        ro.selectByValue("Super Deluxe");
        Thread.sleep(2000);
        
        WebElement Noroom = driver.findElement(By.cssSelector("select[id='room_nos']"));
        Select no = new Select(Noroom);
        no.selectByIndex(1);
        Thread.sleep(2000);
        
        WebElement chin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
        chin.clear();
        chin.sendKeys("24/11/2024");
        Thread.sleep(2000);
        WebElement chout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
        chout.clear();
        chout.sendKeys("28/11/2024");
        Thread.sleep(2000);
        
        WebElement adroom = driver.findElement(By.cssSelector("select[id='adult_room']"));
        Select ad = new Select(adroom);
        ad.selectByValue("2");
        Thread.sleep(2000);
        
        WebElement chroom = driver.findElement(By.cssSelector("select[id='child_room']"));
        Select ch = new Select(chroom);
        ch.selectByIndex(0);
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("input[id='Submit']")).click();
        Thread.sleep(2000);
        
        driver.switchTo().window(gh.get(0));
        
        driver.findElement(By.cssSelector("input[id='radiobutton_0']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("input[id='continue']")).click();
        Thread.sleep(2000);
        
        driver.switchTo().window(gh.get(0));
        
        driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys("SARANYA");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys("VAIDHYANATHAN");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("textarea[id='address']")).sendKeys("#403,4TH CROSS,NEW JERSEY,UNITED STATES-392021.");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id='cc_num']")).sendKeys("1345167000890945");
        Thread.sleep(2000);
        WebElement ctype = driver.findElement(By.cssSelector("select[id='cc_type']"));
        Select ct = new Select(ctype);
        ct.selectByValue("AMEX");
        Thread.sleep(2000);
        WebElement exmon = driver.findElement(By.cssSelector("select[id='cc_exp_month']"));
        Select exm = new Select(exmon);
        exm.selectByVisibleText("August");
        Thread.sleep(2000);
        
        WebElement year = driver.findElement(By.cssSelector("select[id='cc_exp_year']"));
        Select yr = new Select(year);
        yr.selectByValue("2030");
        Thread.sleep(2000);
        
        driver.findElement(By.cssSelector("input[id='cc_cvv']")).sendKeys("717");
        driver.findElement(By.cssSelector("input[id='book_now']")).click();
        Thread.sleep(2000);
        
        //driver.switchTo().window(gh.get(0));
        JavascriptExecutor ds = (JavascriptExecutor) driver;
		ds.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.cssSelector("input[id='my_itinerary']")).click();
		
		
   
      
        Thread.sleep(5000);
        driver.quit();
 
	}

	
	
}
