package MultiThreading;

public class MyThread extends Thread{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("Child Thread");
        } // Executing by child thread
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();  // Thread iniaization
        t.run(); // starting of the Thread
        for(int i = 1;i<=10;i++){
            System.out.println("Parent Thread");
        }//Executing by main thread
    }
}
