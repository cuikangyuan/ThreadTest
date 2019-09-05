public class t15 {


    public static void main(String[] args) {



        MyThread myThread = new MyThread();


        myThread.start();

        try {

            Thread.sleep(5000);

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

                for (int i=0; i < 10000; i++) {

                    System.out.println("i=" + (i+1));

                }


                System.out.println("run begin");


                Thread.sleep(3000);

                System.out.println("run end");


            } catch (InterruptedException e) {

                System.out.println("在沉睡中被停止，进入MyThread run方法中 catch " + this.isInterrupted());

            }




        }
    }
}
