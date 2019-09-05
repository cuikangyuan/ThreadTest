public class t4 {


    //共享数据
    public static void main(String[] args) {

        MyThread myThread = new MyThread();


        Thread myThread1 = new Thread(myThread, "A");
        Thread myThread2 = new Thread(myThread, "B");
        Thread myThread3 = new Thread(myThread, "C");
        Thread myThread4 = new Thread(myThread, "D");
        Thread myThread5 = new Thread(myThread, "E");


        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();

    }

    static class MyThread extends Thread {


        private int count = 5;


        public MyThread() {

            super();

        }


        @Override
        synchronized public void run() {

            super.run();

            count--;

            System.out.println(
                    "由" + this.currentThread().getName() +
                            " 计算，count = " + count
            );

        }
    }

}
