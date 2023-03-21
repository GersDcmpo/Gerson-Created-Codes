package ClassParticipation;
/*
 * @author DeOcampo
 */
public class Account {
    int acctNum;
    String name;
    private double balance;
    public static double minBal = 5000;
    static int num = 1000;
    double withdraw;
    double deposit;
    
    public Account(String name, double balance)
    {
        num++;
        this.acctNum = num;
        this.name = name;
        this.balance = balance;
    }
    
    public int getAccNum()
    {
        return this.acctNum;
    }

    @Override
    public String toString(){

        return "\nAccount #:" + this.acctNum +
                "\nAccount Name: " + this.name +
                "\nBalance:" + this.balance +
                "\n";
    }

    public double getBal()
    {
        return balance;
    }
    
    public double minBal()
    {
        return minBal;
    }
    
    public boolean Withdraw(double num1)
    {
        double x = balance;
        balance = balance - num1;
        
        if(balance<minBal)
        {
            balance = x;
            return true;
        }
        
        return false;
    }
    
    public double Deposit(double num1)
    {
        balance = balance + num1;
        return balance;
    }
    
    public double acctNum()
    {
        return this.acctNum;
    }

    

}