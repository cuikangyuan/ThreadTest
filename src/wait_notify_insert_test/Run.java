package wait_notify_insert_test;

public class Run {

    public static void main(String[] args) {


        DBTools dbTools = new DBTools();


        for (int i = 0; i < 20; i++) {

            backupAThread backupAThread = new backupAThread(dbTools);

            backupBThread backupBThread = new backupBThread(dbTools);

            backupAThread.start();
            backupBThread.start();
        }

    }

    public static class backupAThread extends Thread {


        private DBTools dbTools;

        public backupAThread(DBTools dbTools) {
            this.dbTools = dbTools;
        }

        @Override
        public void run() {

            dbTools.backupA();

        }
    }

    public static class backupBThread extends Thread {


        private DBTools dbTools;

        public backupBThread(DBTools dbTools) {
            this.dbTools = dbTools;
        }

        @Override
        public void run() {

            dbTools.backupB();

        }
    }
}
