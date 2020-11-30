package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerificationEmailResentPage extends BasePage{

    public VerificationEmailResentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(this.driver, 30);
    }

    By successHeaderBy = By.xpath("//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']//h1[@class='page-header text-center'][contains(text(),\"Success!\")]");
    @FindBy(xpath = "//div[@id='__layout']/div[@class='box desktop']/div[@class='content-box']//h1[@class='page-header text-center'][contains(text(),\"Success!\")]")
    WebElement successHeader;

    public String successHeaderText = "Success!";

    public String getSuccessHeaderText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successHeaderBy));
        return successHeader.getText();
    }




}
