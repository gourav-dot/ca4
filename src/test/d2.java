package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class d2 {
	WebDriver driver;
	
	
	   
	   @BeforeTest
	   public void setUp() throws InterruptedException {
		     
	       
	           WebDriverManager.chromedriver().setup();
	           driver = new ChromeDriver();
	       
	      
	       driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	       driver.manage().window().maximize();
	       Thread.sleep(15000);
	      }
	
	 
	 
	@Test
     public  void dropdownMethod(){
		
		//for dropdown
		    Select dropdown = new Select(driver.findElement(By.id("dropdowm-menu-1")));
	               dropdown.selectByVisibleText("SQL");
	        Select dropdown2 = new Select(driver.findElement(By.id("dropdowm-menu-2")));
	               dropdown2.selectByVisibleText("JUnit");
	        Select dropdown3 = new Select(driver.findElement(By.id("dropdowm-menu-3")));
	               dropdown3.selectByVisibleText("JQuery");
	}
	     @Test
	  public  void checkBoxMethod(){
	    //for Checkbox
	       //checkbox1
	            driver.findElement(By.cssSelector("input[value='option-1']")).click();
	       
	       // checkbox3 
	            driver.findElement(By.cssSelector("input[value='option-3']")).click();

	        //checkbox4
	            driver.findElement(By.cssSelector("input[value='option-4']")).click();
	  }
          @Test
          public  void RadioButtonMethod(){
	        // radion button 
	            driver.findElement(By.cssSelector("input[value='purple']")).click();
	        
		 }
	
	
	
//	  @AfterTest 
//	  public void close(){
//		  driver.close();
//		  }
	
	}