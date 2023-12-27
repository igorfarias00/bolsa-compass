package aula156.entities;

public class Account {
    private Integer number;

    private String holder;

    protected Double balance;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
        this.deposit(balance);
    }

    public void withdraw(Double amount) {
        if (this.balance >= amount){
            this.balance -= amount + 5.00;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposit(Double amount){
        this.balance += amount;
    }


    // ++++++++++++++++++++++++++++++++++++---------------------------------------
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }
}
