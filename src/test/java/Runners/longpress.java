package Runners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.AppiumBy;

public class longpress extends Baseclass{
	@Test
	public void LongPressGesture(){

	        driver.findElement(AppiumBy.accessibilityId("Views")).click();
	        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
	        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	       
	        //longpress gesture code using javascript is added in Base Class
	       
	        WebElement actualelement= driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"][1]"));
	        LongPressAction(actualelement);
	        String SampleMenuText=driver.findElement(By.id("android:id/title")).getText();
	        Assert.assertEquals(SampleMenuText,"Sample menu");
	        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());


	        driver.pressKey(new KeyEvent(AndroidKey.BACK));
	        driver.pressKey(new KeyEvent(AndroidKey.HOME));

	    }

}
