package Concrete;

import Abstract.BaseeCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseeCustomerManager {

	 ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	@Override
	public void Save(Customer customer) {
	       if(customerCheckService.checkRealPerson(customer)) {
	    	   super.Save(customer);
	       }
	       else {
	    	   System.out.println("not a valid person");;
	       }
	      
	}
	
	
		
	
	 

}
