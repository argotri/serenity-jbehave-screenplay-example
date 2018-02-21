package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import screenplay.user_interface.TodoList;

import static net.serenitybdd.screenplay.questions.ValueOf.the;

@Subject("the 'Clear Completed' option")
public class ClearCompletedItems implements Question<ElementAvailability> {

    @Override
    public ElementAvailability answeredBy(Actor actor) {
        return ElementAvailability.from(
                the(Visibility.of(TodoList.CLEAR_COMPLETED).viewedBy(actor))
        );
    }

    public static ClearCompletedItems option() {
        return new ClearCompletedItems();
    }
}