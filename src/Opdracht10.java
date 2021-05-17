import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public class Opdracht10 {
    public static void main(String[] args) {

        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(timeFormat.format(currentDate));
                currentDate.setSeconds(currentDate.getSeconds()+1);
            }
        };
        timer.schedule(task, 0, 1000);


    }
}
