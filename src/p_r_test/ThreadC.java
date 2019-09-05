package p_r_test;

public class ThreadC extends Thread {

    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {

        while (true) {

            c.getValue();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
