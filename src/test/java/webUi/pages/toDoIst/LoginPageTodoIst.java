package webUi.pages.toDoIst;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.TextBox;

public class LoginPageTodoIst {

    public TextBox emailTextbox = new TextBox(By.xpath("//div[@class='field']//input[@id='email']"));
    public TextBox passwordTextbox = new TextBox(By.xpath("//div[@class='field']//input[@id='password']"));
    public Button loginButton = new Button(By.xpath("//button[text()='Inicia sesión']"));

}