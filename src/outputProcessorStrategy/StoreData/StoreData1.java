package outputProcessorStrategy.StoreData;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore1;
import driver.GasPump1Driver;
import factory.GasPumpAbstractFactory;

public class StoreData1 implements StoreData {

	@Override
	public void storeData(DataStore d) {
		// TODO Auto-generated method stub
		int a=((DataStore1)d).getTemp_price();
		((DataStore1)OutputProcessor.dataStoreObj).setPrice(a);
		//GasPumpAbstractFactory.ds
		((DataStore1)GasPumpAbstractFactory.ds).setPrice(a);
		//System.out.println("Stroe data " +((DataStore1)GasPumpAbstractFactory.ds).getPrice() );
	}

}
