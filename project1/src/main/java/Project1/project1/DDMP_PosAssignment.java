package Project1.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDMP_PosAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		
		
		//Login to DDMP Hierarchy portal
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1ita@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		//Selecting POS and POS ASsignment
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click(); //Selecting POS
		Thread.sleep(6000);
		driver.findElement(By.id("POS Assignments")).click();
		
		//Selecting the Merchant from the dropdown 
		driver.findElement(By.xpath("//body/div[11]/div[2]/section[1]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dist1 Merchant13')]")).click();
		
		//Assigning registered device to the selected merchant
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[2]/section[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("simId")).sendKeys("12345");
		driver.findElement(By.id("nfc")).sendKeys("en00000");
		driver.findElement(By.id("addToTable")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("assignPOSSave")).click();

	}

}
