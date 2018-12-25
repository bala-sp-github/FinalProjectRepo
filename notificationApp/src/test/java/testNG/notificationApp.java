package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class notificationApp {
	
	WebDriver driver;
	WebElement dname;
	
  @Test
  public void verify() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  //dname = driver.findElement(By.("deviceId"));
	  //AssertJUnit.assertEquals("ac:00:00:01", dname);

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","/home/bala/Downloads/geckodriver");
	  driver = new FirefoxDriver();
	  driver.get("http://localhost:8081/notificationapp-1/devices");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
