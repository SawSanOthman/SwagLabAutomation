package SwagLabAutomation.SwagLabAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
    

	
	WebDriver driver = new ChromeDriver();


	String Website= "https://www.saucedemo.com/";
		
	String Fname = "standard_user";
			
	String UPassword = "secret_sauce";
		
		
	@BeforeTest
		
	public void SetUp() {
		driver.manage().window().maximize();
		
		driver.get(Website);
	}
		
	@Test(priority=1)	
	public void LogIn() throws InterruptedException {
		
	WebElement UserInput = driver.findElement(By.id("user-name"));	
	UserInput.sendKeys(Fname);	
		
	WebElement PasswordInput = driver.findElement(By.id("password"));
	PasswordInput.sendKeys(UPassword);

	WebElement LogInInput = driver.findElement(By.id("login-button"));
	LogInInput.click();
	Thread.sleep(5000);
	}	
		
	@Test(priority=2)	
	public void AddToCartButtons(){
		
	List<WebElement> AddToCarts= driver.findElements(By.className("btn_primary"));
		
	for(int i =0;i<AddToCarts.size();i++) {
		
		AddToCarts.get(i).click();	
		
	}
	//if i add the first3 elements 
	//for(int i=0 ; i<3 ; i++) {
		
//		AddToCarts.get(i).click();

	//if i want description elements 
	//AddToCarts.get(i).getText();

	//if i add 1,3,5 elements
	//for(int i=0 ; i<AddToCarts.size();i=i+2);
	//AddToCarts.get(i).click();

		
	}	
		
	@Test(priority=3,enabled=true)

		public void RemoveButtons() throws InterruptedException {
		Thread.sleep(5000);
		List <WebElement> RemoveItems = driver.findElements(By.className("btn_secondary"));
		for(int index =0;index<RemoveItems.size();index++) {
			RemoveItems.get(index).click();
			
		}
		
	}
	@Test(priority=4)	
	public void Items () {
		// print the first letter of the elements
		
		List<WebElement> ElementsNames = driver.findElements(By.className("inventory_item_name"));
		for(int i=0;i<ElementsNames.size();i++) {
			
			String ElementName = ElementsNames.get(i).getText();
			System.out.println(ElementName.charAt(0));
		}
	}

	@Test(priority=5)
	public void PrintTheLetterT() {
		
		// print letters that don't start with the letter (S) from ElementName
		
		List<WebElement> ElementsNames = driver.findElements(By.className("inventory_item_name"));
		for(int i=0;i<ElementsNames.size();i++) {
			String ElementName = ElementsNames.get(i).getText();
			
			if(ElementName.startsWith("S")) {
				
				continue;
			} else {System.out.println(ElementName);}
		}
		
	}


	@Test(priority=6)
	
	public void PrintTheNamed () {
		
		// print the names of the elements and stop at the equal name " Sauce Labs Onesie "
		
		List<WebElement> ElementsNames = driver.findElements(By.className("inventory_item_name"));
		for(int i=0;i<ElementsNames.size();i++) {
			
			String ElementName = ElementsNames.get(i).getText();
			
			
			if(ElementName.equals("Sauce Labs Onesie")) {
				break;
			} System.out.println(ElementName);
		}

	}



	
	
	
	
	
	
	
	
	
	
	
}