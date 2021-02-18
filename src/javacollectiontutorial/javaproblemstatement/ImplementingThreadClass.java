package javacollectiontutorial.javaproblemstatement;

class Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class Testy extends Thread {
        public void run() {
            for (int i = 0; i< 5; i++) {
                System.out.println("Inside Test thread Class");
            }
    }
}

public class ImplementingThreadClass {
    public static void main(String[] args) {
        Testy t = new Testy();
        t.start();
        for (int i = 0; i< 5; i++) {
            System.out.println("Inside Main Class");
            //Thread.sleep(1);
        }
    }
}
