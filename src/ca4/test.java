package ca4;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class test {
	WebDriver driver;
	
	
	   @Parameters({"browser","url"})
	   @BeforeTest
	   public void setUp(String browser,String url) {
		 
	       if(browser.equalsIgnoreCase("chrome")) {
	           WebDriverManager.chromedriver().setup();
	           driver = new ChromeDriver();
	       }
	       else if(browser.equalsIgnoreCase("edge")) {
	           WebDriverManager.edgedriver().setup();
	           driver = new EdgeDriver();
	       }
	       driver.get(url);
	      }
	
	 
	
	@Test
     public  void test1() throws InterruptedException  {
		  
		
	       
			 
	      
	       
	      
		
	}
	
	
	
//	  @AfterTest 
//	  public void close(){
//		  driver.close();
//		  }
	
	}
