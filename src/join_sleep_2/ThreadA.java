package join_sleep_2;


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
                b.join();//join释放锁


                for (int i=0; i<Integer.MAX_VALUE; i++) {

                    String s = new String();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
