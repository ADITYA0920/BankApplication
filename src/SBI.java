import java.util.UUID;

public class SBI implements bankInteface{
    private  String name;
    private  String accountNumber;
    private  String password;
    private  int balance;
    private  double rateOfInterest;

    public SBI(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.rateOfInterest=6.6;
        this.accountNumber=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "money has been created";
    }

    @Override
    public String withdraw(int amount, String password) {
        if (password.equals(this.password)) {
            if (balance< 0) {
                return "Insufficient amount";
            } else {
                this.balance -= amount;
                return amount+"has been deducted";
            }
        } else {
            return "invalid password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (this.balance*this.rateOfInterest*time)/100.0;
    }

}
