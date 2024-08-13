package testSuite;

import activities.Clock.AlarmActivity;
import activities.Clock.MainActivity;
import activities.Clock.SetTimeFormActivity;
import activities.Clock.SettingsTimeActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singletonSession.Session;

public class TestBase {
    public MainActivity mainActivity;
    public SetTimeFormActivity setTimeFormActivity;
    public SettingsTimeActivity settingsTimeActivity;
    public AlarmActivity alarmActivity;

    @BeforeEach
    public void setUp() {
        mainActivity = new MainActivity();
        setTimeFormActivity = new SetTimeFormActivity();
        settingsTimeActivity = new SettingsTimeActivity();
        alarmActivity = new AlarmActivity();
    }

    @AfterEach
    public void closeApp() {
        Session.getSession().closeSession();
    }
}
