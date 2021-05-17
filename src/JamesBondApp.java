import java.util.Random;

public class JamesBondApp {
    public static void main(String[] args) throws InterruptedException {

        try {
            Random rand = new Random();
            TimeBomb bomb = new TimeBomb(10);
            bomb.activate();
            int time = rand.nextInt(30000);
            System.out.println(time);

            Thread.sleep(rand.nextInt(rand.nextInt(time)));

            bomb.disarm();

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
