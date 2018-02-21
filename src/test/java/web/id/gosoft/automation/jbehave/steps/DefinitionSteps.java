package web.id.gosoft.automation.jbehave.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import screenplay.model.TodoStatusFilter;
import screenplay.questions.TheItems;
import screenplay.tasks.AddATodoItem;
import screenplay.tasks.CompleteItem;
import screenplay.tasks.FilterItems;
import screenplay.tasks.Start;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class DefinitionSteps {

    @Given("that $actorName has an empty todo list")
    public void that_James_has_an_empty_todo_list(String actorName) throws Throwable {
        theActorCalled(actorName).wasAbleTo(Start.withAnEmptyTodoList());
    }

    @Given("that $actorName has a todo list containing $items")
    public void that_James_has_an_empty_todo_list(String actorName, List<String> items) throws Throwable {
        System.out.println(items.toString());
        theActorCalled(actorName).wasAbleTo(Start.withATodoListContaining(items));
    }

    @When("^s?he adds '(.*)' to (?:his|her|the) list$")
    public void adds_Buy_some_milk_to_his_list(String item) throws Throwable {
        theActorInTheSpotlight().attemptsTo(AddATodoItem.called(item));
    }

    @Then("todo list should contain $expectedItems")
    public void todo_list_should_contain(List<String> expectedItems) throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheItems.displayed(), equalTo(expectedItems)));
    }

    @Then("has completed the task called '$item'")
    @Given("has completed the task called '$item'")
    public void completes_task_called(String item) throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                CompleteItem.called(item)
        );
    }

    @When("filters her list to show only $status tasks")
    public void filters_tasks_by(TodoStatusFilter status) {
        theActorInTheSpotlight().attemptsTo(FilterItems.toShow(status));
    }

    @Then("^(.*)'s todo list should contain (.*)$")
    public void a_users_todo_list_should_contain(String actorName, List<String> expectedItems) throws Throwable {
        theActorCalled(actorName).should(seeThat(TheItems.displayed(), equalTo(expectedItems)));
    }

    @Then("^'(.*)' should be recorded in (?:his|her|the) list$")
    public void item_should_be_recorded_in_the_list(String expectedItem) throws Throwable {
        theActorInTheSpotlight().should(seeThat(TheItems.displayed(), hasItem(expectedItem)));
    }

}
