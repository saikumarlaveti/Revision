package MultiThreading.Synchronized;

public class display {
    public synchronized void greet(String name) {
        for (int i = 0; i <=5 ; i++) {
            System.out.println("Good Morning :" + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}