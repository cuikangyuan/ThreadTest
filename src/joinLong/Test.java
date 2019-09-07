package joinLong;

public class Test {

    public static void main(String[] args) {


        try {

            MyThread myThread = new MyThread();
            myThread.start();


            //myThread.join();//同时调用 join 或 join(time) 会执行join的逻辑


            myThread.join(2000);//只等两秒


            System.out.println("end timer = " + System.currentTimeMillis());

        } catch (InterruptedException e) {

            e.printStackTrace();
        }


    }
}
