package aula156.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;


    public BusinessAccount (){

    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

    public void loan(Double amount){
        if (amount <= this.loanLimit){
            this.loanLimit -= amount;
            deposit(amount);
        } else {
            System.out.println("Valor acima do limite permitido para a conta!");
        }
    }

    // ++++++++++++++++++++++++++++++++++++++++---------------------------------------

    public Double getLoanLimit() {
        return loanLimit;
    }

    private void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
