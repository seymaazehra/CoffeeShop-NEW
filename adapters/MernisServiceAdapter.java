package adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			result=proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),5);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}