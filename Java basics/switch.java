import java.util.Scanner;

class switchProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose a number between 1-4 :");
        int subject = sc.nextInt();

        switch (subject) {
            case 1:
                System.out.println("you have chosen Python");
                break;
            case 2:
                System.out.println("you have chosen C++");
                break;
            case 3:
                System.out.println("you have chosen web dev ");
                break;
            case 4:
                System.out.println("you have chosen Java");
                break;
            default:
                System.out.println("INvAliD iNpUt");
        }


        }
    }
