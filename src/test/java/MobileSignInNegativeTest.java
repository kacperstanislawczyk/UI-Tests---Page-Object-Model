import org.testng.Assert;
import org.testng.annotations.*;

public class MobileSignInNegativeTest extends BaseTest {

    @BeforeMethod
    public void setup(){
        setupDriver();
        getLoginPageMobileCallbackProd();

    }

    @Test
    public void negativeLoginEmptyFieldsT001(){
        loginPage.clickLogInButton();
        Assert.assertEquals(loginPage.getEmailRequiredErrorMessageText(),
                loginPage.emailRequiredErrorMessageText);
        Assert.assertEquals(loginPage.getPasswordRequiredErrorMessageText(),
                loginPage.passwordRequiredErrorMessageText);

    }

    @Test
    public void negativeLoginNonRegisteredEmailNoPasswordT002(){
        loginPage.enterInvalidEmail()
                .clickLogInButton();
        Assert.assertEquals(loginPage.getPasswordRequiredErrorMessageText(),
                loginPage.passwordRequiredErrorMessageText);

    }

    @Test
    public void negativeLoginNoEmailValidPasswordT003(){
        loginPage.enterValidPassword()
                .clickLogInButton();
        Assert.assertEquals(loginPage.getEmailRequiredErrorMessageText(),
                loginPage.emailRequiredErrorMessageText);

    }

    @Test
    public void negativeLoginNonRegisteredEmailValidPasswordT004(){
        loginPage.enterInvalidEmail()
                .enterValidPassword()
                .clickLogInButton();
        Assert.assertEquals(loginPage.getNoUserRecordErrorMessageText(),
                loginPage.noUserRecordErrorMessageText);

    }

    @Test
    public void negativeLoginValidEmailNoPasswordT005(){
        loginPage.enterValidEmail()
                .clickLogInButton();
        Assert.assertEquals(loginPage.getPasswordRequiredErrorMessageText(),
                loginPage.passwordRequiredErrorMessageText);

    }

    @Test
    public void negativeLoginValidEmailInvalidPasswordT006(){
        loginPage.enterValidEmail()
                .enterInvalidPassword()
                .clickLogInButton();
        Assert.assertEquals(loginPage.getPasswordInvalidErrorMessageText(),
                loginPage.passwordInvalidErrorMessageText);

    }

    @AfterMethod
    public void tearDown(){
        closeDriver();

    }
}
