package ChallengeUtest.stepdefinitions;

import ChallengeUtest.model.FillData;
import ChallengeUtest.questions.Answer;
import ChallengeUtest.tasks.Data;
import ChallengeUtest.tasks.OpenUpUtest;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^User wants to create an account$")
    public void userWantsToCreateAnAccount() throws Exception {
        OnStage.theActorCalled("User").attemptsTo(OpenUpUtest.thePage());

    }

    @When("^User fills the form with the data$")
    public void userFillsTheFormWithTheData(List<FillData> userDataList ) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Data.fillForm(userDataList.get(0).getFirstName(),userDataList.get(0).getLastName(),userDataList.get(0).getEmail(),
                userDataList.get(0).getMonthBirth(), userDataList.get(0).getDayBirth(), userDataList.get(0).getYearBirth(), userDataList.get(0).getCity(), userDataList.get(0).getZip(),
                userDataList.get(0).getCountry(), userDataList.get(0).getComputer(), userDataList.get(0).getOsVersion(), userDataList.get(0).getOsLanguage(), userDataList.get(0).getPassword()));
    }

    @Then("^User create an account and (.*)$")
    public void heCanCreateAnAccountAndCompleteSetup(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
