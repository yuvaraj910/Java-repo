class cars{
    String name;
    int year;
    String model;

    cars(String name,int year,String model){
        this.name = name;
        this.year = year;
        this.model = model;
    }
    void showinfo() {
        System.out.print(name + " ");
        System.out.print(year + " ");
        System.out.println(model);
    }
}


public class constructorprogram {
    public static void main(String[] Args){
        cars s1 = new cars("BMW",2025 ,"m5 csl");
        cars s2 = new cars("Audi",2024 ,"RS7");
        cars s3 = new cars("Rerrari",2026 ,"F80");

        s1.showinfo();
        s2.showinfo();
        s3.showinfo();
    }
}
