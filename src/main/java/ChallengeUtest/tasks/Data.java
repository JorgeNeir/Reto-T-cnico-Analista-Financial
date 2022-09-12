package ChallengeUtest.tasks;

import ChallengeUtest.userinterface.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Data implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String monthBirth;
    private String dayBirth;
    private String yearBirth;
    private String city;
    private String zip;
    private String country;
    private String computer;
    private String osVersion;
    private String osLanguage;
    private String password;

    public Data(String firstName, String lastName, String email, String monthBirth, String dayBirth, String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.osVersion = osVersion;
        this.osLanguage = osLanguage;
        this.password = password;
    }

    public static Data fillForm(String firstName, String lastName, String email, String monthBirth, String dayBirth,
                                        String yearBirth, String city, String zip, String country, String computer, String osVersion, String osLanguage, String password) {
        return Tasks.instrumented(Data.class,  firstName,  lastName,  email,  monthBirth,  dayBirth,  yearBirth,  city,  zip,  country,  computer,  osVersion,  osLanguage,  password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UserData.JOIN_BUTTON),
                Enter.theValue(firstName).into(UserData.FIRSTNAME_INPUT),
                Enter.theValue(lastName).into(UserData.LASTNAME_INPUT),
                Enter.theValue(email).into(UserData.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(monthBirth).from(UserData.MONTH_SELECT),
                SelectFromOptions.byVisibleText(dayBirth).from(UserData.DAY_SELECT),
                SelectFromOptions.byVisibleText(yearBirth).from(UserData.YEAR_SELECT),
                Click.on(UserData.LOCATION_BUTTON),
                Enter.theValue(city).into(UserData.CITY_INPUT),
                Enter.theValue(zip).into(UserData.ZIP_INPUT),
                Click.on(UserData.COUNTRY_SELECT),
                Enter.theValue(country).into(UserData.COUNTRY_INPUT),
                Click.on(UserData.DIVICES_BUTTON),
                Click.on(UserData.COMPUTER_SELECT),
                Enter.theValue(computer).into(UserData.COMPUTER_INPUT),
                Click.on(UserData.VERSION_SELECT),
                Enter.theValue(osVersion).into(UserData.VERSION_INPUT),
                Click.on(UserData.LANGUAGE_SELECT),
                Enter.theValue(osLanguage).into(UserData.LANGUAGE_INPUT),
                Click.on(UserData.LASTSTEP_BUTTON),
                Enter.theValue(password).into(UserData.PASSWORD_INPUT),
                Enter.theValue(password).into(UserData.PASSWORD_CONFIRM_INPUT),
                Click.on(UserData.TERM_OF_USE_INPUT),
                Click.on(UserData.PRIVACY_INPUT));
    }
}


