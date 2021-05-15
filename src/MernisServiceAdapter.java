

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
private boolean result;

	public Boolean checkRealPerson(Customer customer) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			this.result = client.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), (int)customer.dateOfBirth.getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.result;
	}

}