package dev.snapgram.runners;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dev.snapgram.pages.AddPhotoPage;
import dev.snapgram.pages.LoginPage;
import dev.snapgram.pages.RegisterPage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "dev.snapgram.stepdefinitions")
public class SnapGramRunner {

	public static WebDriver driver;
	public static LoginPage loginPage;
	public static RegisterPage registerPage;
//	public static AddPhotoPage addPhotoPage;
	@BeforeClass
	public static void setUp() {
		File file = new File("src\\main\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		registerPage = new RegisterPage(driver);
//		addPhotoPage = new AddPhotoPage(driver);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
