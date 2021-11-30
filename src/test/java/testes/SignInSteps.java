package testes;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.Test;
import pages.CreateAccountPage;
import pages.SignInPage;
import utils.EmailGenerator;

public class SignInSteps extends BaseTest {
    EmailGenerator e = new EmailGenerator();

    @Given("an open browser in hotel") //@Test
    public void an_open_browser_in_hotel()  {
        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
        CreateAccountPage creatAccount = new CreateAccountPage(driver);
        creatAccount.enterUserData(e.generateEmail());


    }


}
