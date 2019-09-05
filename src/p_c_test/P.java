package p_c_test;

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

                    lock.wait();
                }

                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是 " + value);

                ValueObject.value = value;


                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                lock.notify();


            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }



    }

}
