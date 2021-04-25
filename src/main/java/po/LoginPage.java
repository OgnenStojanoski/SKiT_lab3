package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);

//        Map<String, Object> prefs = new HashMap<String, Object>();
//        prefs.put("profile.default_content_setting_values.notifications", 2);
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("prefs", prefs);

//        this.driver = new ChromeDriver(options);
    }

    public void open() {
        driver.get("https://www.github.com/login");
//        driver.findElement(By.className("_3Wg53T10KuuPmyWOMWsY2F _2iuoyPiKHN3kfOoeIQalDT _2tU8R9NTqhvBrhoNAXWWcP HNozj_dKjQZ59ZsfEegz8 _2nelDm85zKKmuD94NequP0")).click();
    }

    public boolean isLoaded() throws InterruptedException {
        Thread.sleep(5000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("header-logo"))).isDisplayed();
    }

    public void login(String user, String password) throws InterruptedException {
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys(user);
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
        Thread.sleep(5000);
    }

    public String getErrorMessage() {
        //WebElement errorPage = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
        WebElement errorPage = driver.findElement(By.xpath("//div[@class=\"container-lg px-2\"]"));
        return errorPage.getText();
    }
}
