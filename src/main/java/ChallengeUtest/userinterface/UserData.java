package ChallengeUtest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserData extends PageObject {

    public static final net.serenitybdd.screenplay.targets.Target JOIN_BUTTON = Target.the("Button to open the new account's form")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRSTNAME_INPUT = Target.the("Input for the fist name")
            .located(By.id("firstName"));

    public static final Target LASTNAME_INPUT = Target.the("Input for the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT = Target.the("Input for the email")
            .located(By.id("email"));

    public static final  Target MONTH_SELECT = Target.the("Select for the month of birth")
            .located(By.id("birthMonth"));

    public static final  Target DAY_SELECT = Target.the("Select for the day of birth")
            .located(By.id("birthDay"));

    public static final  Target YEAR_SELECT = Target.the("Select for the year of birth")
            .located(By.id("birthYear"));

    public static final  Target LOCATION_BUTTON = Target.the("Button for the next section: Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    public static final  Target CITY_INPUT = Target.the("Input for the city")
            .located(By.id("city"));

    public static final  Target ZIP_INPUT = Target.the("Input for the Zip code")
            .located(By.id("zip"));

    public static final  Target COUNTRY_SELECT = Target.the("Select for the country")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));

    public static final  Target COUNTRY_INPUT = Target.the("Input for the country")
            .located(By.xpath("(//input[contains(@class,'form-control ui-select-search')])[2]"));

    public static final  Target DIVICES_BUTTON = Target.the("Button for the next section: Devices")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

    public static final  Target COMPUTER_SELECT = Target.the("Select for your computer")
            .located(By.xpath("//div[@placeholder='Select OS']"));

    public static final  Target COMPUTER_INPUT = Target.the("Input for your computer")
            .located(By.xpath("//input[@placeholder='Select OS']"));

    public static final  Target VERSION_SELECT = Target.the("Select for the SO version")
            .located(By.xpath("//div[@placeholder='Select a Version']"));

    public static final  Target VERSION_INPUT = Target.the("Input for the SO version")
            .located(By.xpath("//input[@placeholder='Select a Version']"));

    public static final  Target LANGUAGE_SELECT = Target.the("Select for the language")
            .located(By.xpath("//div[@placeholder='Select OS language']"));

    public static final  Target LANGUAGE_INPUT = Target.the("Input for the language")
            .located(By.xpath("//input[@placeholder='Select OS language']"));

    public static final  Target LASTSTEP_BUTTON = Target.the("Button for the next section: Last step")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

    public static final  Target PASSWORD_INPUT = Target.the("Input a password")
            .located(By.id("password"));

    public static final  Target PASSWORD_CONFIRM_INPUT = Target.the("Input the password again")
            .located(By.id("confirmPassword"));

    public static final  Target TERM_OF_USE_INPUT = Target.the("Accept the terms of use ")
            .located(By.xpath("//input[@id='termOfUse']"));

    public static final  Target PRIVACY_INPUT = Target.the("Accept the privacy settings")
            .located(By.xpath("//input[@id='privacySetting']"));

    public static final  Target COMPLETE_SETUP_BUTTON = Target.the("Button for the next section: Last step")
            .located(By.xpath("//a[contains(@id,'laddaBtn')]//span"));

}
