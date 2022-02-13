package registerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageTest {

	public static void main(String[] args) throws InterruptedException {
		String driver_path = "C:\\Selenium setup\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
		
		String web_url = "https://automation-demo.netlify.app/";
		driver.manage().window().maximize();
		driver.get(web_url);
		
		Thread.sleep(2000);
		WebElement name_input = driver.findElement(By.name("name"));
		name_input.sendKeys("Sakibul Islam");
		
		Thread.sleep(2000);
		WebElement email_input = driver.findElement(By.name("email"));
		email_input.sendKeys("sakibulislam285@gmail.com");
		
		Thread.sleep(2000);
		WebElement phone_input = driver.findElement(By.name("phone"));
		phone_input.sendKeys("01914603437");
		
		Thread.sleep(2000);
		WebElement address_input = driver.findElement(By.id("address"));
		address_input.sendKeys("Dhaka, Bangladesh");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='sports']")).click();
		
		Thread.sleep(2000);
		Select language = new Select(driver.findElement(By.xpath("//select[@id='language']")));
		language.selectByVisibleText("Bengali");
		

		Thread.sleep(2000);
		WebElement uploadElement = driver.findElement(By.xpath("//input[@id='image']"));
		uploadElement.sendKeys("C:\\Users\\LENOVO\\Pictures\\bird.jpg");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
	}

}
