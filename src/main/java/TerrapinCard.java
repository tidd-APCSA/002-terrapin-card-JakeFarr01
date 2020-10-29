public class TerrapinCard {

  private double balance;

  public TerrapinCard(double balance) {
    this.balance = balance;
  }

  public void loadMoney(int money) {
    if(money > 0) {
      balance += money;
    }
  }

  public void payEconomical() {
    if(balance >= 2.5) {
      balance -= 2.5;
    }
  }

  public void payGourmet() {
    if(balance >= 4) {
      balance -= 4;
    }
  }

  public String toString() {
    return "The card has " + balance + " dollars";
  }

}
