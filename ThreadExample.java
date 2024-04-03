class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+ " Value " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start(); // This invokes the run method in a new thread

        MyThread t2 = new MyThread();
        t2.start();
    }
}
