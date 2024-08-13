package activities.Clock;

import controls.Button;
import controls.NumberBox;
import org.openqa.selenium.By;

public class SetTimeFormActivity {
    public Button amPmSelectorButton = new Button(By.id("android:id/am_pm_spinner"));
    public NumberBox hourNumBox = new NumberBox(By.id("android:id/input_hour"));
    public NumberBox minuteNumBox = new NumberBox(By.id("android:id/input_minute"));
    public Button okButton = new Button(By.id("android:id/button1"));
    public Button amButton = new Button(By.xpath("//android.widget.CheckedTextView[@text='AM']"));
    public Button pmButton = new Button(By.xpath("//android.widget.CheckedTextView[@text='PM']"));

}
