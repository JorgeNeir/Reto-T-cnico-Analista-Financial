package ChallengeUtest.tasks;

import ChallengeUtest.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpUtest implements Task {

    private PageUtest utestPage;

    public static OpenUpUtest thePage() {return Tasks.instrumented(OpenUpUtest.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(utestPage));}
}
