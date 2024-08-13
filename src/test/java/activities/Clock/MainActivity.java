package activities.Clock;

import controls.Button;
import org.openqa.selenium.By;

public class MainActivity {
    public Button alarmBtn = new Button(By.xpath("//android.widget.TextView[@text=\"ALARM\"]"));
    public Button addAlarmBtn = new Button(By.id("com.google.android.deskclock:id/fab"));


}
