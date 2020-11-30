package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfterLoginPage extends BasePage{




    public AfterLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    By verificationLinkAlreadySentErrorMessageBy = By.xpath("//div[@class='notification error']/p[contains(text(), 'Verification email has been already sent')]");
    @FindBy(xpath = "//div[@class='notification error']/p[contains(text(), 'Verification email has been already sent')]")
    WebElement verificationLinkAlreadySentErrorMessage;

    By loginSuccessHeaderBy = By.cssSelector(".page-header.text-center");
    @FindBy(css = ".page-header.text-center")
    WebElement loginSuccessHeader;



    public String loginSuccessHeaderText = "Login success!";
    public String verificationLinkAlreadySentErrorMessageText = "Verification email has been already sent, if you don't receive it in the next 60 seconds, try again";
    public String accountNotVerifiedMessageText = "Please verify the account or resend verification email.";



    public String getLoginSuccessHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccessHeaderBy));
        return loginSuccessHeader.getText();
    }

    private By accountNotVerifiedMessageBy = By.cssSelector(".msg.text-center");
    @FindBy(css = ".msg.text-center")
    WebElement accountNotVerifiedMessage;

    private By resendVerificationEmailButtonBy = By.cssSelector(".modal-content .btn");
    @FindBy(css = ".modal-content .btn")
    WebElement resendVerificationEmailButton;

    public VerificationEmailResentPage clickResendVerificationEmailButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(resendVerificationEmailButtonBy));
        resendVerificationEmailButton.click();
        return new VerificationEmailResentPage(driver);
    }

    public String getAccountNotVerifiedMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountNotVerifiedMessageBy));
        return accountNotVerifiedMessage.getText();
    }

    public String getVerificationLinkAlreadySentErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(verificationLinkAlreadySentErrorMessageBy));
        return verificationLinkAlreadySentErrorMessage.getText();
    }

    public ShopifyComingSoonPage redirectToShopify(){
        return new ShopifyComingSoonPage(driver);
    }

    public boolean isLoginSuccessHeaderDisplayed(){
        long end = System.currentTimeMillis() + 3500;
        while (System.currentTimeMillis() < end) {
            try{
                if (loginSuccessHeader.isDisplayed()) {
                    return true;
                }
            } catch(Exception e){if (System.currentTimeMillis() >= end){
                break; }
            }
        }return false;
    }



}
