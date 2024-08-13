package activities.Clock;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class AlarmActivity {
    public Button repeatBtn = new Button(By.id("com.google.android.deskclock:id/repeat_onoff"));
    public Button saturBtn = new Button(By.xpath("//android.widget.CheckBox[@content-desc=\"Saturday\"]"));
    public Button sunBtn = new Button(By.xpath("//android.widget.CheckBox[@content-desc=\"Sunday\"]"));
    public Button collapseBtn = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Collapse alarm\"]"));
    public Button labelBtn = new Button(By.id("com.google.android.deskclock:id/edit_label"));
    public TextBox labelTxt = new TextBox(By.xpath("//android.widget.EditText"));
    public Button okBtnLabel = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"));

}
