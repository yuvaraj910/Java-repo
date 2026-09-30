class cars {
    String brand;
    int year;
    String model;
}

public class classes{
    public static void main(String[] Args){
        cars c1 = new cars();

        c1.brand = "BMW";
        c1.year = 2025;
        c1.model = "new M5 csl";

        System.out.println(c1.brand);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}