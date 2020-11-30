import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

public class ShopifySignUpPositiveTest extends BaseTest {

    @BeforeClass
    public void setup(){
        setupDriver();
        getLoginPageShopifyCallbackProd();

    }

    @BeforeMethod(onlyForGroups = "mail")
    public void setupEmail(){
        connectToEmail();
        deleteEmails();

    }

    @Test(groups = "mail")
    public void registerNewUserPositiveT018(ITestContext context){
        RegisterPage registerPage = loginPage.clickCreateAccountLink();
        AccountCreatedPage accountCreatedPage = registerPage.clickContinueWithEmailButton()
                .waitForLoaderToHide()
                .enterAndSaveEmail(context, registerPage)
                .enterValidFirstName()
                .enterValidLastName()
                .selectGenderMale()
                .selectBirthdayApril()
                .selectCountryAngola()
                .enterRandomRegion()
                .enterRandomValidCountryCode()
                .enterRandomValidPhoneNumber()
                .enterAndSavePassword(context, registerPage)
                .checkPrivacyPolicyConsentCheckbox()
                .clickCreateAccountButton();
        Assert.assertEquals(accountCreatedPage.getAccountCreatedHeaderText(), accountCreatedPage.accountCreatedHeaderText);
        EmailVerifiedPage emailVerifiedPage = accountCreatedPage.openAccountVerificationLink(driver, emailUtils);
        Assert.assertEquals(emailVerifiedPage.getEmailVerifiedHeaderText(), emailVerifiedPage.emailVerifiedHeaderText);
        getLoginPageShopifyCallbackProd();
        AfterLoginPage afterLoginPage =loginPage.enterEmail((String) context.getAttribute("emailAddress"))
                .enterPassword((String) context.getAttribute("password"))
                .clickLogInButton();
        ShopifyComingSoonPage shopifyComingSoonPage = afterLoginPage.redirectToShopify();
        Assert.assertEquals(shopifyComingSoonPage.getComingSoonHeaderText(), shopifyComingSoonPage.comingSoonHeaderText);

    }

    @AfterMethod(onlyForGroups = "mail")
    public void clearMail(){
        deleteEmails();

    }

    @AfterClass
    public void tearDown(){
        closeDriver();

    }

}
