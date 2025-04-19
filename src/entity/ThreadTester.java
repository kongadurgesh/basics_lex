package entity;

public class ThreadTester {
    public void test() throws InterruptedException {
        Thread.Builder builder = Thread.ofVirtual().name("MyThread");

        Runnable task = () -> {
            System.out.println("Running Thread");
        };

        Thread t = builder.start(task);
        System.out.println("Thread t name: " + t.getName());
        t.join();
    }

    public void test2() {
        Runnable task = () -> {
            System.out.println("running from virtual");
        };
        Thread.startVirtualThread(task);
    }
}
