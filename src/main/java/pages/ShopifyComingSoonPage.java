package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopifyComingSoonPage extends BasePage{

    public ShopifyComingSoonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    private By comingSoonHeaderBy = By.cssSelector(".h1.password-page__title");
    @FindBy(css = ".h1.password-page__title")
    WebElement comingSoonHeader;

    public String comingSoonHeaderText = "COMING SOON";

    public String getComingSoonHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(comingSoonHeaderBy));
        return comingSoonHeader.getText();
    }
}
