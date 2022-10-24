package Project1.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDMP_SalesTeam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		driver.manage().window().maximize();
		
		//Login to DDMP Hierarchy portal
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1ita@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		// Navigate to Sales Team
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Sales Team")));
		driver.findElement(By.id("Sales Team")).click();
		
		// Adding new Sales team member
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='addTeam']")));
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='addTeam']")).click();
		Thread.sleep(6000);
		Select titleid = new Select(driver.findElement(By.id("AddTittleId")));
		titleid.selectByValue("1");
		driver.findElement(By.id("nameAdd")).sendKeys("Dist1 SS2 Sales Associ 2");
		Select type = new Select(driver.findElement(By.id("typeAdd")));
		type.selectByValue("3");
		Thread.sleep(6000);
		Select parent = new Select(driver.findElement(By.id("parentAdd")));
		parent.selectByValue("33");
		driver.findElement(By.id("NationalIdAdd")).sendKeys("0000");
		driver.findElement(By.id("EmployeeIdAdd")).sendKeys("000");
		Select position = new Select(driver.findElement(By.id("PositionAdd")));
		position.selectByValue("3");
		Select classification = new Select(driver.findElement(By.id("ClassificationAdd")));
		classification.selectByValue("1");
		driver.findElement(By.id("mobileAdd")).sendKeys("50994471");
		driver.findElement(By.id("emailAdd")).sendKeys("ddmpsitdist1ss2sa2@oq-ddmp.recharge365.com");
		driver.findElement(By.id("AADIdAdd")).sendKeys("8545559");
		driver.findElement(By.id("btn_saveTeam")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("btn_savekpi")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("btn_savedefaultkpi")).click();
		
}

}
