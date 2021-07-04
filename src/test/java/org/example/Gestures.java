package org.example;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends BaseClass{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver= setupApp();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Tap
        TouchAction t =new TouchAction(driver);
        WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandList))).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
    }
}
