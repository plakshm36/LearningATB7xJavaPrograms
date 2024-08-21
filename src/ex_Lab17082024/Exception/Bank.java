package ex_Lab17082024.Exception;

public class Bank {
    private String currency;
    private Integer amount;

    Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    //passing object as parameter
    public Integer add(Bank bankName) {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency Doesn't Match!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        Integer total = this.amount + bankName.amount;
        return total;

    }
}
