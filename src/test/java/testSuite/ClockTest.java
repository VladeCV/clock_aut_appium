package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClockTest extends TestBase {
    private static final int ALARM_HOUR = 9;
    private static final int ALARM_MINUTE = 30;
    private static final String ALARM_LABEL = "Wake up alarm";
    @Test
    public void setAlarm() {
        // Click on the alarm button
        mainActivity.alarmBtn.clickControl();

        // Click on the add alarm button
        mainActivity.addAlarmBtn.clickControl();

        // Set the alarm time
        settingsTimeActivity.textInputTime.clickControl();
        setTimeFormActivity.hourNumBox.clearSetNumber(ALARM_HOUR);
        setTimeFormActivity.minuteNumBox.clearSetNumber(ALARM_MINUTE);
        setTimeFormActivity.amPmSelectorButton.clickControl();
        setTimeFormActivity.amButton.clickControl();
        setTimeFormActivity.okButton.clickControl();

        // Set the repeat days
        alarmActivity.repeatBtn.clickControl();
        alarmActivity.saturBtn.clickControl();
        alarmActivity.sunBtn.clickControl();

        // Set the alarm label
        alarmActivity.labelBtn.clickControl();
        alarmActivity.labelTxt.setText(ALARM_LABEL);
        alarmActivity.okBtnLabel.clickControl();

        // Verify the alarm is set correctly
        Assertions.assertTrue(alarmActivity.collapseBtn.isControlDisplayed(), "Alarm was not set correctly");

    }
}
