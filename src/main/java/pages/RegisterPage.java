package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

public class RegisterPage extends BasePage {

    private By containsNumberOrSymbolErrorMessageBy = By.cssSelector("div:nth-of-type(3) > p");
    @FindBy(css = "div:nth-of-type(3) > p")
    WebElement containsNumberOrSymbolErrorMessage;

    private By privacyPolicyConsentBy = By.cssSelector(".checkbox.warning");
    @FindBy(css = ".checkbox.warning")
    private WebElement privacyPolicyConsent;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    public String createdEmail;
    public String createdPassword;

    private By emailAddressTextboxBy = By.cssSelector("input[type='email']");
    @FindBy(css = "input[type='email']")
    WebElement emailAddressTextbox;

    private By firstNameTextboxBy = By.cssSelector(".form-group.first > input[type='text']");
    @FindBy(css = ".form-group.first > input[type='text']")
    WebElement firstNameTextbox;

    private By lastNameTextboxBy = By.cssSelector(".form-group.last > input[type='text']");
    @FindBy(css = ".form-group.last > input[type='text']")
    WebElement lastNameTextbox;

    private By passwordTexBoxBy = By.cssSelector("input[type='password']");
    @FindBy(css = "input[type='password']")
    WebElement passwordTextBox;

    private By createAccountButtonBy = By.cssSelector("input.btn");
    @FindBy(css = "input.btn")
    WebElement createAccountButton;

    private By continueWithEmailButtonBy = By.cssSelector("a > .btn");
    @FindBy(css = "a > .btn")
    WebElement continueWithEmailButton;

    private By createAccountDisabledButtonBy = By.cssSelector(".btn-box>.btn[disabled=disabled]");
    @FindBy(css = ".btn-box>.btn[disabled=disabled]")
    WebElement createAccountDisabledButton;

    private By errorMessageOkButtonBy = By.cssSelector(".modal-content>button");
    @FindBy(css = ".modal-content>button")
    WebElement errorMessageOkButton;

    private By errorMessageBy = By.cssSelector(".modal-content>p");
    @FindBy(css = ".modal-content>p")
    WebElement errorMessage;

    private By passwordWeakErrorMessageBy = By.cssSelector("div:nth-of-type(1) > p");
    @FindBy(css = "div:nth-of-type(1) > p")
    WebElement passwordWeakErrorMessage;

    private By passwordStrongErrorMessageCheckBy = By.cssSelector(".password-wrapper .success:nth-of-type(1) .material-icons");
    @FindBy(css = ".password-wrapper .success:nth-of-type(1) .material-icons")
    WebElement passwordStrongErrorMessageCheck;

    private By atLeast8charactersErrorMessageCheckBy = By.cssSelector("div:nth-of-type(2) > .material-icons");
    @FindBy(css = "div:nth-of-type(2) > .material-icons")
    WebElement atLeast8charactersErrorMessageCheck;

    private By containsNumberSymbolErrorMessageCheckBy = By.cssSelector(".notification.success > .material-icons");
    @FindBy(css = ".notification.success > .material-icons")
    WebElement containsNumberSymbolErrorMessageCheck;

    private By containsLowercaseUppercaseErrorMessageCheckBy = By.cssSelector(".notification.success > .material-icons");
    @FindBy(css = ".notification.success > .material-icons")
    WebElement containsLowercaseUppercaseErrorMessageCheck;

    private By passwordWeakErrorMessageCrossBy = By.cssSelector(".password-wrapper .error:nth-of-type(1) .material-icons");
    @FindBy(css = ".password-wrapper .error:nth-of-type(1) .material-icons")
    WebElement passwordWeakErrorMessageCross;

    private By atLeast8charactersErrorMessageCrossBy = By.cssSelector("div:nth-of-type(2) > .material-icons");
    @FindBy(css = "div:nth-of-type(2) > .material-icons")
    WebElement atLeast8charactersErrorMessageCross;

    private By containsNumberSymbolErrorMessageCrossBy = By.cssSelector("div:nth-of-type(3) > .material-icons");
    @FindBy(css = "div:nth-of-type(3) > .material-icons")
    WebElement containsNumberSymbolErrorMessageCross;

    private By containsLowerUpperErrorMessageCrossBy = By.cssSelector("div:nth-of-type(4) > .material-icons");
    @FindBy(css = "div:nth-of-type(4) > .material-icons")
    WebElement containsLowerUpperErrorMessageCross;

    private By emailErrorMessagesBy = By.cssSelector(".error.notification > p");
    @FindBy(css = ".error.notification > p")
    WebElement emailErrorMessages;

    private By firstErrorMessageBy = By.cssSelector(".form-group.last > div:nth-of-type(1) > p");
    @FindBy(css = ".form-group.last > div:nth-of-type(1) > p")
    WebElement firstErrorMessage;

    private By secondErrorMessageBy = By.cssSelector(".form-group.last > div:nth-of-type(2) > p");
    @FindBy(css = ".form-group.last > div:nth-of-type(2) > p")
    WebElement secondErrorMessage;

    private By passwordRequiredErrorMessageBy = By.cssSelector(".password-wrapper > .form-group > .error.notification > p");
    @FindBy(css = ".password-wrapper > .form-group > .error.notification > p")
    WebElement passwordRequiredErrorMessage;

    private By genderRequiredErrorMessageBy = By.cssSelector("form > div:nth-of-type(3)  p");
    @FindBy(css = "form > div:nth-of-type(3)  p")
    WebElement genderRequiredErrorMessage;

    private By birthdayRequiredErrorMessageBy = By.cssSelector("form > div:nth-of-type(4)  p");
    @FindBy(css = "form > div:nth-of-type(4)  p")
    WebElement birthdayRequiredErrorMessage;

    private By countryRequiredErrorMessageBy = By.cssSelector("div:nth-of-type(5) > .form-group.last > div:nth-of-type(1) > p");
    @FindBy(css = "div:nth-of-type(5) > .form-group.last > div:nth-of-type(1) > p")
    WebElement countryRequiredErrorMessage;

    private By regionRequiredErrorMessageBy = By.cssSelector("div:nth-of-type(5) > .form-group.last > div:nth-of-type(2) > p");
    @FindBy(css = "div:nth-of-type(5) > .form-group.last > div:nth-of-type(2) > p")
    WebElement regionRequiredErrorMessage;

    private By phoneNumberErrorMessageBy = By.cssSelector("div:nth-of-type(6) > .form-group.last > div:nth-of-type(2) > p");
    @FindBy(css = "div:nth-of-type(6) > .form-group.last > div:nth-of-type(2) > p")
    WebElement phoneNumberErrorMessage;

    private By countryCodeErrorMessageBy = By.cssSelector(".form-group.last > div:nth-of-type(1) > p");
    @FindBy(css = ".form-group.last > div:nth-of-type(1) > p")
    WebElement countryCodeErrorMessage;

    private By countryCodeRequiredErrorMessageBy = By.cssSelector("div:nth-of-type(6) > .form-group.last > div:nth-of-type(1) > p");
    @FindBy(css = "div:nth-of-type(6) > .form-group.last > div:nth-of-type(1) > p")
    WebElement countryCodeRequiredErrorMessage;

    private By phoneNumberRequiredErrorMessageBy = By.cssSelector("div:nth-of-type(6) > .form-group.last > div:nth-of-type(2) > p");
    @FindBy(css = "div:nth-of-type(6) > .form-group.last > div:nth-of-type(2) > p")
    WebElement phoneNumberRequiredErrorMessage;

    private By accountCreatedPopupBy = By.cssSelector(".page-header.text-center");
    @FindBy(css = ".page-header.text-center")
    WebElement accountCreatedPopup;

    private By verificationEmailSentPopupBy = By.cssSelector(".msg.text-center");
    @FindBy(css = ".msg.text-center")
    WebElement verificationEmailSentPopup;

    private By privacyPolicyConsentCheckboxBy = By.cssSelector("label[for=\"tosConsent\"]");
    @FindBy(css = "label[for=\"tosConsent\"]")
    WebElement privacyPolicyConsentCheckbox;

    private By selectGenderBoxBy = By.cssSelector("form > div:nth-of-type(3)");
    @FindBy(css = "form > div:nth-of-type(3)")
    WebElement selectGenderBox;

    private By selectGenderMaleBy = By.cssSelector("div:nth-of-type(3) > .drop-down-field.form-group>.options>div:nth-of-type(1)");
    @FindBy(css = "div:nth-of-type(3) > .drop-down-field.form-group>.options>div:nth-of-type(1)")
    WebElement selectGenderMale;

    private By selectBirthdayBoxBy = By.cssSelector("div:nth-of-type(4) > .drop-down-field.form-group");
    @FindBy(css = "div:nth-of-type(4) > .drop-down-field.form-group")
    WebElement selectBirthdayBox;

    private By selectBirthdayAprilBy = By.cssSelector("div:nth-of-type(4) > .drop-down-field.form-group>.options>div:nth-of-type(4)");
    @FindBy(css = "div:nth-of-type(4) > .drop-down-field.form-group>.options>div:nth-of-type(4)")
    WebElement selectBirthdayApril;

    private By selectCountryBoxBy = By.cssSelector("div:nth-of-type(1) > .drop-down-field.form-group");
    @FindBy(css = "div:nth-of-type(1) > .drop-down-field.form-group")
    WebElement selectCountryBox;

    private By selectCountryAngolaBy = By.cssSelector("div:nth-of-type(1) > .drop-down-field.form-group>.options>div:nth-of-type(1)");
    @FindBy(css = "div:nth-of-type(1) > .drop-down-field.form-group>.options>div:nth-of-type(1)")
    WebElement selectCountryAngola;

    private By regionTextBoxBy = By.cssSelector("div:nth-of-type(5) > .form-group.last > input[type='text']");
    @FindBy(css = "div:nth-of-type(5) > .form-group.last > input[type='text']")
    WebElement regionTextBox;

    private By countryCodeBoxBy = By.cssSelector("div:nth-of-type(6) > .first.form-group > input[type='text']");
    @FindBy(css = "div:nth-of-type(6) > .first.form-group > input[type='text']")
    WebElement countryCodeBox;

    private By phoneNumberBoxBy = By.cssSelector("div:nth-of-type(6) > .form-group.last > input[type='text']");
    @FindBy(css = "div:nth-of-type(6) > .form-group.last > input[type='text']")
    WebElement phoneNumberBox;

    private By loaderBy = By.cssSelector("div>.loader");
    @FindBy(css = "div>.loader")
    WebElement loader;


    public String tooLongEmailValidationErrorMessage = "Email must be a string not longer than 80 characters";
    public String tooLongPasswordValidationErrorMessage = "Password must be a string not longer than 64 characters";
    public String tooLongFirstNameValidationErrorMessageText = "First name should be not longer than 40 characters";
    public String tooLongLastNameValidationErrorMessageText = "Last name should be not longer than 80 characters";
    public String tooShortPasswordValidationErrorMessage = "The password must be a string with at least 6 characters.";
    public String passwordAtLeast8CharactersErrorMessageText = "At least 8 characters";
    public String emailIsRequiredErrorMessageText = "Email is required";
    public String emailIsInvalidErrorMessageText = "Email is invalid";
    public String containsNumberSymbolErrorMessageText= "Contains a number and symbol";
    public String passwordWeakErrorMessageText = "Password strength: Weak";
    public String firstNameRequiredErrorMessageText = "First name is required";
    public String lastNameRequiredErrorMessageText = "Last name is required";
    public String passwordRequiredErrorMessageText = "Password is required";
    public String emailAlreadyExistsErrorMessage = "Email already exists.";
    public String accountCreatedPopupText = "Account created!";
    public String verificationEmailSentPopupMessage ;
    public String genderIsRequiredErrorMessageText = "Gender is required" ;
    public String birthdayIsRequiredErrorMessageText = "Birthday (Month) is required" ;
    public String countryCodeIsRequiredErrorMessageText = "Country code is required" ;
    public String phoneNumberIsRequiredErrorMessageText = "Phone number is required" ;
    public String countryIsRequiredErrorMessageText = "Country is required" ;
    public String regionIsRequiredErrorMessageText = "Region is required";
    public String phoneNumberShouldContainDigitsErrorMessageText = "Phone number should contain only digits";
    public String phoneNumberTooLongErrorMessageText = "Phone number should be not longer than 12 characters";
    public String countryCodeNotLonger9CharsErrorMessageText = "Country code should be not longer than 9 characters";
    public String countryCodeOnlyDigitsErrorMessageText = "Country code should contain only plus and digits";


    public void enterEmailAddress(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressTextboxBy));
        emailAddressTextbox.clear();
        emailAddressTextbox.sendKeys(email);
        typeCharByChar(emailAddressTextbox, email);
    }

    public void enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameTextboxBy));
        firstNameTextbox.clear();
        firstNameTextbox.sendKeys(firstName);
        typeCharByChar(firstNameTextbox, firstName);
    }

    public void enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameTextboxBy));
        lastNameTextbox.clear();
        lastNameTextbox.sendKeys(lastName);
        typeCharByChar(lastNameTextbox, lastName);
    }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTexBoxBy));
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
        typeCharByChar(passwordTextBox, password);
    }

    public RegisterPage clearAllFields(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddressTextboxBy));
        emailAddressTextbox.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameTextboxBy));
        firstNameTextbox.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameTextboxBy));
        lastNameTextbox.clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTexBoxBy));
        passwordTextBox.clear();
        return this;
    }

    //works for Shopify
    public RegisterPage checkPrivacyPolicyConsentCheckbox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(privacyPolicyConsentCheckboxBy));
        privacyPolicyConsentCheckbox.click();
        return this;

    }

    public AccountCreatedPage clickCreateAccountButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(createAccountButtonBy));
        createAccountButton.click();
        return new AccountCreatedPage(driver);
    }

    public void clickErrorMessageOk(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageOkButtonBy));
        errorMessageOkButton.click();
    }

    public String getEmailRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailErrorMessagesBy));
        return emailErrorMessages.getText();
    }

    public String getGenderRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(genderRequiredErrorMessageBy));
        return genderRequiredErrorMessage.getText();
    }

    public String getBirthdayRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(birthdayRequiredErrorMessageBy));
        return birthdayRequiredErrorMessage.getText();
    }

    public String getCountryRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryRequiredErrorMessageBy));
        return countryRequiredErrorMessage.getText();
    }

    public String getRegionRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(regionRequiredErrorMessageBy));
        return regionRequiredErrorMessage.getText();
    }

    public String getCountryCodeRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryRequiredErrorMessageBy));
        return countryCodeRequiredErrorMessage.getText();
    }

    public String getPhoneNumberRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberRequiredErrorMessageBy));
        return phoneNumberRequiredErrorMessage.getText();
    }

    public String getEmailIsInvalidErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailErrorMessagesBy));
        return emailErrorMessages.getText();
    }

    public String getFirstErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstErrorMessageBy));
        return firstErrorMessage.getText();

    }

    public String getSecondErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(secondErrorMessageBy));
        return secondErrorMessage.getText();

    }

    public String getPasswordRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRequiredErrorMessageBy));
        return passwordRequiredErrorMessage.getText();

    }

    public String getEmailIsRequiredErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailErrorMessagesBy));
        return emailErrorMessages.getText();

    }

    public Boolean isFirstErrorMessageDisplayed(){
        return isWebElementDisplayed(firstErrorMessage);

    }

    public Boolean isSecondErrorMessageDisplayed(){
        return isWebElementDisplayed(secondErrorMessage);

    }

    public String getErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageBy));
        return errorMessage.getText();
    }

    public void submitAndCloseErrorMessage(){
        clickCreateAccountButton();
        clickErrorMessageOk();
    }

    public RegisterPage enterValidRandomizedEmail(){
        String randomPart = generateRandomPart(5,true,true,true,false, "validEmail");
        String email = ("kstezt+"+randomPart+"@gmail.com");
        enterEmailAddress(email);
        System.out.println("Generated email: " + email);
        return this;
    }

    public String enterAndReturnValidRandomizedEmail(){
        String randomPart = generateRandomPart(5,true,true,true,false, "validEmail");
        String email = ("kstezt+"+randomPart+"@gmail.com");
        enterEmailAddress(email);
        System.out.println("Generated email: " + email);
        return email;
    }

    public RegisterPage enterValidPassword(){
        String validPassword = generatePassword(8,true,true,true,true);
        enterPassword(validPassword);
        return this;
    }

    public RegisterPage selectGenderMale(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectGenderBoxBy));
        selectGenderBox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectGenderMaleBy));
        selectGenderMale.click();
        return this;

    }

    public RegisterPage selectBirthdayApril(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectBirthdayBoxBy));
        selectBirthdayBox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectBirthdayAprilBy));
        selectBirthdayApril.click();
        return this;

    }

    public RegisterPage selectCountryAngola(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountryBoxBy));
        selectCountryBox.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountryAngolaBy));
        selectCountryAngola.click();
        return this;

    }

    public RegisterPage enterRandomRegion(){
        String randomPart = generateRandomPart(10,true,true,true,true, "randomRegion");
        wait.until(ExpectedConditions.visibilityOfElementLocated(regionTextBoxBy));
        regionTextBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomValidPhoneNumber(){
        String randomPart = generateRandomPart(10,true,false,false,false, "randomValidPhoneNumber");
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberBoxBy));
        phoneNumberBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomPhoneNumberContainingSpecialChars(){
        String randomPart = generateRandomPart(10,true,true,true,true, "randomInvalidPhoneNumber");
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberBoxBy));
        phoneNumberBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomPhoneNumberTooLong(){
        String randomPart = generateRandomPart(41,true,false,false,false, "randomInvalidPhoneNumber");
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberBoxBy));
        phoneNumberBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomValidCountryCode(){
        String randomPart = generateRandomPart(3,true,false,false,false, "randomValidCountryCode");
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryCodeBoxBy));
        countryCodeBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomInvalidCountryCodeOtherSymbols(){
        String randomPart = generateRandomPart(5,true,true,true,true, "randomInvalidCountryCodeOtherSymbols");
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryCodeBoxBy));
        countryCodeBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage enterRandomInvalidCountryCodeTooLong(){
        String randomPart = generateRandomPart(10,true,false,false,false, "randomInvalidCountryCodeOtherSymbols");
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryCodeBoxBy));
        countryCodeBox.sendKeys(randomPart);
        return this;

    }

    public RegisterPage waitForLoaderToHide(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loaderBy));
        return this;
    }



    public String enterAndReturnValidPassword(){
        String password = generatePassword(8,true,true,true,true);
        enterPassword(password);
        return password;
    }

    public RegisterPage enterValidFirstName(){
        enterFirstName("Kacper");
        return this;
    }

    public RegisterPage enterValidLastName(){
        enterLastName("Stanislawczyk");
        return this;
    }

    public RegisterPage enterTooLongEmail(){
        String generatedEmailPart = generateRandomPart(61,true,true,true,true, "tooLongEmail");
        String tooLongEmail = "kacstan12+"+generatedEmailPart+"@gmail.com";
        System.out.println("Email: "+tooLongEmail);
        enterEmailAddress(tooLongEmail);
        return this;
    }

    public RegisterPage enterEmailNoDomain(){
        String emailNoDomain = "kstezt@";
        enterEmailAddress(emailNoDomain);
        return this;

    }

    public RegisterPage enterTooLongFirstName(){
        String randomPart=generateRandomPart(35,false,true,true,false, "tooLongFirstName");
        String tooLongFirstName = "Kacper"+randomPart;
        enterFirstName(tooLongFirstName);
        return this;
    }

    public RegisterPage enterTooLongLastName(){
        String randomPart = generateRandomPart(73,false,true,true,false, "tooLongLastName");
        String tooLongLastName = "LastName"+randomPart;
        enterLastName(tooLongLastName);
        return this;
    }

    public RegisterPage enterTooLongPassword(){
        String tooLongPassword = generatePassword(65,true,true,true,true);
        System.out.println("Generated password"+tooLongPassword);
        enterPassword(tooLongPassword);
        return this;
    }


    public void enterValidLongEmail(){
        String generatedEmailPart = generateRandomPart(60,true,true,true,true, "validLongEmail");
        String validLongEmail = "kacstan12+"+generatedEmailPart+"@gmail.com";
        System.out.println("Email: "+validLongEmail);
        enterEmailAddress(validLongEmail);
    }


    public void enterValidLongPassword(){
        String validLongPassword = generatePassword(64,true,true,true,true);
        enterPassword(validLongPassword);
    }

    public void enterValidLongFirstName(){
        String validLongFirstName = "NameNameNameNameNameNameNameNameNameName";
        enterFirstName(validLongFirstName);
    }

    public void enterValidLongLastName(){
        String validLongLastName = "LastNameLastNameLastNameLastNameLastNameLastNameLastNameLastNameLastNameLastName";
        enterLastName(validLongLastName);
    }

    public String getAccountCreatedPopupText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedPopupBy));
        return accountCreatedPopup.getText();
    }

    public String getVerificationEmailSentPopupText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(verificationEmailSentPopupBy));
        return verificationEmailSentPopup.getText();
    }

    public boolean isAccountCreatedPopupDisplayed() {
        long end = System.currentTimeMillis() + 3000;
        while (System.currentTimeMillis() < end) {
            try{
                if (accountCreatedPopup.isDisplayed()) {
                    return true;
                }
            } catch(Exception e){if (System.currentTimeMillis() >= end){
                break; }
            }
        }return false;
    }

    public RegisterPage enterPass7CharsNumbersLowerUpper(){
        String password = generatePassword(7,true,true,true,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass7CharsLowerUpperSpecial(){
        String password = generatePassword(7,false,true,true,true);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsLowerUpper(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt,false,true,true,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsNumbersLower(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt, true, true, false, false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsLowerSpecial(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt,false,true,false,true);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsNumbersUpper(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt,true,false,true,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsUpperSpecial(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt,false,false,true,true);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8orMoreCharsNumbersSpecial(){
        int randomInt = getRandomNumberInRange(8, 64);
        String password = generatePassword(randomInt,true,false,false,true);
        enterPassword(password);
        return this;
    }

    public void checkPass(){
        String password = generatePassword(4,true,true,true,true);
    }


    public RegisterPage enterPass8CharsLower(){
        String password = generatePassword(8,false,true,false,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8CharsUpper(){
        String password = generatePassword(8,false,false,true,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8CharsNumbers(){
        String password = generatePassword(8,true,false,false,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass8CharsSpecial(){
        String password = generatePassword(8,true,false,false,false);
        enterPassword(password);
        return this;
    }

    public RegisterPage enterPass7CharsNumbersLowerUpperSpecial(){
        String password = generatePassword(7,true,true,true,true);
        enterPassword(password);
        return this;
    }


    public RegisterPage clearPassword(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTexBoxBy));
        passwordTextBox.clear();
        return this;

    }

    public void clearLastName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameTextboxBy));
        lastNameTextbox.clear();
    }

    public String getPasswordWeakErrorMessageText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordRequiredErrorMessageBy));
        return passwordWeakErrorMessage.getText();
    }

    public Boolean isDisplayedPasswordStrongErrorMessageCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordStrongErrorMessageCheckBy));
        return isWebElementDisplayed(passwordStrongErrorMessageCheck);
    }

    public Boolean isDisplayedContainsAtLeast8CharactersErrorMessageCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(atLeast8charactersErrorMessageCheckBy));
        return isWebElementDisplayed(atLeast8charactersErrorMessageCheck);
    }

    public Boolean isDisplayedContainsNumberSymbolErrorMessageCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(containsNumberSymbolErrorMessageCheckBy));
        return isWebElementDisplayed(containsNumberSymbolErrorMessageCheck);
    }

    public Boolean isDisplayedContainsLowercaseUppercaseErrorMessageCheck(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(containsLowercaseUppercaseErrorMessageCheckBy));
        return isWebElementDisplayed(containsLowercaseUppercaseErrorMessageCheck);
    }

    public Boolean isDisplayedPasswordWeakErrorMessageCross(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordWeakErrorMessageCrossBy));
        return isWebElementDisplayed(passwordWeakErrorMessageCross);
    }

    public Boolean isDisplayedContainsAtLeast8CharactersErrorMessageCross(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(atLeast8charactersErrorMessageCrossBy));
        return isWebElementDisplayed(atLeast8charactersErrorMessageCross);
    }

    public Boolean isDisplayedContainsNumberSymbolErrorMessageCross(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(containsNumberSymbolErrorMessageCrossBy));
        return isWebElementDisplayed(containsNumberSymbolErrorMessageCross);
    }

    public Boolean isDisplayedContainsLowercaseUppercaseErrorMessageCross(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(containsLowerUpperErrorMessageCrossBy));
        return isWebElementDisplayed(containsLowerUpperErrorMessageCross);
    }

    public String getContainsNumberSymbolErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(containsNumberOrSymbolErrorMessageBy));
        return containsNumberOrSymbolErrorMessage.getText();
    }

    public boolean isDisabledCreateAccountButtonDisplayed() {
        return isWebElementDisplayed(createAccountDisabledButton);
    }

    public boolean isCreateAccountButtonDisplayed(){
        return isWebElementDisplayed(createAccountButton);
    }

    public String getEmailAlreadyExistsErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailErrorMessagesBy));
        return emailErrorMessages.getText();
    }

    public String getPhoneNumberErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberErrorMessageBy));
        return phoneNumberErrorMessage.getText();
    }

    public String getCountryCodeOrPhoneNumberSingleErrorMessageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(countryCodeErrorMessageBy));
        return countryCodeErrorMessage.getText();
    }

    public RegisterPage enterAlreadyRegisteredEmail() {
        enterEmailAddress(EMAIL);
        return this;
    }

    public RegisterPage clickContinueWithEmailButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueWithEmailButtonBy));
        continueWithEmailButton.click();
        return this;

    }

    public boolean isDisplayedPrivacyPolicyConsentHighlighted() {
        return isWebElementDisplayed(privacyPolicyConsent);
    }

    public RegisterPage enterAndSaveEmail(ITestContext context, RegisterPage registerPage) {
        context.setAttribute("emailAddress",
                registerPage.enterAndReturnValidRandomizedEmail());
        return this;
    }

    public RegisterPage enterAndSavePassword(ITestContext context, RegisterPage registerPage) {
        context.setAttribute("password",
                registerPage.enterAndReturnValidPassword());
        return this;
    }
}
