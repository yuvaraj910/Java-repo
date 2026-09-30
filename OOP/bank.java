import java.util.Scanner;

class account{
    private int balance;

    void deposit(int amount){
        balance = amount + balance;
    }
    void getbalance(){
        System.out.println(balance);
    }

    void withdraw(int amount){
        balance = balance - amount;
    }
}
public class bank {
    public static void main(String[] args) {
        Scanner S2 = new Scanner(System.in);
        account s1 = new account();
        


        while(true){    
            System.out.print("want to deposit or withdraw d/w , press c to check balance :");
            String d = S2.nextLine();


            if (d.equals("d")){
                System.out.print("How much to deposit :");
                int amt = S2.nextInt();
                S2.nextLine();
                
                s1.deposit(amt);
                System.out.print("New balance :");
                s1.getbalance();

            }
            else if(d.equals("c")){
                s1.getbalance();
            }
            else if(d.equals("w")){
                System.out.print("How much to deposit :");
                int amt = S2.nextInt();
                S2.nextLine();
                s1.withdraw(amt);
                System.out.print("New balance :");
                s1.getbalance();
            }
        }

    }


}