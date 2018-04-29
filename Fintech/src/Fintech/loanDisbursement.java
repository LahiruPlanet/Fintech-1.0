package Fintech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class loanDisbursement {
	
	@Test
	private void loan() throws FindFailed {
		// TODO Auto-generated method stub
		Screen screen = new Screen();
		Pattern pattern = new Pattern("C:\\Users\\Planet\\eclipse-workspace\\SikuliTest\\bin\\Screens\\MobileNumber_TxBx.PNG");
		Pattern Proceed_btn = new Pattern("C:\\Users\\Planet\\eclipse-workspace\\SikuliTest\\bin\\Screens\\Proceed_btn.PNG");
		
		//Open webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Browser maximize
		driver.manage().window().maximize();
		//Implicitly Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Page load timeout
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		//Script timeout
		driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
		
		//Load the page
		driver.get("https://jsonplaceholder.typicode.com/");
		screen.wait(pattern, 5000);
		
				
		screen.click(pattern);
		screen.type("771842001");
		screen.click(Proceed_btn);
		
		
		
	
		driver.close();
	}
}
