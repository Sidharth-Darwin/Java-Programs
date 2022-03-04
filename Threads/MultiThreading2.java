import java.util.Random;
import java.lang.Runnable;
import java.lang.Thread;

public class MultiThreading2{
    public static void main(String[] args) {
        RandomCls rc = new RandomCls();
        Thread t1 = new Thread(rc);
        t1.start();
    }
}

class RandomCls implements Runnable{
    public void run(){
        Random r = new Random();
        int no;
        for (int i=0; i<20; i++){
            no = r.nextInt(100);
            if (no%2==0){
                EvenNo en = new EvenNo(no);
                Thread t2 = new Thread(en);
                t2.start();
            }else{
                OddNo on = new OddNo(no);
                Thread t3 = new Thread(on);
                t3.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class EvenNo implements Runnable{
    int no;
    public EvenNo(int no){
        this.no = no;
    }
    public void run(){
        System.out.println("The square of "+no+" is "+Math.pow(no, 2));
    }
}

class OddNo implements Runnable{
    int no;
    public OddNo(int no){
        this.no = no;
    }
    public void run(){
        System.out.println("The cube of "+no+" is "+Math.pow(no, 3));
    }
}