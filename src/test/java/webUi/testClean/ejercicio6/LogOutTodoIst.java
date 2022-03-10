package webUi.testClean.ejercicio6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import webUi.pages.toDoIst.LoginPageTodoIst;
import webUi.pages.toDoIst.MainMenuLeftPart;
import webUi.pages.toDoIst.MainPageTodoIst;
import webUi.pages.toDoIst.TopBarMenu;

public class LogOutTodoIst extends BaseTodoIst{

    MainPageTodoIst mainPageTodoIst= new MainPageTodoIst();
    LoginPageTodoIst loginPageTodoIst= new LoginPageTodoIst();
    MainMenuLeftPart mainMenuLeftPart =  new MainMenuLeftPart();
    TopBarMenu topBarMenu =  new TopBarMenu();

    @Test
    public void verifyLogOutTodoIst() throws InterruptedException {
        mainPageTodoIst.loginImage.click();
        loginPageTodoIst.emailTextbox.setText("ui@upb.com");
        loginPageTodoIst.passwordTextbox.setText("1234567890");
        loginPageTodoIst.loginButton.click();
        Thread.sleep(2000);

        Assertions.assertTrue(mainMenuLeftPart.textProyectos.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        topBarMenu.userIconButton.click();
        topBarMenu.cerrarSesionButton.click();
        Thread.sleep(2000);

        Assertions.assertTrue(mainPageTodoIst.getStartedImage.isControlDisplayed(),"No se lorgo el logout");




    }

}
