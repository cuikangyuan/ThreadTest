package wait_notify_insert_test;

public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA() {

        try {

            while (prevIsA == true) {

                wait();
            }

//            for (int i = 0; i < 5; i++) {
//
//                System.out.println("-AAAAA-");
//            }

            System.out.println("-AAAAA-");


            prevIsA = true;
            notifyAll();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }



    }

    synchronized public void backupB() {

        try {

            while (prevIsA == false) {

                wait();
            }

//            for (int i = 0; i < 5; i++) {
//
//                System.out.println("-BBBBB-");
//            }
            System.out.println("-BBBBB-");


            prevIsA = false;
            notifyAll();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }



    }
}
