package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.EmailUtils;

public class ForgotPasswordPage extends BasePage{

    public String successHeaderText = "Success!";

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);

    }

    By emailTextboxBy = By.cssSelector("input[type='email']");
    @FindBy(css = "input[type='email']")
    WebElement emailTextbox;

    By sendPasswordResetButtonBy = By.cssSelector(".btn-box>.btn");
    @FindBy(css = ".btn-box>.btn")
    WebElement sendPasswordResetButton;

    By errorMessageBy = By.cssSelector(".notification.error>p");
    @FindBy(css = ".notification.error>p")
    WebElement errorMessage;

    By successHeaderBy = By.cssSelector(".page-header.text-center");
    @FindBy(css = ".page-header.text-center")
    WebElement successHeader;

    /*By invalidEmailErrorMessageBy = By.cssSelector(".notification.error>p");
    @FindBy(css = ".notification.error>p")
    WebElement invalidEmailErrorMessage;*/

    public String invalidEmailErrorMessage = "Email is invalid";
    String resetPasswordEmailMessageSubject = "Reset your password for KEF ID";
    public String emailRequiredErrorMessageText = "Email is required";
    public String noCorrespondingUserErrorMessageText = "There is no user record corresponding to this email, please try another one.";

    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextboxBy));
        emailTextbox.sendKeys(email);

    }

    public ForgotPasswordPage enterValidEmail(){
        enterEmail("kstezt@gmail.com");
        return this;

    }

    public ForgotPasswordPage enterInvalidEmail(){
        String randomString = generateRandomPart(15,true,true,true,true,"invalidEmail");
        enterEmail(randomString);
        return this;
    }

    public ResetPasswordLinkSentPage clickSendPasswordResetButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sendPasswordResetButtonBy));
        sendPasswordResetButton.click();
        return new ResetPasswordLinkSentPage(driver);

    }

    public SetNewPasswordPage openResetPasswordLink(WebDriver driver, EmailUtils emailUtils) {
        String link = getEmailMessageLink(resetPasswordEmailMessageSubject, emailUtils);
        driver.get(link);
        return new SetNewPasswordPage(driver);

    }

    public String getErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageBy));
        return errorMessage.getText();
    }


    public ForgotPasswordPage enterValidNotRegisteredEmail() {
        String randomPart = generateRandomPart(7,true,true,true,false,"validNotRegisteredEmail");
        String validNotRegisteredEmail = "kstezt+"+randomPart+"@gmail.com";
        enterEmail(validNotRegisteredEmail);
        return this;
    }

    public String getSuccessHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successHeaderBy));
        return successHeader.getText();

    }
}
