class TestBankAccount {
    public static void main(String[] args) {
        BankAccount joe = new BankAccount();
        BankAccount alex = new BankAccount();
        joe.depositMoney("checking", 200.50);
        joe.getTotalBalance();
        joe.depositMoney("saving", 175.60);
        joe.getTotalBalance();
        alex.depositMoney("checking", 425.32);
        alex.depositMoney("saving", 86.40);
        alex.getTotalBalance();
        System.out.println("\nNumber of Accounts: " + BankAccount.numberOfAccounts);
        alex.withdrawMoney("checking", 150);
        alex.getTotalBalance();
        alex.withdrawMoney("saving", 100);
        System.out.println("This Bank has a balance of " + BankAccount.totalBalance );
    }
}
