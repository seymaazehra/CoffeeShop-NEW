package Concrete;





import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	public boolean checkRealPerson(Customer customer) {
	return true;
		
	}

	
  
}
