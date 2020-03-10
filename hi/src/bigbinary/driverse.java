package bigbinary;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverse 
{
	WebDriver driver;
	public void fa()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\setup\\chromedriver file\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		driver.get("https://qa.aceinvoice.com/");
		

		 for(int i=0;i<=5;i++)
			{
				 Random obj = new Random(); 
				int a = obj.nextInt(600); 
				driver.findElement(By.partialLinkText("Sign Up")).sendKeys(Keys.RETURN);
				driver.findElement(By.name("email")).sendKeys("stud"+a+"@gmail.com");
				driver.findElement(By.name("get_started")).click();
				driver.findElement(By.name("password")).sendKeys("randome");
				driver.findElement(By.name("password_confirmation")).sendKeys("randome");
				try {
					Thread.sleep(7000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				driver.findElement(By.name("continue")).click();
				driver.findElement(By.name("user[first_name]")).sendKeys("hi");
				driver.findElement(By.name("user[last_name]")).sendKeys("hello");
				driver.findElement(By.xpath("(//div[@class='control__indicator'])[5]")).click();
				driver.findElement(By.name("commit")).sendKeys(Keys.RETURN);
				driver.findElement(By.name("name")).sendKeys("bigb");
				driver.findElement(By.name("commit")).click();
				driver.findElement(By.partialLinkText("Skip this step")).sendKeys(Keys.RETURN);
				driver.findElement(By.xpath("//div//button[@class='btn btn-primary']")).click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
	}

}
