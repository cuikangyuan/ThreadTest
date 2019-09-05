package synchronizedMethodLockObject;

import t1.HasSelfPrivateNum;

public class ThreadA extends Thread {


    private MyObject object;

    public ThreadA(MyObject object) {

        super();

        this.object = object;

    }


    @Override
    public void run() {
        super.run();

        object.methodA();
    }
}
