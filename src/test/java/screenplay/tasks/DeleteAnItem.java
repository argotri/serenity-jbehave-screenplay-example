package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import screenplay.actions.JSClick;
import screenplay.user_interface.TodoListItem;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAnItem implements Task {

    private final String itemName;

    @Step("{0} deletes the item '#itemName'")
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(JSClick.on(TodoListItem.DELETE_ITEM.of(itemName)));
    }

    public static DeleteAnItem called(String itemName) {
        return instrumented(DeleteAnItem.class, itemName);
    }

    public DeleteAnItem(String itemName) {
        this.itemName = itemName;
    }
}