package Fair_noFair_test;

public class RunNotFair {
    public static void main(String[] args) {

        final Service service = new Service(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("ThreadName = "+ Thread.currentThread().getName() + "运行了");

                service.serviceMethod();

            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {

            threads[i] = new Thread(runnable);

        }

        for (int i = 0; i < 10; i++) {

            threads[i].start();

        }

    }
}
