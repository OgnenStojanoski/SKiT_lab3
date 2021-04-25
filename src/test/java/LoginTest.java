import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import po.LoginPage;
import po.ProductPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest{
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = getDriver();
    }

    /*
    @Test
    public void shouldOpen() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }


    @Test
    public void open() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }
    */

    //T1
    @Test
    public void cantLoginWithInvalidCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        //assertTrue(loginPage.isLoaded());
        loginPage.login("SKiTtest", "test_Wrong");
        String errorMessage = loginPage.getErrorMessage();
        assertEquals(errorMessage, "Incorrect username or password.");

    }

    //T2
    @Test
    public void cantLoginWithEmptyCredentials() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("", "");
        String error = loginPage.getErrorMessage();
        assertEquals(error, "Incorrect username or password.");
    }
    //T3
    @Test
    public void shouldLoginOgnen() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("SKiTtest", "test_Password1");
        assertTrue(new ProductPage(driver).isLoaded());
    }



    private WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ognen\\IdeaProjects\\MavenTest\\src\\main\\resources\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
