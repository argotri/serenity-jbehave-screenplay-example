package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import screenplay.user_interface.TodoList;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ToggleStatus implements Task {

    @Override
    @Step("{0} toggles the status of all items")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Click.on(TodoList.TOGGLE_ALL));
    }

    public static ToggleStatus ofAllItems() {
        return instrumented(ToggleStatus.class);
    }
}