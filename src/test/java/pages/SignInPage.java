package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(id = "email_create")
    private WebElement emailSignInInput;

    @FindBy(id = "SubmitCreate")
    private WebElement submitSignInButton;

    public void enterUserData(String email) {
        emailSignInInput.sendKeys(email);
        submitSignInButton.click();

    }
}
