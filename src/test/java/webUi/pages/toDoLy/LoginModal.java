package webUi.pages.toDoLy;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.TextBox;

public class LoginModal {
    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[contains(@name,'LoginControl1$TextBoxPassword')]"));
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
}