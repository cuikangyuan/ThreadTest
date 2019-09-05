package twoObjectTwoLock;

import t2.HasSelfPrivateNum;

public class ThreadB extends Thread {


    private HasSelfPrivateNum hasSelfPrivateNum;


    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {

        super();

        this.hasSelfPrivateNum = hasSelfPrivateNum;

    }


    @Override
    public void run() {
        super.run();

        hasSelfPrivateNum.addI("b");
    }
}
