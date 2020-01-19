package lisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bongobd.com/");
		
		WebElement Register = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div[2]/div/div[2]/div[2]/div[2]/button[2]"));
        Register.click();
        
        WebElement Number = driver.findElement(By.xpath("//*[@id=\"phoneNumberInput\"]"));
        Number.sendKeys("01729986983");
        
        WebElement GetOtp = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/button"));
        GetOtp.click();
        
       driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div[2]/div/div[1]/a/img")).click();
        
       //redriver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div/div/div/div[9]/div/div/div/a/div[2]")).click();
        
        
		}

		}