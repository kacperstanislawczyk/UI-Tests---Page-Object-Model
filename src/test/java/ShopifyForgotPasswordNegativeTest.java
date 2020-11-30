import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.ResetPasswordLinkSentPage;
import pages.SetNewPasswordPage;


public class ShopifyForgotPasswordNegativeTest extends BaseTest {

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

    @Test
    public void forgotPasswordNoEmailT008(){
        ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPasswordLink();
        forgotPasswordPage.clickSendPasswordResetButton();
        Assert.assertEquals(forgotPasswordPage.getErrorMessageText(),
                forgotPasswordPage.emailRequiredErrorMessageText);
    }

    @Test
    public void forgotPasswordInvalidEmailT009(){
        ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPasswordLink();
        forgotPasswordPage.enterInvalidEmail()
                .clickSendPasswordResetButton();
        Assert.assertEquals(forgotPasswordPage.getErrorMessageText(),
                forgotPasswordPage.invalidEmailErrorMessage);

    }

    @Test
    public void forgotPasswordValidNotRegisteredEmailT024(){
        ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPasswordLink();
        forgotPasswordPage.enterValidNotRegisteredEmail()
                .clickSendPasswordResetButton();
        Assert.assertEquals(forgotPasswordPage.getErrorMessageText(),
                forgotPasswordPage.noCorrespondingUserErrorMessageText);

    }

    @Test(groups = "mail")
    public void forgotPasswordInvalidResetPasswordLinkT010(){
        ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPasswordLink();
        ResetPasswordLinkSentPage resetPasswordLinkSentPage = forgotPasswordPage.enterValidEmail()
                .clickSendPasswordResetButton();
        Assert.assertTrue(resetPasswordLinkSentPage.isSuccessMessageDisplayed());
        SetNewPasswordPage setNewPasswordPage = resetPasswordLinkSentPage.openModifiedResetPasswordLink(driver, emailUtils);
        Assert.assertEquals(setNewPasswordPage.getResetCodeInvalidHeaderText(),
                setNewPasswordPage.resetPasswordInvalidCodeHeaderText);

    }

    @Test(groups = "mail")
    public void forgotPasswordInvalidNewPasswordT023(){
        ForgotPasswordPage forgotPasswordPage = loginPage
                .clickForgotPasswordLink();
        ResetPasswordLinkSentPage resetPasswordLinkSentPage = forgotPasswordPage
                .enterValidEmail()
                .clickSendPasswordResetButton();
        Assert.assertTrue(resetPasswordLinkSentPage.isSuccessMessageDisplayed());
        SetNewPasswordPage setNewPasswordPage = resetPasswordLinkSentPage
                .openResetPasswordLink(driver, emailUtils)
                .clickSubmitButton();
        Assert.assertEquals(setNewPasswordPage.getFirstErrorMessageText(),
                setNewPasswordPage.passwordRequiredErrorMessage);
        setNewPasswordPage
                .enterPassNotMeetingRulesToBothFields()
                .clickSubmitButton();
        Assert.assertEquals(setNewPasswordPage.passwordWeakErrorMessageText,
                setNewPasswordPage.getPasswordStrengthErrorMessageText());
        Assert.assertEquals(setNewPasswordPage.passwordMatchErrorMessageText,
                setNewPasswordPage.getPasswordMatchErrorMessageText());
        setNewPasswordPage
                .clearPasswordFields()
                .enterValidPassword()
                .enterValidPasswordRepeat()
                .clickSubmitButton();
        Assert.assertEquals(setNewPasswordPage.passwordNotMatchText,
                setNewPasswordPage.getPasswordMatchText());
        setNewPasswordPage
                .clearPasswordFields()
                .enterStaticPasswordToBothFields();
        Assert.assertEquals(setNewPasswordPage.passwordStrongErrorMessageText,
                setNewPasswordPage.getPasswordStrengthErrorMessageText());
        Assert.assertEquals(setNewPasswordPage.passwordMatchErrorMessageText,
                setNewPasswordPage.getPasswordMatchErrorMessageText());
        setNewPasswordPage
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
