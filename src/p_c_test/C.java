package p_c_test;

public class C {

    private String lock;


    public C(String lock) {

        super();

        this.lock = lock;

    }

    public void getValue() {

        try{

            synchronized (lock) {

                if (ValueObject.value.equals("")) {

                    lock.wait();
                }

                System.out.println("get的值是 " + ValueObject.value);

                ValueObject.value = "";


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
