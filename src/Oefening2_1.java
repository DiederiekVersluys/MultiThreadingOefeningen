public class Oefening2_1 {
    public static void main(String[] args) {
        CharacterPrinter printer1 = new CharacterPrinter('*', 100);
        CharacterPrinter printer2 = new CharacterPrinter('#', 100);

        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        thread1.start();
        thread2.start();
    }


}
