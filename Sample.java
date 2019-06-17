
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\java video\\WebDrivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("www.google.com");
				
	}

}