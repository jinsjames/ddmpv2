package Project1.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDMP_PO_CreationAndApproval {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		driver.manage().window().maximize();
		/*
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1sta@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//body/div[11]/div[2]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//body[1]/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/div[1]/ul[1]/li[3]/a[1]/label[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/span[1]/div[1]/button[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/span[1]/div[1]/ul[1]/li[6]/a[1]/label[1]")).click();
		driver.findElement(By.id("txtQuantity")).sendKeys("10");
		driver.findElement(By.id("btnaddproduct")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("btnSaveCollection")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[contains(text(),'Dist1 STA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		*/
		Thread.sleep(6000);
		driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1stm@oq-ddmp.recharge365.com");
		driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("spinv_14")).click();
		

	}

}
