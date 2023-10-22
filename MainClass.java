import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op =new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Atm Machine");
        System.out.print("Enter ATM Number: ");
        int atmNumber = sc.nextInt();
        System.out.print("Enter Pin: ");
        int atmPin = sc.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==atmPin)) {
            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
                System.out.println("Enter Choice: ");
                int ch= sc.nextInt();
                if (ch==1){
                    op.checkBalance();
                }
                else if (ch==2){
                    System.out.println("Enter amount to Withdraw");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch==3){
                    System.out.println("Enter Amount Deposit");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (ch==4){
                    System.out.println("Collect Your Atm Card\n Thank You for using our Atm Machine ");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter Correct Choice");
                }
            }
        }
        else {
            System.out.println("Incorrect Atm Number or Pin");
            System.exit(0);
        }
    }
}
