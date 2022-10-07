package Project1.project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DDMP_Automation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		 driver.get("https://partner-portal-app.azurewebsites.net/");
		//  driver.manage().window().maximize();
		  
		  //to login
		  driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist1ita@oq-ddmp.recharge365.com");
		  driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		  driver.findElement(By.id("btnLogin")).click();
		  
		  //to check the title 
		  String ExpectedTitle = "Recharge 365";
		  String acttitle = driver.getTitle();
		  
		  if(ExpectedTitle.equals(acttitle)) {
			  System.out.print("The title is: "+acttitle);
		  }
		  else {
			  System.out.print("Incorrect title ");
		  }
		  
		  
		  // to add a Merchant
		  //explicit wait condition - visibilityOfElementLocated
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));// 1 minute
	      wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("btn_AddPopUp")));
		  WebElement m = driver.findElement(By.xpath("//button[@id='btn_AddPopUp']"));
		  m.click();
		  // General tab page
		  driver.findElement(By.id("sopNames")).sendKeys("Dist1 Merchant13");
		  driver.findElement(By.id("TaxId")).sendKeys("0000000");
		  
		  Select Merchant = new Select(driver.findElement(By.id("MerchantTypeId")));
		  Merchant.selectByValue("5");
		  
		  Select Parent = new Select(driver.findElement(By.id("ParentId")));
		  Parent.selectByValue("2186");
		  
		  Select SalesRep = new Select(driver.findElement(By.id("SalesRepId")));
		  SalesRep.selectByValue("24");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("AddMerchantCategoryId")));
		  Select HCategory = new Select(driver.findElement(By.id("AddMerchantCategoryId")));
		  HCategory.selectByValue("3");
		  
		  driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]")).click();
		  /*
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("ClassificationId")));
		  Select Classification = new Select(driver.findElement(By.id("ClassificationId")));
		  Classification.selectByValue("1");
		  
		   */
		  
		  Select ComType = new Select(driver.findElement(By.id("CompanyTypeId")));
		  ComType.selectByValue("3");
		  
		  driver.findElement(By.id("cr")).sendKeys("8056AUT");
		  driver.findElement(By.id("crExpiryDate")).click();
//		  driver.findElement(By.id("review-expiry")).sendKeys("06/10/2023");
//		  
		  //to upload KYC Doc
	      WebElement uploadKYCdoc = driver.findElement(By.id("uploaddocFile"));
	      uploadKYCdoc.sendKeys("C:\\Users\\RI\\Documents\\Test KYC Doc.pdf");
		  
		 // to Save the General page
	      Thread.sleep(6000);
	      driver.findElement(By.id("btn_Add")).click();
	      //Address tab
	      Thread.sleep(6000);
	      driver.findElement(By.id("addresses")).sendKeys("Doha");
	      driver.findElement(By.id("buildingAdd")).sendKeys("Oxford");
	      driver.findElement(By.id("poBox")).sendKeys("123456");
	      driver.findElement(By.id("nfc")).sendKeys("en000000");
	      driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/button[1]/span[1]")).click();
	      driver.findElement(By.id("StreetNumberAdd")).sendKeys("2");
	      driver.findElement(By.id("ZoneNumberAdd")).sendKeys("4");
	      driver.findElement(By.id("BuildingNumberAdd")).sendKeys("6");
	      driver.findElement(By.id("GPSLatitude")).sendKeys("25.55655");
	      driver.findElement(By.id("GPSLongitude")).sendKeys("51.85655");
	      Select Title = new Select(driver.findElement(By.id("TittleId")));
	      Title.selectByValue("1");
	      driver.findElement(By.id("cntPerson")).sendKeys("James");
	      driver.findElement(By.id("cntdesignation")).sendKeys("Manager");
	      driver.findElement(By.id("PrimaryContactAddress")).sendKeys("Doha");
	      driver.findElement(By.id("mobileNumber")).sendKeys("50994471");
	      driver.findElement(By.id("email")).sendKeys("james@rechargeindia.com");
	      Thread.sleep(6000);
	      driver.findElement(By.id("btn_AddAddress")).click();
	      
	    //Users tab
	      Thread.sleep(6000);
	      Select Title2 = new Select(driver.findElement(By.id("TittleId")));
	      Title2.selectByValue("1"); 
	      driver.findElement(By.id("userName")).sendKeys("James");
	      driver.findElement(By.id("Address")).sendKeys("Doha");
	      driver.findElement(By.id("mobile")).sendKeys("50994471");
	      driver.findElement(By.id("txtEmailId")).sendKeys("james667@rechargeindia.com");
	      driver.findElement(By.id("btn_usersave")).click();
	      Thread.sleep(6000);
	      driver.findElement(By.id("partnerUserSave")).click();
}

}
