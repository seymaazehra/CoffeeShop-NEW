

public class StarbucksCustomerManager extends BaseeCustomerManager {

	 private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
	}
	
	
	@Override
	public void Save(Customer customer) {
	       if(_customerCheckService.checkRealPerson(customer)) {
	    	   super.Save(customer);
	       }
	       else {
	    	   System.out.println("not a valid person");;
	       }
	      
	}
	
	
		
	
	 

}
