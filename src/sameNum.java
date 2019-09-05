public class sameNum {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }

    static class MyThread extends Thread {

        private int i = 5;

        @Override
        public void run() {
            super.run();

            System.out.println(
                    "i= " + (i--) + " threadName: " + Thread.currentThread().getName()
            );
        }
    }
}
