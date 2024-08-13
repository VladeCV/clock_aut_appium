package activities.Clock;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addAlarmBtn = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Button labelBtn = new Button(By.id("com.google.android.deskclock:id/label"));
    public TextBox labelTxt = new TextBox(By.id("com.google.android.deskclock:id/edit_label"));
    public Button okBtn = new Button(By.id("android:id/button1"));
    public Button repeatBtn = new Button(By.id("com.google.android.deskclock:id/repeat"));
    public Button saturBtn = new Button(By.xpath("//android.widget.CheckedTextView[@text='Sa']"));
    public Button sunBtn = new Button(By.xpath("//android.widget.CheckedTextView[@text='Su']"));
    public Button collapseBtn = new Button(By.id("com.google.android.deskclock:id/expand_button"));

}
