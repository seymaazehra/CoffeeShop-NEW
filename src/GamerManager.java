
public class GamerManager {
	public void Add(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adlý kullanýcý eklendi.");
    }
    public void Delete(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adlý kullanýcý silindi. ");
    }
    public void Update(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adlý kullanýcý güncellendi. ");
    }
}
