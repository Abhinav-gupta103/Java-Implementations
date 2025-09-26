// class Task extends Thread {
//     @Override
//     public void run() {
//         System.out.println(Thread.currentThread().getName() + " is running.");
//     }
// }

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Thread task = new Thread(new Task());
            task.setName("Thread " + i);
            task.start();
        }
    }
}
