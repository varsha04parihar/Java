import com.Exception.InsufficienBalanceException;
class Account
{
    int actBal;
    Account(int actBal)
    {
        this.actBal=actBal;
    }
    void deposit(int abal)
    {
        actBal=actBal+abal;
        System.out.println("balance after deposit :"+actBal);
    }
    void withDraw(int wbal) throws InsufficienBalanceException {
        if(actBal<wbal)
        {
            InsufficienBalanceException ec=new
                    InsufficienBalanceException("You cannot withdraw...since you don't have enough bal");
            throw ec;
            //throw new InsufficientBalanceException();
        }
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account a=new Account(50000);
        try
        {
            a.withDraw(700000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
