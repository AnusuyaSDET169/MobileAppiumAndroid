package Runners;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import PageObjects_Android.form;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Baseclass {

	public AndroidDriver driver;
	public form formpage;
	
	@BeforeClass
	public void setConfig() throws MalformedURLException, URISyntaxException
	{
		
      //Capabilities of Android device are added using UIautomator2options
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("AnuAndroidEmulator");
       
        // options.setApp("//Users//anusuyaselvaraj//codebase//AppiumAndroid//src//test//java//Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
        options.setApp("//Users//anusuyaselvaraj//codebase//AppiumAndroid//src//test//java//ApiDemos-debug.apk");
      
        //Any Appium/java code--->Appium server- it redirects the actions to be executed in --> Android Virtual Device (UIAutomator2)
       
        //Android driver
     
        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        formpage = new form(driver);

	}
        public void LongPressAction(WebElement actualelement)
        {
            ((JavascriptExecutor)driver).executeScript("mobile:longClickGesture",
                    ImmutableMap.of("elementId",((RemoteWebElement)actualelement).getId(),
                            "duration",2000));
        }
    
/*
@AfterClass
    public void closeAndExit(){

driver.quit();
//service.stop();

    }*/
        
        //options.setChromedriverExecutable("//Users//anusuyaselvaraj//Downloads//chromedriver 2");
        //invoking driver which is used to automate on Android devices
}
