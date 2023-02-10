import java.util.Scanner;
import java.util.SortedMap;

public class Maiin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name,password,balace");
        String name=sc.next();
        String pass=sc.next();
        int balace=sc.nextInt();

        SBI acc=new SBI(name,pass,balace);
        System.out.println("Your account has been succesfully created ");

        System.out.println("Your AccountNumber:"+acc.getAccountNumber());

        //see balace
        System.out.println("Yout current balance is:"+acc.getBalance());

        //deposit
        System.out.println("Enter deposit value");
        int amount=sc.nextInt();
        System.out.println( acc.depositMoney(amount));
        System.out.println("new balace is"+acc.getBalance());

        //withdraw
        System.out.println("Enter your amount to wihdraw");
        int withAmount=sc.nextInt();
        System.out.println("Enter yout PIN");
        String pin=sc.next();

        System.out.println(acc.withdraw(withAmount,pin));

        System.out.println("Your current bal:"+acc.getBalance());

        //
        System.out.println("Enter yout time for checking Integerse");
        int time=sc.nextInt();
        System.out.println(acc.calculateInterest(time));

    }
}
