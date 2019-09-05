package twoObjectTwoLock;

import t2.HasSelfPrivateNum;

public class ThreadA extends Thread {


    private HasSelfPrivateNum hasSelfPrivateNum;


    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {

        super();

        this.hasSelfPrivateNum = hasSelfPrivateNum;

    }


    @Override
    public void run() {
        super.run();

        hasSelfPrivateNum.addI("a");
    }
}
