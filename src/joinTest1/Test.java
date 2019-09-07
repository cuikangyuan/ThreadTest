package joinTest1;

public class Test {

    public static void main(String[] args) {

        try {

            MyThread myThread = new MyThread();
            myThread.start();

            myThread.join();

            System.out.println("当子线程调用结束后调用");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
