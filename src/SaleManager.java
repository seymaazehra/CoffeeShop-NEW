
public class SaleManager extends CampaignManager{
         @Override
         public void Sale(Game game) {
         	
         	
         	int sale2=game.gamePrice-((game.gamePrice)*game.discount/100);
         
         	System.out.println("pandemiye özel %"+game.discount+ "indirim vardýr"+game.gamePrice+ " TL lik oyun alýþveriþinizin indirimli fiyati: "+sale2);
         }
}
