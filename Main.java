import java.util.scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name,password,balace");
        String name=sc.next();
        String pass=sc.next();
        int balace=sc.nextInt();

        SBI acc=new SBI(name,pass,balace);
        System.out.println("Your account has been succesfully created ");

        System.out.println("Your AccountNumber:"+acc.get);

    }
}
