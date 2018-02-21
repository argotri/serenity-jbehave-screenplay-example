package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.RETURN;
import static screenplay.user_interface.TodoList.WHAT_NEEDS_TO_BE_DONE;

public class AddATodoItem {

    public static Task called(String thingToDo) {
        return Task.where("{0} adds a todo item called: #thingToDo",
                Enter.theValue(thingToDo)
                        .into(WHAT_NEEDS_TO_BE_DONE)
                        .thenHit(RETURN)
                ).with("thingsToDo").of(thingToDo);
    }
}