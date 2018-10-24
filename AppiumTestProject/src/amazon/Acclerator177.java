package amazon;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Acclerator177 {
	
	AndroidDriver<MobileElement> driver;
	
	public void openLogin() throws MalformedURLException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/AcceleratorApp/");
		File app = new File(appDir, "Accelerator.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Galaxy Tab E");
		capabilities.setCapability("autoWebview", "true");
		capabilities.setCapability("CapabilityType.BROWSER_NAME", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appium-version", "1.6.2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.navistar.writeup");
		capabilities.setCapability("appActivity", "com.navistar.writeup.AcceleratorActivity");
		capabilities.setCapability("autoWebview", "false");
		capabilities.setCapability("newCommandTimeout", 60 * 5);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		String contexts = driver.getContext();
		Set<String> contextNames = driver.getContextHandles();
		for (String contextNameval : contextNames) {
			System.out.println("Context Name " + contextNameval); // prints out something like [NATIVE_APP,	// WEBVIEW_<APP_PKG_NAME>]
			
		driver.context("NATIVE_APP");
		contexts = driver.getContext();
		System.out.println("Android Activity " + driver.currentActivity());
		System.out.println("Current Context " + contexts);
		}
		
		// LOGIN PAGE //
		MobileElement el1 = (MobileElement) driver.findElementById("username");
		el1.click();
		el1.sendKeys("u01n233");
		
		MobileElement el2 = (MobileElement) driver.findElementById("password");
		el2.click();
		el2.sendKeys("Cricket.12");
		
		driver.hideKeyboard();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//el1 = driver.findElementsByClassName("button").get(1); // It Logins here.//
//el1.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.widget.GridView/android.view.View[3]/android.view.View[2]/android.widget.Button");
		el3.click();
		System.out.println("Current Context for login button " + contexts);
		
	}		
	/// Release Notes ///
		
		public void releaseNotes() {
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
			.click();
			
			System.out.println("releasenotes printed");
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.Button").click();
			
		}
		
			
	// Setting up Dealer Account//
	
	public void dealerSettings() {
		
						
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("Test Dealer");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout[1]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("610972");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("000");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("1000 darvey rd");
		
		TouchAction<?> touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(1177, 599)).perform();
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[1]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[1]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("Lisle");
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		 .click();
		
		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		 .sendKeys("IL");
		
		 driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.click();	
		 
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("60148");
		
		TouchAction<?> touchAction1 = new TouchAction(driver);
		touchAction1.tap(PointOption.point(1172, 601)).perform();
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("USA");
		
		TouchAction<?> touchAction2 = new TouchAction(driver);
		touchAction1.tap(PointOption.point(1182, 599)).perform();
		
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		 driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		 .click();
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("8749854785");
		
		
			
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
	.click();				
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.FrameLayout/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("5858555555");
		
		driver.hideKeyboard();
		
		Object dealerSettings;
		Object completes = null;
		if((boolean) (dealerSettings = completes != null)) {
			System.out.println("dealer settings completed");
		}
		else {
			System.out.println("dealer settings failed");
		}
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.Button")
		.click();
	}

	public void ocLink() {
		
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.Button");
		el1.click();
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/TextInputLayout/android.widget.FrameLayout/android.widget.EditText")
		.sendKeys("9D848A3D");
		
		TouchAction<?> touchAction3 = new TouchAction(driver);
		touchAction3.tap(PointOption.point(1177, 596)).perform();
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/TextInputLayout/android.widget.FrameLayout/android.widget.EditText");
		el1.sendKeys("honfVnxEv2Z397");
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.Button");
		el1.click();
	
		
	}
	
	public static void main(String[] args) throws MalformedURLException {
		Acclerator177 myObj = new Acclerator177();
		myObj.openLogin();
		myObj.releaseNotes();
		myObj.dealerSettings();
		myObj.ocLink();

	}

}
