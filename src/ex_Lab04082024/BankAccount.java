package ex_Lab04082024;

public class BankAccount {

    String bName;
    int bal;
    String bCode;

    //default constructor here values are given directly to the instance variable.
    BankAccount()
    {
        System.out.println("Details of SBI Bank");
        bName = "SBI";
        bal = 0;
        bCode = "SBI001";
    }

    //parameterized constructor and that variables are assigned to instance variable
    BankAccount(String b1Name){

        this.bName=b1Name;

    }
    BankAccount(int b1bal)
    {
        this.bal= b1bal;
    }

    BankAccount(String b1Name,String b1Code)
    {
        this.bCode=b1Code;
    }

    BankAccount(String b2Name,int b2bal,String b2Code)
    {
        this.bName=b2Name;
        this.bal=b2bal;
        this.bCode=b2Code;
    }

    public void printdetails(){
        System.out.println("Bankname is:"+bName);
        System.out.println("BankBalance is:"+bal);
        System.out.println("Bankcode is :"+bCode);
        System.out.println("***************************");
    }
}
