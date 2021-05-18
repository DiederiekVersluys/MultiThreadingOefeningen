import java.text.SimpleDateFormat;
import java.util.*;

public class Opdracht10 {
    public static void main(String[] args) {


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Date currentDate = new Date();
                SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
                System.out.println(timeFormat.format(currentDate));
            }
        };
        timer.schedule(task, 0, 1000);


    }
}
