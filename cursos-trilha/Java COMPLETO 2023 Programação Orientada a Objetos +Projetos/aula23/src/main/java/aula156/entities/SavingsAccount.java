package aula156.entities;

public class SavingsAccount extends Account{
    private Double interestRate;


    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }


    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        deposit(getBalance() * interestRate);
    }

    @Override
    public void withdraw(Double amount){
        if(getBalance() >= amount){
            balance -= amount;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    // ++++++++++++++++++++++++++++++++++++---------------------------------------
    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
