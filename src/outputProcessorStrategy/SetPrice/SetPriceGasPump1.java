package outputProcessorStrategy.SetPrice;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;
import driver.GasPump1Driver;
import factory.GasPumpAbstractFactory;

public class SetPriceGasPump1 implements SetPrice {

	@Override
	public void setPrice(DataStore d) {
		// TODO Auto-generated method stub
		if(d instanceof DataStore1){
			//System.out.println("Price n ds in setPricepump1"+((DataStore1) d).getPrice());
		((DataStore1)OutputProcessor.dataStoreObj).setPrice(((DataStore1) d).getPrice());
    //System.out.println("Price in setPrice "+ ((DataStore1)OutputProcessor.dataStoreObj).getPrice());
		GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
		//System.out.println("GasPumpaf price"+((DataStore1)GasPumpAbstractFactory.ds).getPrice());
		}
}
}