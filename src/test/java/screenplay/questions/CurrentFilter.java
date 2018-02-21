package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.model.TodoStatusFilter;
import screenplay.user_interface.TodoList;

@Subject("the displayed todo items")
public class CurrentFilter implements Question<TodoStatusFilter> {

    @Override
    public TodoStatusFilter answeredBy(Actor actor) {
        return Text.of(TodoList.SELECTED_FILTER)
                .viewedBy(actor)
                .asEnum(TodoStatusFilter.class);
    }

    public static CurrentFilter selected() {
        return new CurrentFilter();
    }
}