package p_c_allWait;

public class P {

    private String lock;

    public P(String lock) {

        super();
        this.lock = lock;

    }


    public void setValue() {

        try{

            synchronized (lock) {

                if (!ValueObject.value.equals("")) {

                    System.out.println("P" + Thread.currentThread().getName() + " >>> Waiting");

                    lock.wait();
                } else {

                    String value = System.currentTimeMillis() + "_" + System.nanoTime();

                    System.out.println("P" + Thread.currentThread().getName() + " >>> Runnable  " + "set的值是 " + value);

                    ValueObject.value = value;


//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                    lock.notify();

                }

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }



    }

}
