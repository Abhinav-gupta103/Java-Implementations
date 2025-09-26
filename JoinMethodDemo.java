class JoinTask implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " is exiting.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinTask());
        t1.setName("Thread " + 1);
        Thread t2 = new Thread(new JoinTask());
        t2.setName("Thread " + 2);
        Thread t3 = new Thread(new JoinTask());
        t3.setName("Thread " + 3);

        t1.start();
        System.out.println("Current thread: " + Thread.currentThread().getName());
        t1.join();

        t3.start();
        System.out.println("Current thread: " + Thread.currentThread().getName());
        t3.join();

        t2.start();
        System.out.println("Current thread: " + Thread.currentThread().getName());
        t2.join();

        System.out.println("Exiting from current thread: " + Thread.currentThread().getName());
    }
}
