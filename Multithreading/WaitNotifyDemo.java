class shared{
    synchronized void waiting(){
    try {
        System.out.println("Thread started !");
        wait();
        System.out.println("thread resumed!!");
    }
    catch (InterruptedException e){
        System.out.println("Interrupped");
    }
    

        }
        synchronized void wakeup(){
        System.out.println("Notifying till thread reaches");
        notify();
    }
}

class Mythread extends Thread{
    shared obj;
    Mythread (shared obj){
        this.obj = obj;
    }

    public void run(){
        obj.waiting();
    }
}
public class WaitNotifyDemo{
    public static void main(String[] args) throws Exception{

    shared obj = new shared();    
    Mythread a1 = new Mythread(obj);
    
    a1.start();

    Thread.sleep(1000);

    obj.wakeup();
    

    a1.join();

    System.out.println("Thread terminated");
    }
}