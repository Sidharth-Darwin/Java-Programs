import java.util.Random;
import java.lang.Thread;
import java.lang.Runnable;
public class Thread_synchronize{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program to implement Thread synchronisation");
        Random_no Rn = new Random_no();
        Thread t1 = new Thread(Rn);
        Thread t2 = new Thread(Rn);
        Thread t3 = new Thread(Rn);
        Thread t4 = new Thread(Rn);
        Thread t5 = new Thread(Rn);
        t1.start();t2.start();t3.start();t4.start();t5.start();
        t1.setName("Thread 1");t2.setName("Thread 2");t3.setName("Thread 3");t4.setName("Thread 4");t5.setName("Thread 5");
        t1.join();t2.join();t3.join();t4.join();t5.join();
        System.out.println(Vote.VoteCount);
    }
}

class Random_no implements Runnable {
    public void run(){
        Random r = new Random();
        int rno = r.nextInt(100);
        synchronized (this){
            Vote v = new Vote(rno);
            System.out.println("The votes from "+Thread.currentThread().getName()+" is "+rno);
            v.VoteCount();
        }
    }
}

class Vote{
    static int no, VoteCount;
    public Vote(int no){
        Vote.no = no;
    }
    public void VoteCount(){
        VoteCount += no;
    }
}