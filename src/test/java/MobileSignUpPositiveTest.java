import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.AccountCreatedPage;
import pages.EmailVerifiedPage;
import pages.AfterLoginPage;
import pages.RegisterPage;

public class MobileSignUpPositiveTest extends BaseTest {

    @BeforeClass
    public void setup(){
        setupDriver();
        getLoginPageMobileCallbackProd();

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
                .enterAndSaveEmail(context, registerPage)
                .enterValidFirstName()
                .enterValidLastName()
                .checkPrivacyPolicyConsentCheckbox()
                .enterAndSavePassword(context, registerPage)
                .clickCreateAccountButton();
        Assert.assertEquals(accountCreatedPage.getAccountCreatedHeaderText(), accountCreatedPage.accountCreatedHeaderText);
        EmailVerifiedPage emailVerifiedPage = accountCreatedPage.openAccountVerificationLink(driver, emailUtils);
        Assert.assertEquals(emailVerifiedPage.getEmailVerifiedHeaderText(), emailVerifiedPage.emailVerifiedHeaderText);
        getLoginPageMobileCallbackProd();
        AfterLoginPage afterLoginPage =loginPage.enterEmail((String) context.getAttribute("emailAddress"))
                .enterPassword((String) context.getAttribute("password"))
                .clickLogInButton();

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
