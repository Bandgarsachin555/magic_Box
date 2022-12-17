package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\vilaas\\eclipse-workspace\\CRM_Cucumber\\src\\main\\java\\ConfigLayer\\Login.properties");
			prop.load(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void browserinitialize() {
		// System.setProperty("webdriver.chrome.driver", "driver patch")
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}
}
