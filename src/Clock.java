import org.clock.logic.ClockLogic;
import org.clock.ui.ClockUI;
import java.util.concurrent.TimeUnit;

public class Clock {
    public static void main(String[] args) {
        ClockUI myClockUI = new ClockUI(0 , 0 , 0);
        ClockLogic myClockLogic = new ClockLogic (0 , 0 , 0 );
        for (int i = 0; ; ){
            myClockLogic.tik(1);
            myClockUI.setHour(myClockLogic.getHour());
            myClockUI.setMinute(myClockLogic.getMinute());
            myClockUI.setSecond(myClockLogic.getSecond());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
