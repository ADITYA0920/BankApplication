public interface bankInteface {


    // common  properties requires all classes
    // we will declare methods only
    //wont intillisze here

    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount,String password);
    double calculateInterest(int time);
}
