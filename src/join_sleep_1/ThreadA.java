package join_sleep_1;


public class ThreadA extends Thread {

    ThreadB b;


    public ThreadA(ThreadB threadB) {
        this.b = threadB;
    }

    @Override
    public void run() {
        try {

            synchronized (b) {

                b.start();


                Thread.sleep(6000); //不释放锁

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
