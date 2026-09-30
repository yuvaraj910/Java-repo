class demo implements Runnable{
    public void run(){
        System.out.println("Running..");
    }
    public void runrun(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}

public class lifecycle {
    public static void main(String[] args) throws InterruptedException{
        demo d1 = new demo();

        Thread t1 = new Thread(d1);

        System.out.println("Before start : " + t1.getState());
        t1.start();
        System.out.println("After start :" + t1.getState());
        Thread.sleep(6000);

        System.out.println("After sleep :" + t1.getState());

        t1.join();

        System.out.print("After execution :" + t1.getState());
    }
}
