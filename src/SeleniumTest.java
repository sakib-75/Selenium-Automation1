import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		String driver_path = "C:\\Selenium setup\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
		
		String web_url = "https://bikroy.com/";
		driver.manage().window().maximize();
		driver.get(web_url);

		driver.findElement(By.linkText("Login")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div[2]/div/div[3]/button")).click();
		
		Thread.sleep(2000);
		WebElement email_input = driver.findElement(By.name("email"));
		email_input.sendKeys("sakibulislam285@gmail.com");
		
		Thread.sleep(2000);
		WebElement password_input = driver.findElement(By.name("password"));
		password_input.sendKeys("123abc");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		//For Registration
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		Thread.sleep(2000);
		WebElement name_input = driver.findElement(By.id("input_name"));
		name_input.sendKeys("Sakibul Islam");
		
		Thread.sleep(2000);
		WebElement email_input2 = driver.findElement(By.id("input_email"));
		email_input2.sendKeys("sakibulislam285@gmail.com");
		
		Thread.sleep(2000);
		WebElement password_input2 = driver.findElement(By.id("input_password"));
		password_input2.sendKeys("123abc#$");
		
		Thread.sleep(2000);
		WebElement cpassword_input = driver.findElement(By.id("input_password-confirm"));
		cpassword_input.sendKeys("123abc");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
		
		

	}

}
