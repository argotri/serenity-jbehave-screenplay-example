package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.user_interface.TodoList;

public class ItemsLeftCounter implements Question<Integer> {
    @Override
    public Integer answeredBy(Actor actor) {
        return Text.of(TodoList.ITEMS_LEFT)
                .viewedBy(actor)
                .asInteger();
    }
}