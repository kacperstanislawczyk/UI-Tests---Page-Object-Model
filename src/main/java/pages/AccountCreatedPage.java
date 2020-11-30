package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.EmailUtils;

public class AccountCreatedPage extends BasePage{

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    By accountCreatedHeaderBy = By.cssSelector("div>h1.text-center");
    @FindBy(css = "div>h1.text-center")
    WebElement accountCreatedHeader;

    public String accountCreatedHeaderText = "Account created!";
    private String verifyEmailMessageSubject = "Verify your email for KEF";


    public String getAccountCreatedHeaderText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedHeaderBy));
        return accountCreatedHeader.getText();
    }

    public EmailVerifiedPage openAccountVerificationLink(WebDriver driver, EmailUtils emailUtils) {
        String link = getEmailMessageLink(verifyEmailMessageSubject, emailUtils);
        driver.get(link);
        return new EmailVerifiedPage(driver);

    }

    public EmailVerifiedPage openAlteredAccountVerificationLink(WebDriver driver, EmailUtils emailUtils) {
        String link = getEmailMessageLink(verifyEmailMessageSubject, emailUtils);
        link = link.substring(0,65)+"Broken"+link.substring(65);
        driver.get(link);
        return new EmailVerifiedPage(driver);

    }

}
