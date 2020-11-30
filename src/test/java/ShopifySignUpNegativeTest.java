import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class ShopifySignUpNegativeTest extends BaseTest{

    @BeforeMethod
    public void setup(){
        setupDriver();
        getLoginPageShopifyCallbackProd();

    }

    @BeforeMethod(onlyForGroups = "mail")
    public void setupMail(){
        connectToEmail();
        deleteEmails();

    }

    @Test(priority = 2)
    public void registrationNegativeEmptyFieldsT011(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .clearAllFields()
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.emailIsRequiredErrorMessageText,
                registerPage.getEmailRequiredErrorMessageText());
        Assert.assertEquals(registerPage.firstNameRequiredErrorMessageText,
                registerPage.getFirstErrorMessageText());
        Assert.assertEquals(registerPage.passwordRequiredErrorMessageText,
                registerPage.getPasswordRequiredErrorMessageText());
        Assert.assertEquals(registerPage.genderIsRequiredErrorMessageText,
                registerPage.getGenderRequiredErrorMessageText());
        Assert.assertEquals(registerPage.birthdayIsRequiredErrorMessageText,
                registerPage.getBirthdayRequiredErrorMessageText());
        Assert.assertEquals(registerPage.countryCodeIsRequiredErrorMessageText,
                registerPage.getCountryCodeRequiredErrorMessageText());
        Assert.assertEquals(registerPage.regionIsRequiredErrorMessageText,
                registerPage.getRegionRequiredErrorMessageText());
        Assert.assertEquals(registerPage.countryCodeIsRequiredErrorMessageText,
                registerPage.getCountryCodeRequiredErrorMessageText());
        Assert.assertEquals(registerPage.phoneNumberIsRequiredErrorMessageText,
                registerPage.getPhoneNumberRequiredErrorMessageText());





    }

    @Test(priority = 2)
    public void registrationNegativeNoEmailDomainT012(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterEmailNoDomain()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.emailIsInvalidErrorMessageText,
                registerPage.getEmailIsInvalidErrorMessageText());

    }

    @Test(priority = 2)
    public void registrationNegativeEmailAlreadyInUseT017(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterAlreadyRegisteredEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getEmailAlreadyExistsErrorMessageText(),
                registerPage.emailAlreadyExistsErrorMessage);

    }

    @Test(priority = 2)
    public void registrationNegativeEmailTooLongT016(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterTooLongEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getEmailIsInvalidErrorMessageText(),
                registerPage.emailIsInvalidErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeTooLongFirstNameT013(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterTooLongFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .enterValidRandomizedEmail()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getFirstErrorMessageText(),
                registerPage.tooLongFirstNameValidationErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeTooLongLastNameT014(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidFirstName()
                .enterTooLongLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .enterValidRandomizedEmail()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getFirstErrorMessageText(),
                registerPage.tooLongLastNameValidationErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeTooLongPasswordT015(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterTooLongPassword()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordStrongErrorMessageCheck());


    }

    @Test(priority = 2)
    public void registrationNegativeConsentNotAcceptedT021(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPrivacyPolicyConsentHighlighted());

    }

    @Test(priority = 2)
    public void registrationNegativePhoneNumberContainsOtherSymbolsT0XX(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomPhoneNumberContainingSpecialChars()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getCountryCodeOrPhoneNumberSingleErrorMessageText(),
                registerPage.phoneNumberShouldContainDigitsErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativePhoneNumberTooLongT0XX(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomPhoneNumberTooLong()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getCountryCodeOrPhoneNumberSingleErrorMessageText(),
                registerPage.phoneNumberTooLongErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeCountryCodeContainsOtherSymbolsT0XX(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomInvalidCountryCodeOtherSymbols()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getCountryCodeOrPhoneNumberSingleErrorMessageText(),
                registerPage.countryCodeOnlyDigitsErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeCountryCodeTooLongT0XX(){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomInvalidCountryCodeTooLong()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getCountryCodeOrPhoneNumberSingleErrorMessageText(),
                registerPage.countryCodeNotLonger9CharsErrorMessageText);

    }

    @Test(priority = 2)
    public void registrationNegativeNamesNotProvidedT022_1() {
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .enterValidPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getFirstErrorMessageText(),
                registerPage.firstNameRequiredErrorMessageText);
        Assert.assertEquals(registerPage.getSecondErrorMessageText(),
                registerPage.lastNameRequiredErrorMessageText);
    }

    @Test(priority = 2)
    public void registrationNegativeNamesNotProvidedT022_2() {
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .enterValidLastName()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getFirstErrorMessageText(),
                registerPage.firstNameRequiredErrorMessageText);
        Assert.assertFalse(registerPage.isSecondErrorMessageDisplayed());
    }

    @Test(priority = 2)
    public void registrationNegativeNamesNotProvidedT022_3() {
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterValidPassword()
                .enterValidFirstName()
                .clickCreateAccountButton();
        Assert.assertEquals(registerPage.getFirstErrorMessageText(),
                registerPage.lastNameRequiredErrorMessageText);
        Assert.assertFalse(registerPage.isSecondErrorMessageDisplayed());

    }

    @Test(groups = "mail", priority = 1)
    public void registrationNegativeAccountActivationLinkAlteredT019_A(ITestContext context){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        AccountCreatedPage accountCreatedPage = registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .checkPrivacyPolicyConsentCheckbox()
                .enterAndSaveEmail(context, registerPage)
                .enterAndSavePassword(context, registerPage)
                .clickCreateAccountButton();
        Assert.assertEquals(accountCreatedPage.getAccountCreatedHeaderText(),
                accountCreatedPage.accountCreatedHeaderText);
        EmailVerifiedPage emailVerifiedPage = accountCreatedPage.openAlteredAccountVerificationLink(driver, emailUtils);
        Assert.assertEquals(emailVerifiedPage.getVerificationCodeInvalidOrExpiredHeaderText(),
                emailVerifiedPage.verificationCodeInvalidOrExpiredHeaderText);
        getLoginPageShopifyCallbackProd();
        AfterLoginPage afterLoginPage = loginPage.enterEmail((String) context.getAttribute("emailAddress"))
                .enterPassword((String) context.getAttribute("password"))
                .clickLogInButton();
        afterLoginPage.clickResendVerificationEmailButton();
        Assert.assertEquals(afterLoginPage.verificationLinkAlreadySentErrorMessageText,
                afterLoginPage.getVerificationLinkAlreadySentErrorMessageText());

    }

//test is continued, after the 60 seconds cooldown for "Resend Verification Email" is reached.
    @Test(groups = "mail", priority = 3)
    public void registrationNegativeAccountActivationLinkAlteredT019_B(ITestContext context){
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        EmailVerifiedPage emailVerifiedPage = new EmailVerifiedPage(driver);
        AfterLoginPage afterLoginPage = loginPage.enterEmail((String) context.getAttribute("emailAddress"))
                .enterPassword((String) context.getAttribute("password"))
                .clickLogInButton();
        Assert.assertEquals(afterLoginPage.accountNotVerifiedMessageText,
                afterLoginPage.getAccountNotVerifiedMessageText());
        VerificationEmailResentPage verificationEmailResentPage = afterLoginPage.clickResendVerificationEmailButton(); // here i get 400 too many attempts
        Assert.assertEquals(verificationEmailResentPage.successHeaderText,
                verificationEmailResentPage.getSuccessHeaderText());
        accountCreatedPage.openAccountVerificationLink(driver, emailUtils);
        Assert.assertEquals(emailVerifiedPage.emailVerifiedMessageText,
                emailVerifiedPage.getEmailVerifiedMessageText());
        getLoginPageShopifyCallbackProd();
        afterLoginPage =loginPage.enterEmail((String) context.getAttribute("emailAddress"))
                .enterPassword((String) context.getAttribute("password"))
                .clickLogInButton();
        ShopifyComingSoonPage shopifyComingSoonPage = afterLoginPage.redirectToShopify();
        Assert.assertEquals(shopifyComingSoonPage.getComingSoonHeaderText(), shopifyComingSoonPage.comingSoonHeaderText);

    }

    @AfterMethod(onlyForGroups = "mail")
    public void clearMail(){
        deleteEmails();

    }

    @AfterMethod
    public void tearDown(){
        closeDriver();

    }

}
