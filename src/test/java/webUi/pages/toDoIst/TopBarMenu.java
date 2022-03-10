package webUi.pages.toDoIst;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.Image;

public class TopBarMenu {
    public Button userIconButton = new Button(By.xpath("//img[@class='user_avatar big settings_avatar']"));
    public Button cerrarSesionButton = new Button(By.xpath("//span[text()='Cerrar sesión']"));

}
