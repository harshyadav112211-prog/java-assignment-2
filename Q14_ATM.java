public class Q14_ATM {

    // Account Class with Encapsulation
    public static class Account {
        private String accNo;
        private String holderName;
        private double balance; // Private - Encapsulation

        // Default Constructor
        public Account() {
            this.accNo = "";
            this.holderName = "";
            this.balance = 0;
        }

        // Parameterized Constructor
        public Account(String accNo, String holderName) {
            this.accNo = accNo;
            this.holderName = holderName;
            this.balance = 0;
        }

        // Getters
        public String getAccNo() {
            return accNo;
        }

        public String getHolderName() {
            return holderName;
        }

        public double getBalance() {
            return balance;
        }

        // Setters
        public void setAccNo(String accNo) {
            this.accNo = accNo;
        }

        public void setHolderName(String holderName) {
            this.holderName = holderName;
        }

        // Deposit Method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        // Withdraw Method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                System.out.println("Invalid withdrawal amount");
            }
        }

        // Get Balance Method
        public void getBalanceInfo() {
            System.out.println("Balance: " + balance);
        }

        @Override
        public String toString() {
            return "Account: " + accNo + ", Holder: " + holderName + ", Balance: " + balance;
        }
    }

    public static void main(String[] args) {
        // Create Account
        Account account = new Account("1001", "John Doe");

        // Perform ATM Operations
        account.deposit(1000);
        account.withdraw(500);
        account.getBalanceInfo();
    }
}
