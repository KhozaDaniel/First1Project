public class Bank {
    double balance;

    public Bank() {
        balance = 0;
    }

    public void Deposit(double amountDeposited){

            if (amountDeposited < 100000){
                balance+=amountDeposited;
                System.out.println("Amount DEPOSITED R" + balance);
                System.out.println();
            }else {
                System.out.println("Amount exceeded initial DEPOSIT Amount \n" +
                        "Current: " + amountDeposited +
                        " \nExpected: R100000 " +
                        "\nPlease try again !!");
                balance = 0;
            }

    }

    public void withDraw(double amountWithdraw){

        if (amountWithdraw > 0 && amountWithdraw <= balance) {
            balance-=amountWithdraw;
            System.out.println(amountWithdraw + " Amount withdrawn");
            System.out.println("New Balance: " + balance);
            System.out.println();
        }
        else if (amountWithdraw < balance){
            System.out.println("Insufficient funds");
        } else{
            System.out.println("Withdrawal must be a minimum of R1 at least ");
        }
    }

    public void CheckBalance(){
        System.out.println("Bank Balance: " + balance);
        System.out.println();
    }
}
