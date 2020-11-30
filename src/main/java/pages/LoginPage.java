package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    private By emailTextboxBy = By.cssSelector("input[type='email']");
    @FindBy(css = "input[type='email']")
    WebElement emailTextbox;

    private By passwordTextboxBy = By.cssSelector("input[type='password']");
    @FindBy(css = "input[type='password']")
    WebElement passwordTextbox;

    private By logInButtonBy = By.cssSelector("input[value='Login']");
    @FindBy(css = "input[value='Login']")
    WebElement logInButton;

    private By createAccountLinkBy = By.cssSelector("a > b");
    @FindBy(css = "a > b")
    WebElement createAccountLink;

    By forgotPasswordLinkBy = By.cssSelector(".content-box > div > div > div:nth-of-type(1) > .caption > a");
    @FindBy(css = ".content-box > div > div > div:nth-of-type(1) > .caption > a")
    WebElement forgotPasswordLink;

    private By emailRequiredErrorMessageBy = By.xpath("//p[contains(text(),'Email is required')]");
    @FindBy(xpath = "//p[contains(text(),'Email is required')]")
    WebElement emailRequiredErrorMesage;

    private By passwordRequiredErrorMessageBy = By.xpath("//p[contains(text(),'Password is required')]");
    @FindBy(xpath = "//p[contains(text(),'Password is required')]")
    WebElement passwordRequiredErrorMessage;

    private By passwordInvalidErrorMessageBy = By.xpath("//p[contains(text(),'Password is invalid')]");
    @FindBy(xpath = "//p[contains(text(),'Password is invalid')]")
    WebElement passwordInvalidErrorMessage;

    private By noUserRecordErrorMessageBy = By.xpath("//p[contains(text(),'There is no user record corresponding to this email, please try another one.')]");
    @FindBy(xpath = "//p[contains(text(),'There is no user record corresponding to this email, please try another one.')]")
    WebElement noUserRecordErrorMessage;

    private By accountNotVerifiedHeaderBy = By.cssSelector(".failure.page-header.text-center");
    @FindBy(css = ".failure.page-header.text-center")
    WebElement accountNotVerifiedHeader;

    @FindBy(css = ".btn.btn-block.btn-light")
    WebElement signOutButton;

    private By errorMessageBy = By.xpath("//div[@id='__layout']/div[@class='box']/div[@class='content-box']//p");
    @FindBy(xpath = "//div[@id='__layout']/div[@class='box']/div[@class='content-box']//p")
    WebElement errorMessage;

    public String inoUserRecordErrorMessage = "There is no user record corresponding to this identifier. The user may have been deleted.";
    public String invalidPasswordErrorMessage = "The password is invalid or the user does not have a password.";
    public String emailRequiredErrorMessageText = "Email is required";
    public String passwordRequiredErrorMessageText = "Password is required";
    public String noUserRecordErrorMessageText = "There is no user record corresponding to this email, please try another one.";
    public String passwordInvalidErrorMessageText = "Password is invalid";


    public RegisterPage clickCreateAccountLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountLinkBy));
        createAccountLink.click();
        return new RegisterPage(driver);

    }

    public ForgotPasswordPage clickForgotPasswordLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPasswordLinkBy));
        forgotPasswordLink.click();
        return new ForgotPasswordPage(driver);
    }

    public LoginPage enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextboxBy));
        emailTextbox.click();
        emailTextbox.sendKeys(email);
        typeCharByChar(emailTextbox, email);
        return this;

    }

    public LoginPage enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextboxBy));
        passwordTextbox.click();
        passwordTextbox.sendKeys(password);
        typeCharByChar(passwordTextbox, password);
        return this;

    }

    public AfterLoginPage clickLogInButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInButtonBy));
        logInButton.click();
        return new AfterLoginPage(driver);

    }

    public LoginPage enterValidEmail(){
        enterEmail(EMAIL);
        return this;
    }

    public LoginPage enterInvalidEmail(){
        enterEmail("ksteztx@gmail.com");
        return this;
    }

    public LoginPage enterValidPassword(){
        String validPassword = "Zxcfgh12";
        enterPassword(validPassword);
        return this;
    }

    public LoginPage enterStaticPassword(){
        String validPassword = PASSWORD;
        enterPassword(validPassword);
        return this;
    }

    public LoginPage enterInvalidPassword(){
        String password = generatePassword(65, true,true,true,true);
        enterPassword(password);
        return this;

    }

    public String getErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageBy));
        return errorMessage.getText();

    }

   public void clearFields(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginEmail")));
        emailTextbox.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginPassword")));
        passwordTextbox.clear();

    }

    public String getEmailRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailRequiredErrorMessageBy));
        return emailRequiredErrorMesage.getText();
    }


    public String getPasswordRequiredErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRequiredErrorMessageBy));
        return passwordRequiredErrorMessage.getText();
    }

    public String getPasswordInvalidErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInvalidErrorMessageBy));
        return passwordInvalidErrorMessage.getText();
    }

    public String getNoUserRecordErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(noUserRecordErrorMessageBy));
        return noUserRecordErrorMessage.getText();
    }
}
