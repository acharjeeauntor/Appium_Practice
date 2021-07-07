package org.example;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends BaseClass {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = setupApp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
/* Important Notes
1.If any action is happened then must use perform at end to execute the action
2. we can use android Api using findElementsByAndroidUIAutomator(). For scroll down no appium code can execute but we can use Android api to scroll
3. use .longPress(element(source)) when no other class is depend on webElement otherwise we need to use
.longPress(LongPressOptions.longPressOptions().withElement(element(select15)).withDuration(Duration.ofSeconds(1)))





*/

        // Tap
//        TouchAction t =new TouchAction(driver);
//        WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//        t.tap(tapOptions().withElement(element(expandList))).perform();
//        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
//        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");

        // Long Press
//        t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
//        Thread.sleep(2000);
//        if(driver.findElementById("android:id/title").isDisplayed()==true){
//            System.out.println("Test passed");
//        }

        // Swap
//        driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
//        driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
//        driver.findElementByXPath("//*[@content-desc='9']").click();
//        TouchAction t = new TouchAction(driver);
//        WebElement select15 = driver.findElementByXPath("//*[@content-desc='15']");
//        WebElement select45 = driver.findElementByXPath("//*[@content-desc='45']");
//        t.longPress(LongPressOptions.longPressOptions().withElement(element(select15)).withDuration(Duration.ofSeconds(1))).moveTo(element(select45)).release().perform();

        // Scroll
        //driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"))");


        // Drag and Drop
        driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
        TouchAction t = new TouchAction(driver);
        WebElement source = driver.findElementById("io.appium.android.apis:id/drag_dot_1");
        WebElement destination = driver.findElementById("io.appium.android.apis:id/drag_dot_3");
        // t.longPress(LongPressOptions.longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
        t.longPress(element(source)).moveTo(element(destination)).release().perform();
        if(driver.findElementById("io.appium.android.apis:id/drag_text").isDisplayed()){
            System.out.println("Test Passed");
        }
    }
}
