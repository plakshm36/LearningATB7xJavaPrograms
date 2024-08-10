package ex_Lab04082024.SingleInheritance.RealExample;

public class TestCase1  {
    public static void main(String[] args) {
     BaseTest b1 = new BaseTest();
     b1.startBrowser();
     b1.closeBrowser();
     //this method is present in the extended class of basetest ie grandbasetest.
     b1.mySql();
    }



}
