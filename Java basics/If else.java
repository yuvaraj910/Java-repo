import java.util.Scanner;


class Main {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age :");
        int age = sc.nextInt();

        if (age > 18 && age < 50){
            System.out.println("You are eligible");}
        else {
            System.out.println("You are not eligible");
         }
        
    }
 }