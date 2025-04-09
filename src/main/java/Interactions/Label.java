package Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Label extends  Element{

    public Label(By Locator) {
        super(Locator);
    }
    public String getText() {
        return getDriver().findElement(Locator).getText();
    }
    public WebElement getElement() {
        return getDriver().findElement(Locator);
    }

    public List<WebElement> getElements() {
        return getDriver().findElements(Locator);
    }
}
