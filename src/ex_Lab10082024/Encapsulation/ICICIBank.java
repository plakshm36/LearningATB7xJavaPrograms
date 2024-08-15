package ex_Lab10082024.Encapsulation;

public class ICICIBank {

    private String name;
    private long bal;

    ICICIBank(String userName, long bankBalance) {
        this.name = userName;
        this.bal = bankBalance;
    }

    //getter for username
    public String getName() {
        return name;
    }

    //setter for username
    public void setName(String name, boolean loggedInUser_admin) {
        if (loggedInUser_admin) {
            System.out.println("The user is an admin so allowed him to update the username");
            this.name = name;
        } else {
            System.out.println("The user logged in is not an admin");
        }

    }


    //getter for balance
    public long getBal(boolean loggedInUser_admin) {
        if (loggedInUser_admin) {

            return bal;
        } else {
            System.out.println("The user logged in is not an admin");
            return 0;
        }

    }
     //setter for balance

        public void setBal(long bal,boolean loggedInUser_admin)
        { if (loggedInUser_admin) {
            System.out.println("The user is an admin so allowed him to update the balance");
            this.bal = bal;

        } else {
            System.out.println("Not Allowed!");
        }
    }


}
