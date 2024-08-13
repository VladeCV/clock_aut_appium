package controls;

import org.openqa.selenium.By;

public class NumberBox extends Control{
    public NumberBox(By locator) {
        super(locator);
    }

    public void setNumber(int number) {
        this.findControl();
        this.control.sendKeys(String.valueOf(number));
    }

    public void clearNumber() {
        this.findControl();
        this.control.clear();
    }

    public void clearSetNumber(int number) {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(String.valueOf(number));
    }
}
