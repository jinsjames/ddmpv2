package Project1.project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DDMP_MerchantOnBoarding {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://partner-portal-app.azurewebsites.net/");
		driver.manage().window().maximize();
		
		  //to login
		  driver.findElement(By.id("txtUsername")).sendKeys("ddmpsitdist2ita@oq-ddmp.recharge365.com");
		  driver.findElement(By.id("txtPassword")).sendKeys("R365@12345");
		  driver.findElement(By.id("btnLogin")).click();
		  

		  
		
		FileInputStream file = new FileInputStream("C:\\Automation\\ExcelSheets\\MerchantOnboarding.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
	
		for(int i=1;i<=rowcount;i++) {
		// to add a Merchant
		//explicit wait condition - visibilityOfElementLocated
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));// 1 minute
		wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("btn_AddPopUp")));
	    WebElement m = driver.findElement(By.id("btn_AddPopUp"));
		m.click();
		XSSFRow currentrow = sheet.getRow(i);
		
		String MerchantName = currentrow.getCell(0).getStringCellValue();
		int L1TicketNo = (int)currentrow.getCell(1).getNumericCellValue();
		int crnum = (int) currentrow.getCell(2).getNumericCellValue();
		String address1 = currentrow.getCell(3).getStringCellValue(); 
		int streetno = (int) currentrow.getCell(4).getNumericCellValue();
		int zonenum = (int) currentrow.getCell(5).getNumericCellValue();
		int builnum = (int) currentrow.getCell(6).getNumericCellValue();
		double gpslat = currentrow.getCell(7).getNumericCellValue();
		double gpslon = currentrow.getCell(8).getNumericCellValue();
		String conper = currentrow.getCell(9).getStringCellValue();
		String desig = currentrow.getCell(10).getStringCellValue();
		String address2 = currentrow.getCell(11).getStringCellValue();
		int mobinum = (int) currentrow.getCell(12).getNumericCellValue();
		String email = currentrow.getCell(13).getStringCellValue();
		String username = currentrow.getCell(14).getStringCellValue();
		String address3 = currentrow.getCell(15).getStringCellValue();
		int mobi2 = (int) currentrow.getCell(16).getNumericCellValue();
		String email2 = currentrow.getCell(17).getStringCellValue();
		
		  // General tab page
		Thread.sleep(6000);
		  driver.findElement(By.id("sopNames")).sendKeys(MerchantName);
		 
		  driver.findElement(By.id("TaxId")).sendKeys(String.valueOf(L1TicketNo));
		  
		  Select Merchant = new Select(driver.findElement(By.id("MerchantTypeId")));
		  Merchant.selectByValue("5");
		  
		  Select Parent = new Select(driver.findElement(By.id("ParentId")));
		  Parent.selectByValue("2192");
		  
		  Select SalesRep = new Select(driver.findElement(By.id("SalesRepId")));
		  SalesRep.selectByValue("38");
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated (By.id("AddMerchantCategoryId")));
		  Select HCategory = new Select(driver.findElement(By.id("AddMerchantCategoryId")));
		  HCategory.selectByValue("3");
		  
		  driver.findElement(By.xpath("//body/div[11]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]")).click();
		  
		  

		  Select Classification = new Select(driver.findElement(By.id("ClassificationId")));
		  Classification.selectByValue("1");
  
		  Select ComType = new Select(driver.findElement(By.id("CompanyTypeId")));
		  ComType.selectByValue("3");
		  
		  driver.findElement(By.id("cr")).sendKeys(String.valueOf(crnum));
  
		  //to upload KYC Doc
	      WebElement uploadKYCdoc = driver.findElement(By.id("uploaddocFile"));
	      uploadKYCdoc.sendKeys("C:\\Users\\RI\\Documents\\Test KYC Doc.pdf");
		  
		 // to Save the General page
	      Thread.sleep(6000);
	      driver.findElement(By.id("btn_Add")).click();
	      
	      
	      //Address tab
	      Thread.sleep(6000);
	      driver.findElement(By.id("addresses")).sendKeys(address1);
	      driver.findElement(By.id("buildingAdd")).sendKeys("Oxford");
	      driver.findElement(By.id("poBox")).sendKeys("123456");
	      driver.findElement(By.id("nfc")).sendKeys("en000000");
	      
	      Select Region = new Select(driver.findElement(By.id("RegionId")));
	      Region.selectByValue("1");
	      Select Area = new Select(driver.findElement(By.id("AreaId")));
	      Area.selectByValue("1");
	      Select Cluster = new Select(driver.findElement(By.id("ClusterId")));
	      Cluster.selectByValue("1");
	      driver.findElement(By.id("StreetNumberAdd")).sendKeys(String.valueOf(streetno));
	      driver.findElement(By.id("ZoneNumberAdd")).sendKeys(String.valueOf(zonenum));
	      driver.findElement(By.id("BuildingNumberAdd")).sendKeys(String.valueOf(builnum));
	      driver.findElement(By.id("GPSLatitude")).sendKeys(String.valueOf(gpslat));
	      driver.findElement(By.id("GPSLongitude")).sendKeys(String.valueOf(gpslon));
	      Select Title = new Select(driver.findElement(By.id("TittleId")));
	      Title.selectByValue("1");
	      driver.findElement(By.id("cntPerson")).sendKeys(conper);
	      driver.findElement(By.id("cntdesignation")).sendKeys(desig);
	      driver.findElement(By.id("PrimaryContactAddress")).sendKeys(address2);
	      driver.findElement(By.id("mobileNumber")).sendKeys(String.valueOf(mobinum));
	      driver.findElement(By.id("email")).sendKeys(email);
	      Thread.sleep(6000);
	      driver.findElement(By.id("btn_AddAddress")).click(); // to Save the Address page
	      
	    //Users tab
	      Thread.sleep(6000);
	      Select Title2 = new Select(driver.findElement(By.id("TittleId")));
	      Title2.selectByValue("1"); 
	      driver.findElement(By.id("userName")).sendKeys(username);
	      driver.findElement(By.id("Address")).sendKeys(address3);
	      driver.findElement(By.id("mobile")).sendKeys(String.valueOf(mobi2));
	      driver.findElement(By.id("txtEmailId")).sendKeys(email2);
	      driver.findElement(By.id("btn_usersave")).click();
	      Thread.sleep(6000);
	      driver.findElement(By.id("partnerUserSave")).click(); // to Save the Users page
	      
	      
	      Thread.sleep(6000);
	      driver.navigate().refresh();
	      Thread.sleep(6000);
		  
	      
			}
		}
	}


