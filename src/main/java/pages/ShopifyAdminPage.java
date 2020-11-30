package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopifyAdminPage extends BasePage {

    public ShopifyAdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    private By emailTextboxBy = By.cssSelector("input#account_email");
    @FindBy(css = "input#account_email")
    WebElement emailTextbox;

    private By nextButtonBy = By.cssSelector("form[method='post'] > button[name='commit']");
    @FindBy(css = "form[method='post'] > button[name='commit']")
    WebElement nextButton;

    private By passwordTextBoxBy = By.cssSelector("input#account_password");
    @FindBy(css = "input#account_password")
    WebElement passwordTextBox;

    private By loginButtonBy = By.cssSelector("button[name='commit']");
    @FindBy(css = "button[name='commit']")
    WebElement loginButton;

    public ShopifyAdminPage enterEmail(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextboxBy));
        emailTextbox.click();
        emailTextbox.sendKeys(SHOPIFY_EMAIL);
        typeCharByChar(emailTextbox, SHOPIFY_EMAIL);
        return this;

    }

    public ShopifyAdminPage enterPassword(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextBoxBy));
        passwordTextBox.click();
        passwordTextBox.sendKeys(SHOPIFY_PASSWORD);
        typeCharByChar(passwordTextBox, SHOPIFY_PASSWORD);
        return this;

    }

    public ShopifyAdminPage clickNextButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextButtonBy));
        nextButton.click();
        return this;
    }

    public ShopifyAdminPage clickLogInButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButtonBy));
        loginButton.click();
        return this;

    }


}
