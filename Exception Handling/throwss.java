class agecheck {

    static void checkage (int age) throws Exception {
        if (age < 18){
            throw new Exception("Bruh your age is " + age + " be within your limit nigga :)");
        }
        System.out.println("eligible");
    }
}
public class throwss {
    public static void main(String[] args) {
        try {
            agecheck.checkage(17);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
