public class Thread1 extends Thread{
        public void run() {
            try {
                for (int x = 1; x < 10; x++) {
                    System.out.println(x + "-up");
                    sleep(1000);
                }//for
            } catch (Exception e) {
                e.printStackTrace();
            }//catch
        }//run
    }//Tread1
