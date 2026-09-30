class mythread extends Thread{
    int a;
    public void run(){
        for (int i = 1 ; i < 5 ; i++){
            System.out.println("Thread "+ a + " " + i);
        }
    }
}

public class threading {
    public static void main(String[] args){
        mythread t1 = new mythread();
        mythread t2 = new mythread();
        
        t1.a = 1;
        t2.a = 2;

        t1.start();
        t2.start();
    }
}
