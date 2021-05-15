
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
	
		
        
			BaseeCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
			
		    customerManager.Save(new Customer(1,"engin","demirog",LocalDate.of(2000, 9, 1) ,"12345678"));
			
	}
}
		
			
			
				
		   
	