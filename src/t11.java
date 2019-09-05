public class t11 {


    public static void main(String[] args) {



        MyThread myThread = new MyThread();


        myThread.start();

        try {

            Thread.sleep(200);

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

                for (int i = 0; i < 50000; i++) {


                    if (this.interrupted()) {


                        System.out.println("已经是停止状态了，我要退出了..");


                        throw new InterruptedException();

                    }


                    System.out.println("i= " + (i+1));

                }


                System.out.println("after for loop");

            } catch (InterruptedException e) {

                System.out.println("进入MyThread run方法中 catch");

            }




        }
    }
}
