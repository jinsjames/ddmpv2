package Project1.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDMP_PosUsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		
		
		//Login to DDMP Hierarchy portal
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1ita@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		//Selecting POS and POS Users
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[1]/div[1]/ul[1]/li[5]/a[1]")).click(); //Selecting POS
		Thread.sleep(6000);
		driver.findElement(By.id("POS Users")).click();
		
		//Adding Pos Users
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[14]/a[1]/span[1]")).click();
		driver.findElement(By.id("EmployeeCode")).sendKeys("D1M13123");
		driver.findElement(By.name("NationalityId")).sendKeys("0000");
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.id("EmployeeName")).sendKeys("POS Cashier");
		Select employeetype = new Select(driver.findElement(By.id("EmployeeTypeId")));
		employeetype.selectByValue("1");
		
		driver.findElement(By.id("UserID")).sendKeys("123444");
		driver.findElement(By.id("Password")).sendKeys("8055");
		driver.findElement(By.id("AADId")).sendKeys("65651515");
		driver.findElement(By.id("Address")).sendKeys("Doha");
		Thread.sleep(6000);
		driver.findElement(By.id("btnAddSave")).click();

	}

}
