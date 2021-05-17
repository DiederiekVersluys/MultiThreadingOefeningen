public class Oefening6 {
    public static void main(String[] args) {


        Thread thread1 = new Thread(() -> print('#', 100));
        Thread thread2 = new Thread(() -> print('*', 100));


        try {
            thread1.start();
            thread1.join();
            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("End");
        }


    }

    private static void print(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");

            }

        }


    }
}