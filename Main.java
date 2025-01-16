import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //Variable for switch
        Scanner customer = new Scanner(System.in);

        while (true){

            System.out.println("*** Bank ***");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose above options: ");
            System.out.println();
            int options = customer.nextInt();

            switch (options) {
                case 1:
                    System.out.print("Enter amount to be Deposit: ");
                    double depositedAmount = customer.nextDouble();
                    bank.Deposit(depositedAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to be Withdrawn: ");
                    double withdrawnAmount = customer.nextDouble();
                    bank.withDraw(withdrawnAmount);
                    break;

                case 3:
                    bank.CheckBalance();
                    break;

                case 4:
                    System.out.println("Thanks for using the Global Bank");
                    customer.close();
                    return;

                default:
                    System.out.println("Invalid option! please try again");
            }
        }

    }
}