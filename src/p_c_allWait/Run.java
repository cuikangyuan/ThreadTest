package p_c_allWait;

public class Run {


    public static void main(String[] args) {

        String lock = new String("");

        P p = new P(lock);
        C c = new C(lock);

        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];


        for (int i = 0; i < 2; i++) {

            pThread[i] = new ThreadP(p);
            pThread[i].setName(i + "");

            cThread[i] = new ThreadC(c);
            cThread[i].setName(i + "");

            pThread[i].start();
            cThread[i].start();

        }

    }
}
