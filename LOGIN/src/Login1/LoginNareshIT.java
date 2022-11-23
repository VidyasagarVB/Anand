package Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class LoginNareshIT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/java/java_conditions.asp");
		driver.getTitle();
		driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		//if()
			
			
		Actions actions = new Actions(driver);
		
		
		
		driver.get("website/patientsPage.html");
		System.out.println("Chrome opened");
		driver.getTitle();
		driver.getCurrentUrl();
		

	}

}
