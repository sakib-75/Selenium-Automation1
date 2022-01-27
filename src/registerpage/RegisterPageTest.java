package registerpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageTest {

	public static void main(String[] args) {
		String driver_path = "C:\\Selenium setup\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		
		WebDriver driver = new ChromeDriver();
		
		String web_url = "https://bikroy.com/";
		driver.manage().window().maximize();
		driver.get(web_url);

	}

}
