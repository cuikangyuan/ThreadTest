package synchronizedMethodLockObject;

public class MyObject {


    synchronized public void methodA() {

        try{


            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());

            Thread.sleep(5000);

            System.out.println("methodA end");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

}
