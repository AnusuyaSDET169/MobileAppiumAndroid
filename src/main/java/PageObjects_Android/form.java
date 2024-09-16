package PageObjects_Android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class form {
	public AndroidDriver driver;
	
	public form(AndroidDriver driver)
	{
		
		this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		
	}
	
    @AndroidFindBy(id="test-Username")
    private WebElement uname;
	
    @AndroidFindBy(id="test-Password")
    private WebElement pwd;
    
    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement login;
    
    
    public void formsignin()
    {
    	uname.sendKeys("Anusuya");
    	pwd.sendKeys("Vinod");
    	login.click();
    }
}
