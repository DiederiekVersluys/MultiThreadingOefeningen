public class TimeBomb extends Thread {
    private int seconds;
    private boolean CounterHasReachedZero;

    public TimeBomb (int seconds){
        this.seconds = seconds;


    }

    public void activate(){
        System.out.println("Bomb has been activated!");
        this.start();

    }

    public void disarm(){
        if (!CounterHasReachedZero)
        System.out.println("Bomb has been disarmed!");
        this.interrupt();

    }

    @Override
    public void run() {
        while(seconds>-1){
            try {
                Thread.sleep(1000);
                System.out.println("there are "+ seconds + " left.");
                seconds--;
                if (seconds < 0){
                    System.out.println("booooooom!");
                    CounterHasReachedZero = true;
                }
            }catch (InterruptedException ex){
                break;
            }
        }
    }
}
