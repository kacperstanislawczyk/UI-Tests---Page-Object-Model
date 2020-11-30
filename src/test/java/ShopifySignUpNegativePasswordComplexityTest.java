import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class ShopifySignUpNegativePasswordComplexityTest extends BaseTest{

    @BeforeMethod
    public void setup(){
        setupDriver();
        getLoginPageShopifyCallbackProd();

    }
    
    @Test
    public void registrationNegativePasswordComplexityT020_1() {
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
                .enterPass7CharsNumbersLowerUpper() //1
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCheck());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_2() {
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
                .enterPass7CharsLowerUpperSpecial() //2
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCheck());

    }

        @Test
        public void registrationNegativePasswordComplexityT020_3() {
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
                    .clearPassword()
                    .enterPass8orMoreCharsLowerUpper() //3
                    .checkPrivacyPolicyConsentCheckbox()
                    .clickCreateAccountButton();
            Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
            Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
            Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
            Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCheck());

        }

    @Test
    public void registrationNegativePasswordComplexityT020_4() {
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
                .clearPassword()
                .enterPass8orMoreCharsNumbersLower() //4
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_5() {
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
                .clearPassword()
                .enterPass8orMoreCharsLowerSpecial() //5
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_6() {
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
                .clearPassword()
                .enterPass8orMoreCharsNumbersUpper() //6
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_7() {
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
                .clearPassword()
                .enterPass8orMoreCharsUpperSpecial() //7
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_8() {
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
                .clearPassword()
                .enterPass8orMoreCharsNumbersSpecial() //8
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_9() {
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
                .clearPassword()
                .enterPass8CharsLower() //9
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_10() {
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
                .clearPassword()
                .enterPass8CharsUpper() //10
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_11() {
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
                .clearPassword()
                .enterPass8CharsNumbers() //11
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_12() {
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
                .clearPassword()
                .enterPass8CharsSpecial() //12
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCross());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_13() {
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
                .clearPassword()
                .enterPass7CharsNumbersLowerUpperSpecial() //13
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCheck());

    }

    @Test
    public void registrationNegativePasswordComplexityT020_14() {
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
                .clearPassword()
                .enterPass7CharsNumbersLowerUpperSpecial() //14
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertTrue(registerPage.isDisplayedPasswordWeakErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsAtLeast8CharactersErrorMessageCross());
        Assert.assertTrue(registerPage.isDisplayedContainsNumberSymbolErrorMessageCheck());
        Assert.assertTrue(registerPage.isDisplayedContainsLowercaseUppercaseErrorMessageCheck());

    }

    @AfterMethod
    public void tearDown(){
        closeDriver();
    }

}
