package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);

//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);
//
//        this.driver = new ChromeDriver(options);
    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[class=\"octicon octicon-mark-github v-align-middle\"]"))).isDisplayed();
    }
}