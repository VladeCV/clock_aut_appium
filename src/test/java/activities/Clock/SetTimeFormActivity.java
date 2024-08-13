package activities.Clock;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SetTimeFormActivity {
    public Button amPmButton = new Button(By.id("android:id/am_pm_spinner"));
    public TextBox hourTextBox = new TextBox(By.id("android:id/input_hour"));
    public TextBox minuteTextBox = new TextBox(By.id("android:id/input_minute"));
    public Button okButton = new Button(By.id("android:id/button1"));

}
