package webUi.testClean.ejercicio5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import webUi.pages.toDoLy.*;

public class DeleteRecycleBinTodoly extends BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    LeftSection leftSection = new LeftSection();
    CenterSection centerSection = new CenterSection();

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("ui@upb.com");
        loginModal.pwdTxtBox.setText("123");
        loginModal.loginButton.click();
        Thread.sleep(2000);

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR no se pudo hacer el login");

        leftSection.recycleBin.click();
        leftSection.recycleBinOptions.click();
        leftSection.emptyRecycleBin.click();
        Thread.sleep(2000);
        Assertions.assertTrue(centerSection.noItemsToDisplay.isControlDisplayed());


    }
}
