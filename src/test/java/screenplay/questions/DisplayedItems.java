package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.user_interface.TodoList;

import java.util.List;

@Subject("the displayed todo items")
public class DisplayedItems implements Question<List<String>> {

    public Question<List<String>> displayed() {
        return actor -> Text.of(TodoList.ITEMS).viewedBy(actor).asList();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(TodoList.ITEMS)
                .viewedBy(actor)
                .asList();
    }
}