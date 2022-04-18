public class BankAccount {
    
    private double checkingBalance;
    private double savingsBalance;

    //constructor
    public BankAccount(){
        numberOfAccounts++;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    // number of accounts start at 0
    public static int numberOfAccounts = 0;
    
    //total balance of all accounts
    public static double totalBalance = 0;

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void depositMoney(String name, double amount) {
        if (name.equals("checking"))
            this.checkingBalance += amount;
        else if(name.equals("saving"))
            this.savingsBalance += amount;
        BankAccount.totalBalance += amount;
    }

    public void withdrawMoney(String name, double amount){
        boolean withdraw = false;
        if (name.equals("checking")){
            if (this.checkingBalance >= amount)
                withdraw =  true;
                this.checkingBalance -= amount;
                BankAccount.totalBalance -= amount;
        }
        else if(name.equals("saving")){
            if (this.savingsBalance >= amount)
                withdraw = true;
                this.savingsBalance -= amount;
                BankAccount.totalBalance -= amount;
        }
        if (withdraw){
            System.out.printf("%.2f Was Successfully Withdrawn from Account", amount);
        }
        else{
            System.out.println("\nInsufficient Funds, Please Make a Deposit");
        }
    }

    public void getTotalBalance(){
        System.out.printf("\nBalance \nSavings: %.2f,  Checking: %.2f", this.savingsBalance, this.checkingBalance);
    }
}