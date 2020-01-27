package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseWebDriver {
    private static WebDriver driver;
    private BaseWebDriver() {}
    public static WebDriver getDriver(){

        if(driver == null) {
            switch (BaseBrowser.browser) {
                case CHROME: driver = new ChromeDriver(); break;

            }
            driver.manage().window().maximize();
        }
        return driver;
    }
    public static void killDriver(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
