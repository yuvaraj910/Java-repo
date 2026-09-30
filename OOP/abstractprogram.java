abstract class Animal{
    abstract void sound();
    
    void eat(){
        System.out.println("The animal is eating");
    }
}

class cats extends Animal{
    @Override 
    void sound(){
        System.out.println("Meow");
    }
}

public class abstractprogram{
    public static void main(String[] args){
        cats a1 = new cats();
        a1.sound();
        a1.eat();
    }    
}