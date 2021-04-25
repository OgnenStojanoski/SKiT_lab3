package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
    public final WebDriverWait wait;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--allow-insecure-localhost");
//        DesiredCapabilities caps = DesiredCapabilities.chrome();
//        caps.setCapability(ChromeOptions.CAPABILITY, options);
//        caps.setCapability("acceptInsecureCerts", true);
//        this.driver = new ChromeDriver(caps);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }
}
