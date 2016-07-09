package outputProcessorStrategy.StoreCash;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore1;
import driver.GasPump1Driver;
import factory.GasPumpAbstractFactory;

public class StoreCashGasPump1 implements StoreCash {

	@Override
	public void storeCash(DataStore d) {
		// TODO Auto-generated method stub 
		
		int cash=((DataStore1)d).getTemp_cash();
		//System.out.println("store cash"+cash);
		((DataStore1)OutputProcessor.dataStoreObj).setCash(cash);
		GasPump1Driver.ds1.setCash(((DataStore1)d).getTemp_cash());
		((DataStore1)GasPumpAbstractFactory.ds).setCash(((DataStore1)d).getTemp_cash());
		//System.out.println("Store cash"+((DataStore1)GasPumpAbstractFactory.ds).getCash());
	}

}
