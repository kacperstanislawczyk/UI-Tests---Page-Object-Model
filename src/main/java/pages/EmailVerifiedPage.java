package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailVerifiedPage extends BasePage{


;

    public EmailVerifiedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    private By emailVerifiedHeaderBy = By.cssSelector(".page-header.text-center");
    @FindBy (css = ".page-header.text-center")
    WebElement emailVerifiedHeader;

    private By verificationCodeInvalidOrExpiredHeaderBy = By.xpath("//h1[1][contains(text(), \"Verification code is invalid or expired\")]");
    @FindBy(xpath = "//h1[1][contains(text(), \"Verification code is invalid or expired\")]")
    WebElement verificationCodeInvalidOrExpiredHeader;

    @FindBy(css = "div#errorAlert___BV_modal_body_ > .my-4")
    WebElement errorMessage;

    By accountVerifiedMessageBy = By.cssSelector(".msg.text-center");
    @FindBy(css = ".msg.text-center")
    WebElement accountVerifiedMessage;

    public String verificationCodeInvalidOrExpiredHeaderText = "Verification code is invalid or expired";
    public String emailVerifiedHeaderText = "Email Address Verified!";
    public String emailVerifiedMessageText = "Thank you for verifying your email address.";

    public String getEmailVerifiedHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailVerifiedHeaderBy));
        wait.until(ExpectedConditions.textToBePresentInElement(emailVerifiedHeader, "Email Address Verified!"));
        return emailVerifiedHeader.getText();
    }

    public String getVerificationCodeInvalidOrExpiredHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(verificationCodeInvalidOrExpiredHeaderBy));
        return verificationCodeInvalidOrExpiredHeader.getText();
    }

    public String getErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#errorAlert___BV_modal_body_ > .my-4")));
        return errorMessage.getText();
    }

    public String getEmailVerifiedMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountVerifiedMessageBy));
        return accountVerifiedMessage.getText();

    }

}
