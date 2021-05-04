package day4_Homework2.adapters;

import java.rmi.RemoteException;

import day4_Homework2.abstracts.CustomerCheckService;
import day4_Homework2.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch(RemoteException e) {
			e.printStackTrace();
		}

		return result;
	}

}
