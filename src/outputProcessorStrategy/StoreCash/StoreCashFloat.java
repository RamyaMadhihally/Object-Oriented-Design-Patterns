package outputProcessorStrategy.StoreCash;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore3;
import factory.GasPumpAbstractFactory;
public class StoreCashFloat implements StoreCash {

	@Override
	public void storeCash(DataStore d) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			float cash=((DataStore3)d).getTemp_cash();
			((DataStore3)GasPumpAbstractFactory.ds).setCash(cash);
			((DataStore3)OutputProcessor.dataStoreObj).setCash(cash);
			//System.out.println("(DataStore3)GasPumpAbstractFactory.ds)"+((DataStore3)GasPumpAbstractFactory.ds).getCash());
			//System.out.println("(DataStore3)GasPumpAbstractFactory.ds) pprice"+((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());	
	}
		
	}

	

