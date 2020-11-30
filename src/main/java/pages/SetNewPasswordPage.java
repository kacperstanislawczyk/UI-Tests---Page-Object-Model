package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetNewPasswordPage extends BasePage {

    public String passwordRequiredErrorMessage = "Password is required";
    public String passwordNotMatchText = "Password doesn't match";
    public String passwordStrongErrorMessageText = "Password strength: Strong";

    public String getFirstErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstErrorMessageBy));
        return firstErrorMessage.getText();

    }

    public SetNewPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    By firstErrorMessageBy = By.cssSelector(".notification.error>p");
    @FindBy(css = ".notification.error>p")
    WebElement firstErrorMessage;

    By passwordStrengthErrorMessageBy = By.cssSelector("div:nth-of-type(2) > div:nth-of-type(1) > p");
    @FindBy(css = "div:nth-of-type(2) > div:nth-of-type(1) > p")
    WebElement passwordStrengthWeakErrorMessage;

    By passwordMatchErrorMessageBy = By.cssSelector("div:nth-of-type(3) > .notification.success > p");
    @FindBy(css = "div:nth-of-type(3) > .notification.success > p")
    WebElement passwordMatchErrorMessage;

    By passwordNotMatchErrorMessageBy = By.cssSelector("div:nth-of-type(3) > .error.notification > p");
    @FindBy(css = "div:nth-of-type(3) > .error.notification > p")
    WebElement passwordNotMatchErrorMessage;

    By passwordTextboxBy = By.cssSelector("div:nth-of-type(1) > .form-group > input[type='password']");
    @FindBy(css = "div:nth-of-type(1) > .form-group > input[type='password']")
    WebElement passwordTextbox;

    By passwordRepeatTextboxBy = By.cssSelector("div:nth-of-type(2) > .form-group > input[type='password']");
    @FindBy(css = "div:nth-of-type(2) > .form-group > input[type='password']")
    WebElement passwordRepeatTextbox;

    By submitButtonBy = By.cssSelector(".btn[type=\"submit\"]");
    @FindBy(css = ".btn[type=\"submit\"]")
    WebElement submitButton;

    @FindBy(css = ".mt-4>.text-center")
    WebElement newPasswordSetPopup;

    @FindBy(css = "div#errorAlert___BV_modal_body_ > .my-4")
    WebElement errorMessage;

    By passwordNotMatchingPopupBy = By.cssSelector("");
    @FindBy(css = "")
    WebElement passwordNotMatchingPopup;

    By passwordComplexityNotMetPopUpBy = By.cssSelector("");
    @FindBy(css = "")
    WebElement passwordComplexityNotMetPopUp;


    By passwordSetSuccessHeaderBy = By.cssSelector(".page-header.text-center");
    @FindBy(css = ".page-header.text-center")
    WebElement passwordSetSuccessHeader;

    By passwordWeakErrorMessageCrossBy = By.cssSelector("//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[1]/div[2]/div[1]/i[@class='material-icons'][text()=\"close\"]");
    @FindBy(css = "//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[1]/div[2]/div[1]/i[@class='material-icons'][text()=\"close\"]")
    WebElement passwordWeakErrorMessageCross;

    By passwordStrongErrorMessageCheckBy = By.cssSelector("//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[1]/div[2]/div[1]/i[@class='material-icons'][text()=\"check\"]");
    @FindBy(css = "//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[1]/div[2]/div[1]/i[@class='material-icons'][text()=\"check\"]")
    WebElement passwordStrongErrorMessageCheck;

    By passwordDoNotMatchCrossBy = By.cssSelector("//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[3]/div/i[@class='material-icons'][text()=\"close\"]");
    @FindBy(css = "//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[3]/div/i[@class='material-icons'][text()=\"close\"]")
    WebElement passwordDoNotMatchCross;

    By passwordMatchCheckBy = By.cssSelector("//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[3]/div[@class='notification success']/i[@class='material-icons'][text()=\"check\"]");
    @FindBy(css = "//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']/div[@class='container']/div/div[@class='container']//form/div[@class='form-group']/div[3]/div[@class='notification success']/i[@class='material-icons'][text()=\"check\"]")
    WebElement passwordMatchCheck;

    By resetPasswordCodeInvalidHeaderBy = By.cssSelector(".failure.page-header.text-center");
    @FindBy(css = ".failure.page-header.text-center")
    WebElement resetPasswordCodeInvalidHeader;

    public String newPasswordSetHeaderText = "Your password has been reset!";
    public String passwordNotMatchingErrorMessage = "Password doesn't match";
    public String resetPasswordInvalidCodeHeaderText = "Reset password code is invalid or expired";
    public String passwordWeakErrorMessageText = "Password strength: Weak";
    public String passwordMatchErrorMessageText = "Password matches";

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextboxBy));
        passwordTextbox.sendKeys(password);
        typeCharByChar(passwordTextbox, password);

    }

    private void enterPasswordRepeat(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRepeatTextboxBy));
        passwordRepeatTextbox.sendKeys(password);
        typeCharByChar(passwordRepeatTextbox, password);
    }

    public SetNewPasswordPage enterValidPassword(){
        String password = generatePassword(8, true, true, false, false);
        enterPassword(password);
        return this;

    }

    public SetNewPasswordPage enterStaticPasswordToBothFields(){
        String password = PASSWORD;
        enterPassword(password);
        enterPasswordRepeat(password);
        return this;

    }

    public SetNewPasswordPage enterStaticPasswordRepeat(){
        String password = PASSWORD;
        enterPasswordRepeat(password);
        return this;

    }

    public SetNewPasswordPage enterValidPasswordRepeat(){
        String password = generatePassword(8, true, true, false, false);
        enterPasswordRepeat(password);
        return this;

    }

    public SetNewPasswordPage enterPassNotMeetingRulesToBothFields(){
        String password = generatePassword(7, true, true, false, false);
        enterPassword(password);
        enterPasswordRepeat(password);
        return this;

    }



    public SetNewPasswordPage clickSubmitButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(submitButtonBy));
        submitButton.click();
        return this;
    }

    public boolean isPasswordSetPopupDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mt-4>.text-center")));
        return newPasswordSetPopup.isDisplayed();

    }

    public String getPasswordSetSuccessHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordSetSuccessHeaderBy));
        return passwordSetSuccessHeader.getText();
    }

    public String getResetCodeInvalidHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(resetPasswordCodeInvalidHeaderBy));
        return resetPasswordCodeInvalidHeader.getText();
    }

    public String getPasswordNotMatchingErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordNotMatchingPopupBy));
        return passwordNotMatchingPopup.getText();
    }

    public String getPasswordComplexityNotMetText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordComplexityNotMetPopUpBy));
        return passwordComplexityNotMetPopUp.getText();
    }

    public SetNewPasswordPage clearPasswordFields() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextboxBy));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRepeatTextboxBy));
        passwordTextbox.clear();
        passwordRepeatTextbox.clear();
        return this;

    }

    public void enterValidPasswordToBothFields() {
        String password = "Zxcfgh12";
        enterPassword(password);
        enterPasswordRepeat(password);
    }

    public boolean isPasswordSetSuccessDisplayed() {
        return isWebElementDisplayed(passwordSetSuccessHeader);
    }

    public boolean isPasswordWeakCrossDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordWeakErrorMessageCrossBy));
        return isWebElementDisplayed(passwordWeakErrorMessageCross);

    }

    public boolean isPasswordStrongErrorCheckDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordStrongErrorMessageCheckBy));
        return isWebElementDisplayed(passwordStrongErrorMessageCheck);
    }

    public boolean isPasswordDoNotMatchCrossDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordDoNotMatchCrossBy));
        return isWebElementDisplayed(passwordDoNotMatchCross);

    }

    public boolean isPasswordMatchCheckDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordMatchCheckBy));
        return passwordMatchCheck.isDisplayed();

    }

    public String getPasswordStrengthErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordStrengthErrorMessageBy));
        return passwordStrengthWeakErrorMessage.getText();

    }

    public String getPasswordMatchErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordMatchErrorMessageBy));
        return passwordMatchErrorMessage.getText();

    }

    public String getPasswordMatchText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordNotMatchErrorMessageBy));
        return passwordNotMatchErrorMessage.getText();

    }

}
