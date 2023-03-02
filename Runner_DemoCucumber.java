package runnercuccumber.org;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base.com.Base_new;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kavin\\eclipse-workspace\\Maven_11\\FeatureFile\\Adactin.feature",glue = "Step_DemoCucumber",plugin = "html:target/report.html")


public class Runner_DemoCucumber extends Base_new{

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
	
     BrowserLaunch();
     
      
       
	}
	@AfterClass
	public static void teardown() {
      Quit();
	}
	
	
	
	
	
}
