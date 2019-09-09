package LockMethodTest1.test2;

public class Run {

    public static void main(String[] args) throws InterruptedException {


        Service service = new Service();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    service.serviceMethod1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {

            threads[i] = new Thread(runnable);

        }

        for (int i = 0; i < 10; i++) {

            threads[i].start();

        }

        Thread.sleep(2000);

        System.out.println("有线程数: "+ service.lock.getQueueLength() + "在等待获取锁");

    }
}
