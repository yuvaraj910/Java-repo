import java.util.Scanner;

class operations{
    int result;
    void divider(int number1,int number2){
        result = number1/number2;
        System.out.println(result);
    }
}

public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your number :");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the 2nd number :");
        int b = sc.nextInt();
        sc.nextLine();

        try {
            int x = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0 ...");

        }
        finally{
            System.out.println("Finished");
        }
    }
}
