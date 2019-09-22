
public class RTMain extends Thread {
    public static void main(String [] args){
        Thread1 T1 = new Thread1();
        Thread2 T2 = new Thread2();
        T1.start();
        T2.start();

    }//main
}//RTmain
