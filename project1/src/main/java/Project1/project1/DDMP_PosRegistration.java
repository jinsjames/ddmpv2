package Project1.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDMP_PosRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		
		
		//Login to DDMP Hierarchy portal
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1ita@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		// Select POS Registration
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click(); //Selecting POS
		driver.findElement(By.id("POS Registration")).click(); // Selecting POS Registration
		
		// Adding POS
		Thread.sleep(6000);
		driver.findElement(By.id("btnAddPos")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("posNumber")).sendKeys("DDMPSIT123");
		driver.findElement(By.id("serialNumber")).sendKeys("DDMPSIT321");
		driver.findElement(By.id("modelNumber")).sendKeys("A920");
		driver.findElement(By.id("purchaseLPO")).sendKeys("12345");
		Select supplier = new Select(driver.findElement(By.id("supplier")));
		supplier.selectByValue("1");
		driver.findElement(By.id("manufacturer")).sendKeys("pAx");
		driver.findElement(By.id("manufacturingYear")).sendKeys("2022");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).click();
		Select devicetype = new Select(driver.findElement(By.id("DeviceTypeAdd")));
		devicetype.selectByValue("1");
		driver.findElement(By.id("posSave")).click();
		

	}

}
