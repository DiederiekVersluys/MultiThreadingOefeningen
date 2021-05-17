public class Oefening2_2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> print('*', 100));
        Thread thread2 = new Thread(() -> print('#', 100));
        thread1.start();
        thread2.start();
        print('@', 100);
    }

    private static void print(char c, int count) {
        for(int i=0; i<count; i++){
            System.out.print(c);
        }

    }
}
