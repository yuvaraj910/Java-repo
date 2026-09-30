/// one reference type can use different objects and the objects actual method gets used 

class Animal{
    void sound(){
        System.out.println("Animal");
    }
}

class cat extends Animal{
    @Override 
    void sound(){
        System.out.println("Meow");
    }
}

class dog extends Animal{
    @Override
    void sound(){
        System.out.println("bark");
    }
}

public class poly{
    public static void main(String[] args){
        Animal a1 = new cat();
        a1.sound();
    }
}   