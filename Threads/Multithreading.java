import java.lang.Thread;

class Thread1 extends Thread{
    int count=0;
    public void run(){
        for (int i=0; i<100; i++){
            count++;
        }
    }
    
}
public class MultiThreading{
    public static void main (String args[]) throws InterruptedException{
        Thread1 obj1 = new Thread1();
        obj1.start();
        System.out.println(obj1.count);
        Thread.sleep(1000);
        System.out.println(obj1.count);
    }
    
}
