package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;

public class TodoList {
    public static Target WHAT_NEEDS_TO_BE_DONE = Target.the("'What needs to be done?' field").locatedBy("#new-todo");
    public static Target ITEMS = Target.the("List of todo items").locatedBy(".view label");
    public static Target ITEMS_LEFT = Target.the("Count of items left").locatedBy("#todo-count strong");
    public static Target TOGGLE_ALL = Target.the("Toggle all items link").locatedBy("#toggle-all");
    public static Target CLEAR_COMPLETED = Target.the("Clear completed link").locatedBy("#clear-completed");
    public static Target FILTER = Target.the("filter").locatedBy("//*[@id='filters']//a[.='{0}']");
    public static Target SELECTED_FILTER = Target.the("selected filter").locatedBy("#filters li .selected");

}