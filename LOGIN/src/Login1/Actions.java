package Login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");	
		WebElement dropdowntoggle=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		Actions act=new Actions(driver);
	
		
		
		
		
		
		
		
//		WebElement coursesOffered=driver.findElement(By.xpath("//span[text()='Courses Offered']"));
//		
//		Actions act= new Actions(driver);
//		
//		act.moveToElement(coursesOffered).perform();
//		Thread.sleep(3000);
//		
//		act.contextClick(coursesOffered).perform();
//		Thread.sleep(3000);
	


	}

	private Object contextClick(WebElement coursesOffered) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object moveToElement(WebElement coursesOffered) {
		// TODO Auto-generated method stub
		return null;
	}

}
