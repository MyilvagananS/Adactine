package com.adactine.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactine_baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactine//feature",
glue = "com.adactine.stepdefinition",
monochrome= true ,
dryRun = false,
strict= true,
plugin= {"html:Report/cucumber_html","pretty","json:Report/cucumber_json.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent.html"
}

)
public class Runner1_Class {
public static WebDriver driver;
@BeforeClass
public static void setUp() {
	driver=Base_Class.browser_launch("chrome");
	Base_Class.waite("iwait", null, 30, null);
}
@AfterClass
public static void closei() {
	driver=Base_Class.close();
}
}
