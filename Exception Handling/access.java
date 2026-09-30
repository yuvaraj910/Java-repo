class demu{
    public int a = 12;
    private int b = 13;
    protected int c = 14;

    void showprivate(){
        System.out.println("Private (from the method in the same class) "+b);
    }
}

class demu2 extends demu{
    void showprotected(){
        System.out.println("Private (from the method in the child class) "+c);
    }
}
public class access{
    public static void main(String[] args) {
        demu a1 = new demu();
        demu2 a2 = new demu2();
        System.out.println("from the public variable "+a1.a);
        a1.showprivate();
        a2.showprotected();
    }    
}
