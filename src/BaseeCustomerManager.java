

public abstract class BaseeCustomerManager implements ICustomerService {
     

	@Override
	public void Save(Customer customer) {
		System.out.println("saved to db :"+customer.firstName);
		
	}
}
