package Encapsulation;

//encapsulation means hide the data agr woh data ko access krna ho toh this keyword and get set ka use hotha hain
class BankAccount{
    private int balance;
    public String AccountHoldername;
    public String BankName;

    void setBalance(int balance){
        this.balance = balance;
    }

    int getBalance(){
        return balance;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(100000);
        b.BankName = "BOB";
        b.AccountHoldername = "Poonam Bhavsar";

        System.out.println("Account Holder Name is: "+b.AccountHoldername);
        System.out.println("Bank Name is: "+b.BankName);
        System.out.println("your bank balance is: "+b.getBalance());

        
    }
}
