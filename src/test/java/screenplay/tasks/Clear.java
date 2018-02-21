package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import screenplay.user_interface.TodoList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Clear implements Task {

    @Step("{0} clears all the completed items")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TodoList.CLEAR_COMPLETED));
    }

    public static Clear completedItems() {
        return instrumented(Clear.class);
    }
}