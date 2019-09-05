package stack_old;


public class Run {


    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        P p = new P(myStack);

        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);


        ThreadP threadP = new ThreadP(p);

        threadP.start();


        ThreadC threadC1 = new ThreadC(c1);
        threadC1.setName("1");
        ThreadC threadC2 = new ThreadC(c2);
        threadC2.setName("2");

        ThreadC threadC3 = new ThreadC(c3);
        threadC3.setName("3");

        ThreadC threadC4 = new ThreadC(c4);
        threadC4.setName("4");

        ThreadC threadC5 = new ThreadC(c5);
        threadC5.setName("5");


        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();
        threadC5.start();


    }
}
