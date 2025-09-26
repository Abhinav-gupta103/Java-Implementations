class Hello {
    static synchronized void sayHello() {
        System.out.println("in sayHello() method " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " , i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task implements Runnable {
    Hello h;

    public Task(Hello obj) {
        this.h = obj;
    }

    @Override
    public void run() {
        h.sayHello();
    }

}

public class SynchronizationDemo {
    public static void main(String[] args) {
        Hello obj1 = new Hello();
        Hello obj2 = new Hello();

        Thread task1 = new Thread(new Task(obj1));
        task1.setName("Thread 1");
        Thread task2 = new Thread(new Task(obj1));
        task2.setName("Thread 2");
        Thread task3 = new Thread(new Task(obj2));
        task3.setName("Thread 3");
        Thread task4 = new Thread(new Task(obj2));
        task4.setName("Thread 4");

        task1.start();
        task2.start();
        task3.start();
        task4.start();
    }
}
