package Concrete;

import javax.management.remote.SubjectDelegationPermission;

import Abstract.BaseeCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public abstract class NeroCustomerManager extends BaseeCustomerManager{
             
	
	private ICustomerCheckService customerCheckService;
    
	public NeroCustomerManager(ICustomerCheckService customerCheckService)         
    {
    	this.customerCheckService=customerCheckService;
    }
    @Override
    public void Save(Customer customer) {
    	if(customerCheckService.checkRealPerson(customer)) {
    		super.Save(customer);
    	}else {
    		System.out.println("not a valid person");
    	}
    }

}
