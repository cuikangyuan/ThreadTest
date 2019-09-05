public class t16 {



    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.setDaemon(true);


        myThread.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread finished .");

    }

    public static class MyThread extends Thread {

        int i = 0;

        @Override
        public void run() {
            super.run();



            while (true) {

                System.out.println("i: " + i++);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
