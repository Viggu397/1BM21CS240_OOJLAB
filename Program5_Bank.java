import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String typeOfAccount;
    double balance;

    Account(String customerName, int accountNumber, String typeOfAccount) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
    }

    void details() {
        System.out.println();
        System.out.println("Name: " + customerName);
        System.out.println("Acc no.: " + accountNumber);
        System.out.println("Type: " + typeOfAccount);
        System.out.println("Balance: " + balance);
    }
}

class SavAcc extends Account {
    Scanner sc = new Scanner(System.in);

    SavAcc(String customerName, int accountNumber, String typeOfAccount) {
        super(customerName, accountNumber, typeOfAccount);
    }

    void details() {
        super.details();
        System.out.println("Minimum Balance: No Minimum Balance for Savings Account");
    }

    void acceptDeposit() {
        System.out.println();
        System.out.println("Enter amount to be deposited");
        double deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("\nTransaction Successfull!!\n");
        System.out.println("Updated Balance: " + balance);
    }

    void permitWithdrawal() {
        System.out.println();
        System.out.println("Withdrawal amount");
        double withdraw = sc.nextDouble();
        if (balance == 0) {
            System.out.println("\nTransaction Failed");
            System.out.println("Zero Balance");
            return;
        }
        balance -= withdraw;
        System.out.println("\nTransaction Successfull!!\n");
        System.out.println("Updated Balance: " + balance);
    }

    void interest() {
        System.out.println("Months");
        double month = sc.nextInt();
        month /= 3;
        balance = balance + (balance * 0.10 * (month / 4));
        System.out.println("Updated Balance after depositing interest: " + balance);
    }

}

class CurAcc extends Account {
    double minBalance = 2000;
    Scanner sc = new Scanner(System.in);

    CurAcc(String customerName, int accountNumber, String typeOfAccount) {
        super(customerName, accountNumber, typeOfAccount);
    }

    void details() {
        super.details();
        System.out.println("Minimum Balance: " + minBalance);
    }

    void acceptDeposit() {
        System.out.println();
        System.out.println("Enter amount to be deposited");
        double deposit = sc.nextDouble();
        balance += deposit;
        System.out.println("\nTransaction Successfull!!\n");
        System.out.println("Updated Balance: " + balance);
    }

    void permitWithdrawal() {
        System.out.println();
        System.out.println("Withdrawal amount");
        double withdraw = sc.nextDouble();
        if (balance == 0) {
            System.out.println("\nTransaction Failed");
            System.out.println("Zero Balance");
            return;
        }

        balance -= withdraw;

        if (balance < minBalance) {
            System.out.println();
            System.out.println("oppps!!  balance is less than minimum balance");
            System.out.println("You have to pay penalty of Rs " + 1000);
            balance -= 1000;
            System.out.println("Updated Balance after deducting penalty: " + balance);
            return;
        }
        System.out.println("\nTransaction Successfull!!\n");
        System.out.println("Updated Balance: " + balance);
    }

}

class Program5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int type;

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter SavingsAccount number: ");
        int AccNo1 = sc.nextInt();
        SavAcc sav = new SavAcc(name, AccNo1, "SavingsAccount");// Creating SavingsAccount object

        System.out.print("Enter CurrentAccount number: ");
        int AccNo2 = sc.nextInt();
        CurAcc curr = new CurAcc(name, AccNo2, "CurrentAccount");// Creating CuurentAccount object

        // Menu
        while (true) {
            System.out.println("\n1.AccountDetails\n2.Deposit\n3.WithDraw\n4.Interest\n5.Exit");
            System.out.print("Enter your Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\nAccount Type");
                    System.out.println("1.Savings Acc \n2.Current Acc");
                    type = sc.nextInt();
                    if (type == 1) {
                        sav.details();
                    } else if (type == 2) {
                        curr.details();
                    }
                    break;
                case 2:
                    System.out.println("\nAccount Type");
                    System.out.println("1.Savings Acc \n2.Current Acc");
                    type = sc.nextInt();
                    if (type == 1) {
                        sav.acceptDeposit();
                    } else if (type == 2) {
                        curr.acceptDeposit();
                    }
                    break;
                case 3:
                    System.out.println("\nAccount Type");
                    System.out.println("1.Savings Acc \n2.Current Acc");
                    type = sc.nextInt();
                    if (type == 1) {
                        sav.permitWithdrawal();
                    } else if (type == 2) {
                        curr.permitWithdrawal();
                    }
                    break;
                case 4:
                    System.out.println("\nAccount Type");
                    System.out.println("1.Savings Acc \n2.Current Acc");
                    type = sc.nextInt();
                    if (type == 1) {
                        sav.interest();
                    } else if (type == 2) {
                        System.out.println("\nSorry CurrentAccount don't have interst facility");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
