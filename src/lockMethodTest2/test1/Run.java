package lockMethodTest2.test1;


public class Run {

    public static void main(String[] args) throws InterruptedException {


        Service service = new Service();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                service.waitMethod();
            }
        };


        Thread thread1 = new Thread(runnable);

        thread1.start();


        Thread.sleep(1000);

        Thread thread2 = new Thread(runnable);
        thread2.start();


        Thread.sleep(1000);

        System.out.println(service.lock.hasQueuedThread(thread1));
        System.out.println(service.lock.hasQueuedThread(thread2));
        System.out.println(service.lock.hasQueuedThreads());



    }
}
