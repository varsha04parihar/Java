interface Bank{
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
}


class SavingAccount implements Bank{

    private double balance;
    private double limit;


    public boolean deposit(double amount) {
        balance = balance+ amount;
        System.out.println("Deposit amount: "+ amount);
        return true;
    }


    public boolean withdraw(double amount) {
        if(balance < amount){
            System.out.println("You cannot withdraw...Insufficient Balance ");
            return false;
        }

        else if(limit + amount > 6000){
            System.out.println("Withdraw failed...limit exceeded");
            return false;
        }
        else{
            balance= balance - amount;
            limit = limit + amount;
            System.out.println("Withdraw of amount "+ amount+"is successful");
            return true;
        }
    }

    public void getBalance() {
        System.out.println("Saving account balance is "+ balance);
    }
}

class CurrentAccount implements Bank{

    private double balance;
    private double limit;


    public boolean deposit(double amount) {
        balance = balance+ amount;
        System.out.println("Deposit amount: "+ amount);
        return true;
    }


    public boolean withdraw(double amount) {
        if(balance < amount){
            System.out.println("You cannot withdraw...Insufficient Balance ");
            return false;
        }

        else if(limit + amount > 6000){
            System.out.println("Withdraw failed...limit exceeded");
            return false;
        }
        else{
            balance= balance - amount;
            limit = limit + amount;
            System.out.println("Withdraw of amount "+ amount+"is successful");
            return true;
        }
    }

    public void getBalance() {
        System.out.println("Saving account balance is "+ balance);
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        Bank sa=new SavingAccount();
        Bank ca=new CurrentAccount();
        sa.deposit(4000);
        sa.withdraw(1500);
        sa.getBalance();

        System.out.println("******************************");

        ca.deposit(4000);
        ca.withdraw(6000);
        ca.withdraw(2000);
        ca.getBalance();
    }
}
