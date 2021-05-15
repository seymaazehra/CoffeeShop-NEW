
public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager=new GamerManager();
		gamerManager.Add(new Gamer ("12345678","zehra","kutukcu","2000"));
		gamerManager.Delete(new Gamer("12345678","engin","demirog","1986"));
		gamerManager.Update(new Gamer("12345678","engin","demirog","1986"));
		System.out.println();
				
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.Sale(new Game(20,500));
		System.out.println();
        
		SaleManager saleManager=new SaleManager();
		saleManager.Sale(new Game(10,100));
	}

}
