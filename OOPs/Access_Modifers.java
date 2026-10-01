class BankAccount{
    public String name;
    private String password; //pass direct access nai kr skte

    //so we cereate func
    public void setPassword(String pass){
        password = pass;
    }
}


public class Access_Modifers {
    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();
        myacc.name = "Poonam Bhavsar";
        System.out.println("Account holder name: "+myacc.name);

        myacc.setPassword("12345");
        // System.out.println(myacc.password);

    }
}
