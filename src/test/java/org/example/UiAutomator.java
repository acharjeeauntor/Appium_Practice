package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiAutomator extends BaseClass{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver= setupApp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // driver.findElementByAndroidUIAutomator("attribute("value")")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        //  driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
    }

}
