package webUi.pages.toDoLy;

import org.openqa.selenium.By;
import webUi.control.Button;
import webUi.control.Image;

public class LeftSection {
    public Button recycleBin = new Button(By.xpath("//td[text()='Recycle Bin']"));
    public Button recycleBinOptions = new Button(By.xpath("//div[@style='display: block;']/img"));
    public Button emptyRecycleBin = new Button(By.xpath("//ul[@id='recycleContextMenu']//li[@class='delete']"));

}
