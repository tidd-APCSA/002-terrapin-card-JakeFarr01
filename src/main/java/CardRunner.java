public class CardRunner {
    public static void main(String args[]){

      TerrapinCard billyCard = new TerrapinCard(20);
      TerrapinCard brianCard = new TerrapinCard(30);

      billyCard.payGourmet();
      brianCard.payEconomical();

      System.out.println("Billy: " + billyCard);
      System.out.println("Brian: " + brianCard);

      billyCard.loadMoney(20);
      brianCard.payGourmet();

      System.out.println("Billy: " + billyCard);
      System.out.println("Brian: " + brianCard);

      billyCard.payEconomical();
      brianCard.payEconomical();

      brianCard.loadMoney(50);

      System.out.println("Billy: " + billyCard);
      System.out.println("Brian: " + brianCard);

    }
}
