// ACCELERATOR APPLICATION 1.6.11

package amazon;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import android.content.Intent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AcceleratorProdApp {
	public static void main1 (String args[]) {
		AndroidDriver<MobileElement> driver;
	
	}
	
	public void invokeLogin() throws MalformedURLException {

		DesiredCapabilities capabilities;

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/AcceleratorApp/");
		File app = new File(appDir, "Accelerator_debug3.0test.apk");

		capabilities = new DesiredCapabilities();

		// capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Galaxy Tab E");
		capabilities.setCapability("autoWebview", "true");
		capabilities.setCapability("CapabilityType.BROWSER_NAME", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("appium-version", "1.3.2.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.navistar.writeup");
		capabilities.setCapability("appActivity", "com.navistar.writeup.AcceleratorActivity");
		capabilities.setCapability("newCommandTimeout", 60 * 5);
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		String contexts = driver.getContext();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Set<String> contextNames = driver.getContextHandles();
		for (String contextNameval : contextNames) {
			System.out.println("Context Name " + contextNameval); // prints out something like [NATIVE_APP,
																	// WEBVIEW_<APP_PKG_NAME>]
		}
		driver.context("WEBVIEW_com.navistar.writeup");
		contexts = driver.getContext();
		System.out.println("Android Activity " + driver.currentActivity());
		System.out.println("Current Context " + contexts);
		org.openqa.selenium.remote.RemoteWebElement el1 = (org.openqa.selenium.remote.RemoteWebElement) driver
				.findElementByName("username");
		el1.click();
		el1.sendKeys("u01n233");
		// ("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.widget.GridView/android.view.View[1]/android.view.View[2]/android.widget.EditText");
		org.openqa.selenium.remote.RemoteWebElement el2 = (org.openqa.selenium.remote.RemoteWebElement) driver
				.findElementById("password");
		el2.click();
		el2.sendKeys("Lombard.12");

		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		el1 = driver.findElementsByClassName("button").get(1); // It Logins here.//

		System.out.println(" login button " + el1.toString());
		System.out.println("Current Context for login button " + contexts);
		// System.out.println("L74- MobileElement" + el4.toString());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		el1.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.context("NATIVE_APP"); // (Now starts the Native part of the testing)
		contexts = driver.getContext();
		System.out.println("Android Activity " + driver.currentActivity());
		System.out.println("Current Context " + contexts);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Setting up Dealer Account//

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

		
		TouchAction<?> touchAction = new TouchAction(driver);
		touchAction.tap(PointOption.point(1160, 591)).perform();
		

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

		
		TouchAction<?> touchAction1 = new TouchAction(driver);
		touchAction1.tap(PointOption.point(1163, 594)).perform();
		
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText")
				.click();

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.EditText")
				.sendKeys("IL");
		// el3.sendKeys("IL");
		
		TouchAction<?> touchAction2 = new TouchAction(driver);
		touchAction2.tap(PointOption.point(1160, 597)).perform();
		
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.EditText")
				.click();

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.EditText")
				.sendKeys("60786");

		TouchAction<?> touchAction3 = new TouchAction(driver);
		touchAction3.tap(PointOption.point(1169, 600)).perform();
		
		
		// el3.sendKeys("60786");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("USA");

		TouchAction<?> touchAction4 = new TouchAction(driver);
		touchAction4.tap(PointOption.point(1173, 594)).perform();
		
		
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("8467927729");

		
		TouchAction<?> touchAction5 = new TouchAction(driver);
		touchAction5.tap(PointOption.point(566, 566)).perform();
		
		
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// el3 = (MobileElement)
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.EditText")
				.sendKeys("1234567890");

		TouchAction<?> touchAction6 = new TouchAction(driver);
		touchAction6.tap(PointOption.point(575, 566)).perform();
		
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

		// Setting Up ONCOMMAND LINK DEVICE//;
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		// el3 = (MobileElement)
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.sendKeys("F307F2F5");

		TouchAction<?> touchAction7 = new TouchAction(driver);
		touchAction7.tap(PointOption.point(1169, 591)).perform();
		
	
		// el3 = (MobileElement)
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
				.sendKeys("bcfRleuMrAUCi4");

		
		TouchAction<?> touchAction8 = new TouchAction(driver);
		touchAction8.tap(PointOption.point(1173, 597)).perform();
		
		
		// driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		el3 = driver.findElementsByClassName("android.widget.Button").get(1);
		el3.click();

		// Start a New WriteUP if coming from Dealer Setting//

		el1 = driver.findElementsByClassName("android.widget.Button").get(1);
		el1.click();

		// POP UP BOX will not come if coming from Dealer Setting
		/// MobileElement el19 = (MobileElement)
		/// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.Button").click();
		/// el19.click();

		// CUSTOMER INFORMATION:
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.findElementByClassName("android.widget.EditText").sendKeys("fh035330");

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.Button")
				.click();

		driver.findElementsByClassName("android.widget.Button").get(1);

		// COLLECT VEHICLE REASON FOR SERVICE:/// 3 lines is the code///

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
				.click();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// Engine/AfterTreatment
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
				.click();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// Engine:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup")
				.click();

		// Starting:
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		// (new TouchAction(driver)).tap(490, 326).perform();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup")
				.click();

		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup").click();

		// Hard Start:
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup").click();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup")
				.click();

		// Engine is Hard to start
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
				.click();

		// Unknown/None
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// (new TouchAction(driver)).tap(487, 326).perform();
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView")
				.click();

		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView").click();

		// SAVE
		// driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		el1 = driver.findElementsByClassName("android.widget.Button").get(1);
		el1.click();
		// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[2]/android.widget.Button").click();

		// CAPTURE PAGE

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
				.click();

		// POPUP ICON
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// SET DATE:
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
				.click();

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.TextView")
				.click();

		// (new TouchAction(driver)).tap(714, 597).perform().tap(el1);

		// CAPTURE AND TRUCk PHOTOS:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
				.click();

		// Photo1:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
				.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Photo2:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
				.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		/// driver.findElementsByClassName("android.widget.Button").get(0);
		/// el1.click();
		// (new TouchAction(driver)).tap(635, 759).press(el1);

		// Photo3:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
				.click();

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();

			System.out.println(e.getMessage());
		}

		// Photo4:

		System.out.println("clicking camera 4 times");

		el1 = driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup");
		if (el1.isSelected()) {
			el1.click();
			System.out.println("clicking camera : selected 4 times");
		} else {
			System.out.println("Unable to Select camera");
			MobileElement el12 = (MobileElement) driver.findElementByXPath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup");
			el12.click();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();

				System.out.println(e.getMessage());
			}

			System.out.println("clicking camera : selected 4 times");
		}

		// CONNECT STEP:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
				.click();

		// Connect Box:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout[1]/android.view.ViewGroup")
				.click();

		try {
			Thread.sleep(100000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// POPUP ICON
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// AGREE STEP:

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.").click();

		// SIGNATURE:
		
		
	//	(new TouchAction(driver)).press(133, 553).moveTo(123, -3).release().perform();

		/// driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView").click();

		// Possession of Vehicle:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// Condition of Vehicle:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.Button")
				.click();

		// REASON For SERVICE:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.Button")
				.click();

		// Dealer Terms And Conditions:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// I Do Not Want An Estimate:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.Button")
				.click();

		// Scroll Down//

	//	(new TouchAction(driver)).press(1210, 661).moveTo(10, -143).release().perform();

		// CONFIRM:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// SUBMIT BUTTON:
		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.Button")
				.click();

		// SUBMIT WRITEUP TO CONFIRM

		driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout[2]/android.widget.Button")
				.click();

	}

	public static void main(String[] args) throws MalformedURLException {
		AcceleratorProdApp myObj = new AcceleratorProdApp();
		myObj.invokeLogin();

	}

}

