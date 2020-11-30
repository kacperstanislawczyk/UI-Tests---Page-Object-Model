import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utils.EmailUtils;

import java.util.ArrayList;

public class BaseTest {

    WebDriver driver;
    EmailUtils emailUtils;
    LoginPage loginPage;
    SoftAssert softAssert;
    private String browser;

    @Parameters({"webBrowser"})
    @BeforeClass(alwaysRun = true)
    public void beforeTestSetBrowser(@Optional("chrome") String webBrowser) {
        switch (webBrowser) {
            case "chrome":
                browser = "chrome";
                break;
            case "firefox":
                browser = "firefox";
                break;
            case "edge":
                browser = "edge";
                break;
            case "opera":
                browser = "opera";
                break;
        }
    }

    public void closeAndReopenLoginPage(){
        driver.close();
        driver =  new ChromeDriver();
        getLoginPageMobileCallbackProd();

    }

    public void setupDriver(){
        if (browser == "chrome"){
            WebDriverManager.chromedriver().setup();
            driver =  new ChromeDriver();
            driver.manage().deleteAllCookies();
            loginPage = new LoginPage(driver);
            softAssert = new SoftAssert();}
        else if (browser == "firefox"){
            WebDriverManager.firefoxdriver().setup();
            driver =  new FirefoxDriver();
            driver.manage().deleteAllCookies();
            loginPage = new LoginPage(driver);
            softAssert = new SoftAssert();}
        else if (browser == "edge"){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
            loginPage = new LoginPage(driver);}
        else if (browser == "opera"){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.manage().deleteAllCookies();
            loginPage = new LoginPage(driver);}

    }

    public void connectToEmail(){
        String emailAddress = "kstezt@gmail.com";
        String emailPassword = "Zxcfgh12";
        try {
            emailUtils = new EmailUtils(emailAddress, emailPassword, "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    public void getLoginPageMobileCallbackProd(){
        driver.get("https://kefid.kef.com/auth/login/?callbackUrl=mobile");

    }

    public void getLoginPageInNewTab(){
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://kef-lucifer.web.app/");

    }

    public void getLoginPageShopifyCallbackProd(){
        //driver.get("https://kef-lucifer.web.app/auth/login/?callbackUrl=https%3A%2F%2Fkef-staging-uk.myshopify.com%2F&lang=de\n");
        driver.get("https://kefid.kef.com/auth/login/?callbackUrl=https%3A%2F%2Fkef-staging-uk.myshopify.com%2F&lang=de");
    }

    public void getShopifyAdminPage(){
        driver.get("https://kef-staging-uk.myshopify.com/admin");

    }

    public void getShopifyPage(){
        driver.get("https://kef-staging-uk.myshopify.com/");
    }


    public void closeDriver(){
        driver.close();

    }

    public void deleteEmails(){
        emailUtils.deleteAllEmails();

    }





}
