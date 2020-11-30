package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.EmailUtils;
import utils.RandomStringGenerator;

import javax.mail.Message;
import java.util.Random;

public class BasePage {

    //passwords deleted

    protected WebDriver driver;
    WebDriverWait wait;
    final static String PASSWORD ="";
    final static String EMAIL ="";
    final static String SHOPIFY_EMAIL="";
    final static String SHOPIFY_PASSWORD="";
    Select dropDown;

    void typeCharByChar(WebElement element, String textToSend) {
        if (!element.getAttribute("value").equalsIgnoreCase(textToSend)) {
            System.out.println("Typing " + textToSend + " char by char...");
            element.clear();
            for (int i = 0; i < textToSend.length(); i++) {
                element.sendKeys(textToSend.charAt(i) + "");
            }
        }

    }

    String getEmailMessageLink(String emailMessageSubject, EmailUtils emailUtils){
        String link = "";
        System.out.println("Waiting for the email (\"" + emailMessageSubject + "\") to be received (if not received within 15 seconds, the test will fail).");
        long end = System.currentTimeMillis()+15000;
        while(System.currentTimeMillis() < end) {
            try {
                Message email = emailUtils.getMessagesBySubject(emailMessageSubject, false, 5)[0];
                link = emailUtils.getUrlsFromMessage(email).get(0);
                break;
            } catch (Exception e) {
                if (System.currentTimeMillis() >= end){
                    Assert.fail("Email message (" + emailMessageSubject + ")  was not received after 15 seconds.");
                }
            }
        } return link;
    }

    public Boolean isWebElementDisplayed(WebElement element){
        long end = System.currentTimeMillis() + 3000;
        while (System.currentTimeMillis() < end) {
            try{
                if (element.isDisplayed()) {
                    return true;
                }
            } catch(Exception e){if (System.currentTimeMillis() >= end){
                break; }
            }
        }return false;
    }

    public String generatePassword(int length, Boolean useNumbers, Boolean useLower, Boolean useUpper, Boolean useSpecial){
        String password;
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator.RandomStringGeneratorBuilder()
                .useDigits(useNumbers)
                .useLower(useLower)
                .useUpper(useUpper)
                .usePunctuation(useSpecial)
                .build();
        password = randomStringGenerator.generate(length);
        System.out.println("Generated password: "+password);
        return password;

    }

    public String generateRandomPart(int length, Boolean useNumbers, Boolean useLower, Boolean useUpper, Boolean useSpecial, String usage){
        String randomPart;
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator.RandomStringGeneratorBuilder()
                .useDigits(useNumbers)
                .useLower(useLower)
                .useUpper(useUpper)
                .usePunctuation(useSpecial)
                .build();
        randomPart = randomStringGenerator.generate(length);
        System.out.println("Generated random part: "+randomPart+"\nPart will be used for "+usage);
        return randomPart;

    }

    public int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


}
