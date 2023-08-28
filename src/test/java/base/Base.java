package base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	WebDriver driver;
	public Properties prop;
	public Base(){
		prop = new Properties();
//		File propFile = new File("E:\\Bdeb\\420-L05-BB ALGORITHMES ET INITATION À LA PROGRAMMATION groupe 01247\\Cours_Java_code\\FrameworkSelenium\\src\\main\\java\\config\\config.properties");
		File propFile = new File(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
		try {
			FileInputStream data_fis = new FileInputStream(propFile);
			prop.load(data_fis);
		} catch (Throwable e) {
			e.printStackTrace();
		}		
	}
	
	public WebDriver initNavigaterUrl(String browseName) throws Exception{
		if(browseName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browseName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get(prop.getProperty("qaUrl"));
		Thread.sleep(3000);
		return driver;
		
	}
}
