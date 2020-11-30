import org.testng.Assert;
import org.testng.annotations.*;
import pages.ForgotPasswordPage;
import pages.SetNewPasswordPage;

public class ForgotPasswordPositiveTest extends BaseTest{

    @BeforeMethod
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
    public void forgotPasswordFlowPositiveT025(){
        ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPasswordLink();
        SetNewPasswordPage setNewPasswordPage = forgotPasswordPage.enterValidEmail()
                .clickSendPasswordResetButton()
                .openResetPasswordLink(driver, emailUtils);
        setNewPasswordPage.enterStaticPasswordToBothFields()
                .clickSubmitButton();
        Assert.assertEquals(setNewPasswordPage.getPasswordSetSuccessHeaderText(),
                setNewPasswordPage.newPasswordSetHeaderText);

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
