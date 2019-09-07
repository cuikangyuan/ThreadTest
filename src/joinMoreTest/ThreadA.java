package joinMoreTest;


public class ThreadA extends Thread {

    ThreadB b;


    public ThreadA(ThreadB threadB) {
        this.b = threadB;
    }

    @Override
    public void run() {
        try {

            synchronized (b) {

                System.out.println("begin A ThreadName= " + Thread.currentThread().getName() + " " + System.currentTimeMillis());

                Thread.sleep(5000);

                System.out.println("end A ThreadName= " + Thread.currentThread().getName() + " " + System.currentTimeMillis());


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
