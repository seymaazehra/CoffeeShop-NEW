import java.time.LocalDate;
import java.time.LocalDateTime;

import Abstract.BaseeCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		customer.setId(5);
		customer.setFirstName("engin");
		customer.setLastName("demirog");
        customer.setDateOfBirth(LocalDate.of(1986, 8, 6));
        customer.setNationalityId("12345678");
        
			BaseeCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceeAdapter());
		
			
			
			
			
				
		   
           customerManager.Save(new Customer (5,"engin","demirog",LocalDate.of(1986, 8, 6),"12345678"));
	       System.out.println();
	
			
	
			}

	
}

