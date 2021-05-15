
public class CampaignManager {
	
    public void Sale(Game game) {
    	
    	int sale=(game.gamePrice)*game.discount/100;
    	int sale2=game.gamePrice-((game.gamePrice)*game.discount/100);
    	String sale3="500tl üzeri oyun alýþveriþinde %20 oranýnda indirim uygulanýr.";
    	System.out.println("sadece size özel"+ game.gamePrice+" TL fiyatlý ürünün indirim oraný: % "+game.discount+ " indirim tutarý :"+sale+
    			     " indirimli oyun fiyati "+sale2 +"\n"+sale3);
    }
}
