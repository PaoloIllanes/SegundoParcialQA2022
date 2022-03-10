package webUi.pages.toDoLy;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.Image;

public class MenuSection {
    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Image currentProject =new Image(By.id("CurrentProjectTitle"));
}