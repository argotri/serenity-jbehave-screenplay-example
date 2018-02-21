package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Attribute;
import screenplay.user_interface.TodoList;

@Subject("the ToDo placeholder text")
public class Placeholder implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Attribute.of(TodoList.WHAT_NEEDS_TO_BE_DONE).named("placeholder")
                .viewedBy(actor)
                .asString();
    }

    public static Placeholder text() {
        return new Placeholder();
    }
}