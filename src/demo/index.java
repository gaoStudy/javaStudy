import java.util.concurrent.atomic.AtomicInteger;

public class index {

    public static void main(String[] args) throws InterruptedException {

        final AtomicInteger value = new AtomicInteger(0);
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    value.incrementAndGet();
                }
            }
        };
        Thread thd1 = new Thread(r, "thd1");
        Thread thd2 = new Thread(r, "thd2");
        thd1.start();
        thd2.start();

        Thread.sleep(50);
        thd1.join();
        thd2.join();

        System.out.println("value : " + value.get());
    }

}
