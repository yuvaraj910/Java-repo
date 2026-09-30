class car{
    private String name;

    void setname(String name){
        this.name = name;
    }
    String getname(){
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args){
        car s1 = new car();
        
        s1.setname("BMW");
        System.out.println(s1.getname());
    }    
}
