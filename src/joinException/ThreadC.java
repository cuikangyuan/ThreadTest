package joinException;

public class ThreadC extends Thread {

    ThreadB threadB;


    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {

        threadB.interrupt();

    }
}
