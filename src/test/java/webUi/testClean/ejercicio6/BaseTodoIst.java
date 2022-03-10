package webUi.testClean.ejercicio6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import webUi.singleton.Session;

public class BaseTodoIst {

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

}