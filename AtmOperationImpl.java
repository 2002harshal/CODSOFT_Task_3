public class AtmOperationImpl  implements AtmOperationInterf{
    ATM atm = new ATM();


    @Override
    public void checkBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount){
        if(withdrawAmount<= atm.getBalance()){
            System.out.println(withdrawAmount+" Collect The Cash "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            checkBalance();
        }
        else{
            System.out.println("Insufficient Balance !!");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+ "Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        checkBalance();

    }
}
