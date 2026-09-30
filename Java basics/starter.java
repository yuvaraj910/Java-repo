import java.util.Scanner;

class Main {
    public static void main(String[] Args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("I want you name bruh : ");
        String name = sc.nextLine();
        
        System.out.print("I need your age too : ");
        int age = sc.nextInt();

        System.out.println("yes your name is " + name + " and your age is " + age);

        float price = 3.14f;
        int y = (int) price;

        System.out.println(y);
    }
}