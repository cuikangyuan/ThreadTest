public class t14 {


    public static void main(String[] args) {



        MyThread myThread = new MyThread();


        myThread.start();

        try {

            Thread.sleep(2000);

            myThread.interrupt();

        } catch (Exception e) {

            System.out.println("main catch");

            e.printStackTrace();
        }

        System.out.println("end");

    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            super.run();


            try {


                System.out.println("run begin");


                Thread.sleep(200000);

                System.out.println("run end");


            } catch (InterruptedException e) {

                System.out.println("在沉睡中被停止，进入MyThread run方法中 catch " + this.isInterrupted());

            }




        }
    }
}
