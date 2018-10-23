package amazon;

import org.testng.annotations.Test;

import android.webkit.WebView;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.remote.DesiredCapabilities;


public class AcceleratorTestNGFullTest {
	AndroidDriver<MobileElement> driver;


     public void mainTest() throws MalformedURLException {
		DesiredCapabilities capabilities;

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/AcceleratorApp/");
		File app = new File(appDir, "Accelerator.apk");

		capabilities = new DesiredCapabilities();

		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Galaxy Tab E");
		capabilities.setCapability("autoWebview", "true");
		capabilities.setCapability("CapabilityType.BROWSER_NAME", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appium-version", "1.6.1");
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
			System.out.println("Context Name " + contextNameval); // prints out something like [NATIVE_APP,
																	// WEBVIEW_<APP_PKG_NAME>]
		}
		driver.context("NATIVE_APP");
		contexts = driver.getContext();
		System.out.println("Android Activity " + driver.currentActivity());
		System.out.println("Current Context " + contexts);

	
		MobileElement el1 = (MobileElement) driver.findElementById("username");
		el1.click();
		el1.sendKeys("u01n233");
		
		
		MobileElement el2 = (MobileElement) driver.findElementById("password");
		el2.click();
		el2.sendKeys("Cricket.12");
		
		
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(1164, 596)).perform();
		
	    System.out.println(" login button " + el1.toString());
 	    String contexts1 = null;
		System.out.println("Current Context for login button " + contexts1);
		//ystem.out.println("L74- MobileElement" + el4.toString());
	   // el1.click();
		}
     	
	public void beforeTest1() {
				
		MobileElement el1 = (MobileElement) driver.findElementById("com.navistar.writeup:id/titanium_ui_checkbox");
		el1.click();
		
		//driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button").get(0).click();
	}
	
     	
	public void releaseNotes () {
		
		
	}
	
	// Setting up Dealer Account//

	@Test(priority = 1)
	public void dealerSettings() {
		MobileElement el3 = (MobileElement) driver.findElementByClassName("android.widget.Button"); // Setting up dealer
																									// settings//

		el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("Test Dealer");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.EditText")
				.sendKeys("000099");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText")
				.sendKeys("000");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("1000 Darvey rd");

//		(new TouchAction(driver)).tap(1160, 591).perform();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.EditText")
				.sendKeys("Lisle");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

//		(new TouchAction(driver)).tap(1163, 594).perform();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText")
				.click();

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText")
				.sendKeys("IL");
		// el3.sendKeys("IL");
	//	(new TouchAction(driver)).tap(1160, 597).perform();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.EditText")
				.click();

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.EditText")
				.sendKeys("60786");

//		(new TouchAction(driver)).tap(1169, 600).perform();
		// el3.sendKeys("60786");

		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("USA");

//		(new TouchAction(driver)).tap(1173, 594).perform();
		/// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.hideKeyboard();
		/// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("8467927729");

//		(new TouchAction(driver)).tap(566, 566).perform();
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// el3 = (MobileElement)
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("1234567890");

//		(new TouchAction(driver)).tap(575, 566).perform();

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

	}

	@Test(priority = 2)
	public void onCommandLink() {

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.sendKeys("9D848B77");

//		(new TouchAction(driver)).tap(1169, 591).perform();

		// el3 = (MobileElement)
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.sendKeys("Bpg1ZN4q8xR0Gm");

//		(new TouchAction(driver)).tap(1173, 597).perform();

		MobileElement el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

		el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

	}

	// CUSTOMER INFORMATION:
	@Test(priority = 3)
	public void customerInfo() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.EditText");
		el1.sendKeys("fh035330");

		// Search VIN BOX
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.Button")
				.click();
			}
	 
		

	public static void main(String[] args) throws MalformedURLException {
		AcceleratorTestNGFullTest myObj = new AcceleratorTestNGFullTest();
		myObj.mainTest();
		myObj.beforeTest1();
		myObj.releaseNotes();
		myObj.dealerSettings();
		myObj.onCommandLink();
		myObj.customerInfo();

	}
}
