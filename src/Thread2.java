public class Thread2 extends  Thread {
    public void run() {
        try {
            for (int x = 9; x > 0; x--) {
                System.out.println(x + "--down");
                sleep(1000);
            }//for
        } catch (Exception e) {
            e.printStackTrace();
        }//catch
    }//run
}//Thread2
