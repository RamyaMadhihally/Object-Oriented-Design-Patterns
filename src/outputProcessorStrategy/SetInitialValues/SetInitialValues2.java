package outputProcessorStrategy.SetInitialValues;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore3;
import factory.GasPumpAbstractFactory;
public class SetInitialValues2 implements SetInitialValues{
	public void setInitialValues(DataStore d) {
		
		// TODO Auto-generated method stub
      ( (DataStore3)OutputProcessor.dataStoreObj).setL(0);
      ( (DataStore3)OutputProcessor.dataStoreObj).setTotal(0);
       GasPumpAbstractFactory.ds= OutputProcessor.dataStoreObj;
	}
}
