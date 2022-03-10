package webUi.testClean.ejercicio5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import webUi.singleton.Session;

public class BaseTodoLy {

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getDriver().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }
}
