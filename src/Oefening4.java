public class Oefening4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> print('#', 100));
        Thread thread2 = new Thread(() -> print('*', 1000));
//        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();

    }

    private static void print(char c, int count) {
        for(int i=0; i<count; i++){
            System.out.print(c);
        }

    }
}
