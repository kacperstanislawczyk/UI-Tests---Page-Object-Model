package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.EmailUtils;

public class ResetPasswordLinkSentPage extends BasePage {

    public ResetPasswordLinkSentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);

    }

    By successMessageBy = By.cssSelector(".page-header.text-center");
    @FindBy(css = ".page-header.text-center")
    WebElement successMessage;

    public String successMessageText = "Success!";

    public Boolean isSuccessMessageDisplayed(){
        return isWebElementDisplayed(successMessage);
    }

    public SetNewPasswordPage openModifiedResetPasswordLink(WebDriver driver, EmailUtils emailUtils) {
        String link = getEmailMessageLink("Reset your password for KEF", emailUtils);
        link = link.substring(0,67)+"Broken"+link.substring(67);
        System.out.println("The link has been modified.");
        driver.get(link);
        return new SetNewPasswordPage(driver);
    }

    public SetNewPasswordPage openResetPasswordLink(WebDriver driver, EmailUtils emailUtils) {
        String link = getEmailMessageLink("Reset your password for KEF", emailUtils);
        driver.get(link);
        return new SetNewPasswordPage(driver);
    }
}
