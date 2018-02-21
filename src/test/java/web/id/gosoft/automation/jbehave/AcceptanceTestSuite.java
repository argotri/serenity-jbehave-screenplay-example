package web.id.gosoft.automation.jbehave;

import net.serenitybdd.jbehave.SerenityStories;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.jbehave.core.annotations.BeforeStory;

public class AcceptanceTestSuite extends SerenityStories {

    @BeforeStory
    public void sebelumStory() {
        OnStage.setTheStage(new OnlineCast());
    }
}
