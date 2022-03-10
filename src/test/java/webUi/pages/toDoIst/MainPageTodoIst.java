package webUi.pages.toDoIst;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.Image;

public class MainPageTodoIst {

    public Button loginImage = new Button(By.xpath("//ul[@class='_3XsmI']//a[text()='Log in']"));
    public Image getStartedImage = new Image(By.xpath("//div[@class='IntroSection_hero__AXH1a']//a[text()='Get Started']"));

}