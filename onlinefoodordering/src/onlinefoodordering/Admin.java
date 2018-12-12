package onlinefoodordering;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/admin");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@value='submit']")).click();
		Thread.sleep(4000);
//		restaurant
		
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
		driver.findElement(By.xpath("//input[@id='venue_name']")).sendKeys("ABC");
		driver.findElement(By.xpath("//textarea[@id='venue_description']")).sendKeys("good");
		driver.findElement(By.xpath("//input[@id='venue_address_by_user']")).sendKeys("gulbarga");
		driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7022643092");
		driver.findElement(By.xpath("//input[@id='site_url']")).sendKeys("www.restaurant.com");
		driver.findElement(By.xpath("//input[@id='slogan']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("arabic");
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//input[@id='takout']")).click();
		driver.findElement(By.xpath("//input[@id='delivery']")).click();
		driver.findElement(By.xpath("//input[@id='reservation']")).click();
		driver.findElement(By.xpath("//input[@id='catering']")).click();
		driver.findElement(By.xpath("//select[@id='created_by']/option[5]")).click();
		driver.findElement(By.xpath("//input[@id='store_manager']")).sendKeys("sir");
		driver.findElement(By.xpath("//input[@id='store_manager_email']")).sendKeys("www.sir.com");
		driver.findElement(By.xpath("//input[@id='min_order_amount']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@id='sales_tax']")).sendKeys("5%");
		driver.findElement(By.xpath("//select[@id='delivery_fee_type']/option[1]")).click();
		driver.findElement(By.xpath("//input[@id='delivery_fee']")).sendKeys("100");
		driver.findElement(By.xpath("//textarea[@id='delivery_area_desc']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='commission']")).sendKeys("50%");
		driver.findElement(By.xpath("//textarea[@id='meta_tags']")).sendKeys("T,W");
		driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
//		couponcode
		
		driver.findElement(By.xpath("//a[contains(text(),'Coupon Codes')]")).click();
		driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
		driver.findElement(By.xpath("//input[@id='ccCode']")).sendKeys("american");
		driver.findElement(By.xpath("//textarea[@id='ccDescription']")).sendKeys("true");
		driver.findElement(By.xpath("//input[@id='ccStartDate']")).sendKeys("08/12/2018");
		driver.findElement(By.xpath("//input[@id='ccEndDate']")).sendKeys("08/01/2019");
		driver.findElement(By.xpath("//input[@id='ccDiscount']")).sendKeys("10%");
		driver.findElement(By.xpath("//input[@id='ccThreshouldAmount']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='ccNumberOfImpression']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
		Thread.sleep(3000);
		
        JavascriptExecutor js11=(JavascriptExecutor)driver;
		js11.executeScript("window.scrollBy(100,500)");
		System.out.println("scrolled Up");
		Thread.sleep(5000);
//		users
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[9]/a[1]")).click();

		 JavascriptExecutor js111=(JavascriptExecutor)driver;
			js111.executeScript("window.scrollBy(200,400)");
			System.out.println("scrolled Down");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("aniketa");
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("pawar");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aniketa@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@id='nickname']")).sendKeys("ani");
			driver.findElement(By.xpath("//select[@id='gender']")).sendKeys("female");
			driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("21/10/2018");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7019685846");
			driver.findElement(By.xpath("//select[@id='status']")).sendKeys("active");
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Owners')]")).click();
			JavascriptExecutor js1111=(JavascriptExecutor)driver;
			js1111.executeScript("window.scrollBy(200,350)");
			System.out.println("scrolled Down");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("aniketa");
			driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("pawar");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aniketa@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@id='nickname']")).sendKeys("ani");
			driver.findElement(By.xpath("//select[@id='gender']")).sendKeys("female");
			driver.findElement(By.xpath("//select[@id='subscription_plan_id']")).sendKeys("free plan");
			driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("21/10/2018");
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7019685846");
			driver.findElement(By.xpath("//select[@id='status']")).sendKeys("active");
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			Thread.sleep(5000);
			
			//Click on Restaurant
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(5000);

			//
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			Thread.sleep(5000);
			//upload image
			WebElement upload=driver.findElement(By.xpath("//input[@id='photo_id']"));
			upload.sendKeys("‪F:\\screenb.jpeg");
		
			//chechbocx
			driver.findElement(By.xpath("//input[@id='is_cover_photo']")).click();
			Thread.sleep(5000);
			
			
			//save
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			Thread.sleep(5000);
			

				//publish
			
			driver.findElement(By.xpath("//tr[@id='jqRecord_98']//button[@type='button'][contains(text(),'Publish')]")).click();
			Thread.sleep(5000);
			
			
       //restaurant
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(5000);
			
			//menu
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/a[1]")).click();
			Thread.sleep(5000);
			
			//add record
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			Thread.sleep(5000);
			
			//add menu
			driver.findElement(By.xpath("//input[@id='class_name']")).sendKeys("food");
			driver.findElement(By.xpath("//select[@id='start_time']")).sendKeys("8:00am");
			driver.findElement(By.xpath("//select[@id='end_time']")).sendKeys("1;00am");
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			Thread.sleep(5000);
			
			//publish
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			Thread.sleep(5000);
			
			
			//restaurant
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(5000);
			
			
			//food item
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/a[1]")).click();
			Thread.sleep(5000);
			
			
			//add fooditem
			driver.findElement(By.xpath("//a[@id='additem']")).click();
			Thread.sleep(5000);
			
	
			//adding
			driver.findElement(By.xpath("//input[@id='activities_id']")).sendKeys("rice");
			driver.findElement(By.xpath("//input[@id='topping']")).click();
			driver.findElement(By.xpath("//input[@id='menus']")).click();
			driver.findElement(By.xpath("//input[@id='token-input-parent_activity_id']")).sendKeys("biryani");
			driver.findElement(By.xpath("//input[@id='activity_price']")).sendKeys("1000");
			driver.findElement(By.xpath("//input[@id='activity_discount']")).sendKeys("10%");
			driver.findElement(By.xpath("//input[@id='token-input-food_category']")).sendKeys("pizza");
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(5000);
			
			
			
			
		
		

	}

}
