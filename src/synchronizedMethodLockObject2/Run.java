package synchronizedMethodLockObject2;


public class Run {

    public static void main(String[] args) {


        MyObject object = new MyObject();

        ThreadA threadA = new ThreadA(object);

        ThreadB threadB = new ThreadB(object);

        threadA.setName("A");

        threadB.setName("B");


        threadA.start();

        threadB.start();

    }
}
