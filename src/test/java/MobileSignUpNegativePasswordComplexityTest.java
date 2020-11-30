import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class MobileSignUpNegativePasswordComplexityTest extends BaseTest{

    @BeforeMethod
    public void setup(){
        setupDriver();
        getLoginPageMobileCallbackProd();

    }
    
    @Test
    public void registrationNegativePasswordComplexityT020_1() {
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterValidRandomizedEmail()
                .enterValidFirstName()
                .enterValidLastName()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass7CharsNumbersLowerUpper() //1
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
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass7CharsLowerUpperSpecial() //2
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
                    .clearPassword()
                    .checkPrivacyPolicyConsentCheckbox()
                    .enterPass8orMoreCharsLowerUpper() //3
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8orMoreCharsNumbersLower() //4
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8orMoreCharsLowerSpecial() //5
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8orMoreCharsNumbersUpper() //6
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8orMoreCharsUpperSpecial() //7
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8orMoreCharsNumbersSpecial() //8
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8CharsLower() //9
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8CharsUpper() //10
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8CharsNumbers() //11
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass8CharsSpecial() //12
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass7CharsNumbersLowerUpperSpecial() //13
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
                .clearPassword()
                .checkPrivacyPolicyConsentCheckbox()
                .enterPass7CharsNumbersLowerUpperSpecial() //14
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
