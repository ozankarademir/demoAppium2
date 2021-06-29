package Method;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 3 XL API 30");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.allandroidprojects.getirsample");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.allandroidprojects.getirsample.startup.SplashActivity");
        cap.setCapability("app", "C:\\Users\\Ozan\\Desktop\\GetirSampleTest\\sampleGetir.apk");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver, 20);
    }

    public void untilElementAppear(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy (by));
    }

    public void click(By by, int... index) throws InterruptedException {
        MobileElement e;
        e = driver.findElement(by);
        e.click();
    }

    public List<MobileElement> waitForElements(int seconds, By elementBy) {
        WebDriverWait waitElementInVisible = new WebDriverWait(driver, seconds);
        List element = waitElementInVisible.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elementBy));
        return element;
    }

    public MobileElement findElement(By by) {
        MobileElement list = null;
        list = driver.findElement(by);
        return list;
    }

    public boolean isElementExist(By by, int timeSeconds) {

        driver.manage().timeouts().implicitlyWait(timeSeconds, TimeUnit.SECONDS);
        boolean isExist = driver.findElements(by).size() > 0;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return isExist;
    }

}
