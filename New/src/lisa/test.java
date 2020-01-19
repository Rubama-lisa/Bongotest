package lisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://dokan.ajaira.website/");
        
        //vendor sign up
        
        WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div/div/div[2]/div/ul/li[3]/a"));
        SignUp.click();
        
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"reg_email\"]"));
        Email.sendKeys("rubama.DS.tasnim@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"reg_password\"]"));
        Password.sendKeys("Rtasnim123456789@$");
		
        driver.findElement(By.xpath("//*[@id=\"register\"]/p[3]/label[2]/input")).click();
        
        WebElement Fname = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        Fname.sendKeys("Rubama");
        
        WebElement Lname = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        Lname.sendKeys("Tasnim");
        
        WebElement Shop = driver.findElement(By.xpath("//*[@id=\"company-name\"]"));
        Shop.sendKeys("New");
        
        WebElement Shopurl = driver.findElement(By.xpath("//*[@id=\"seller-url\"]"));
        Shopurl.sendKeys("https://dokan.ajaira.website/store/");
        
        WebElement Phone = driver.findElement(By.xpath("//*[@id=\"shop-phone\"]"));
        Phone.sendKeys("https://dokan.ajaira.website/store/");
        
        driver.findElement(By.xpath("//*[@id=\"register\"]/p[4]/button")).click();
        //Log in as vendor
        
        WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        Uname.sendKeys("rubama.DS.tasnim@gmail.com");
        
        WebElement NPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        NPassword.sendKeys("Rtasnim123456789@$");
        
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")).click();
        
        //Add product
        driver.findElement(By.xpath("//*[@id=\"dokan-navigation\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"post-17\"]/div/div/div[2]/article/div[1]/span/a[1]")).click();
        
        WebElement Pname = driver.findElement(By.xpath("//*[@id=\"dokan-add-new-product-form\"]/div[1]/div[2]/div[1]/input"));
        Pname.sendKeys("Product name");
        
        WebElement Price = driver.findElement(By.xpath("//*[@id=\"dokan-add-new-product-form\"]/div[1]/div[2]/div[2]/div[1]/div[1]/div/input"));
        Price.sendKeys("500");
        WebElement DPrice = driver.findElement(By.xpath("//*[@id=\"dokan-add-new-product-form\"]/div[1]/div[2]/div[2]/div[1]/div[2]/div/input"));
        DPrice.sendKeys("600");
        
        driver.findElement(By.xpath("//*[@id=\"dokan-add-new-product-popup\"]/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div/div/div[2]/div/ul/li[4]/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"page\"]/nav/div/div/div[2]/div/ul/li[2]/a")).click();
        
       //Log in as customer
        WebElement Unname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        Unname.sendKeys("rubama.DS.tasnim@gmail.com");
        
        WebElement NnPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        NnPassword.sendKeys("Rtasnim123456789@$");
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button")).click();
   
        
        driver.findElement(By.xpath("//*[@id=\"colophon\"]/div[2]/div/div/div/div/div[2]/div/ul/li[7]/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[3]/span/span[2]/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[3]/a/img")).click();
        
        driver.findElement(By.xpath("//*[@id=\"product-32\"]/div[2]/form/button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/a")).click();
        
        driver.findElement(By.xpath("//*[@id=\"post-14\"]/div/div/div[2]/div/div")).click();
        
        WebElement BFname = driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]"));
        BFname.sendKeys("First");
        
        WebElement BLname = driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]"));
        BLname.sendKeys("Last");
        
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]"));
        Address.sendKeys("Address");
        
        WebElement Town = driver.findElement(By.xpath("//*[@id=\"billing_city\"]"));
        Town.sendKeys("Town");
        
        WebElement Zip = driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]"));
        Zip.sendKeys("Zip");
        
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"billing_phone\"]"));
        phone.sendKeys("01914979202");
        
        driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	}

}
