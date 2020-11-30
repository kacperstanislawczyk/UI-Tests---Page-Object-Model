import org.testng.Assert;
import org.testng.annotations.*;
import pages.AfterLoginPage;
import pages.ShopifyComingSoonPage;

public class ShopifySignInPositiveTest extends BaseTest {

    @BeforeMethod
    public void setup(){
        setupDriver();
        getLoginPageShopifyCallbackProd();

    }

    @Test
    public void loginPositiveT007(){
        loginPage.enterValidEmail()
        .enterStaticPassword();
        AfterLoginPage afterLoginPage = loginPage.clickLogInButton();
        ShopifyComingSoonPage shopifyComingSoonPage = afterLoginPage.redirectToShopify();
        Assert.assertEquals(shopifyComingSoonPage.getComingSoonHeaderText(), shopifyComingSoonPage.comingSoonHeaderText);

    }

    @AfterMethod
    public void tearDown(){
        closeDriver();

    }

}
