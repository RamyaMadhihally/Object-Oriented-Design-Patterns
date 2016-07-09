package outputProcessorStrategy.SetInitialValues;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;
import factory.GasPumpAbstractFactory;

public class SetInitialValues1 implements SetInitialValues {

	@Override
	public void setInitialValues(DataStore d) {
		// TODO Auto-generated method stub
    /* if(d instanceof DataStore1){
    	 OutputProcessor.dataStoreObj=(DataStore1)d;
    	 GasPumpAbstractFactory.ds=(DataStore1)d;
     }*/
		if(d instanceof DataStore1){
			// TODO Auto-generated method stub
	      ( (DataStore1)OutputProcessor.dataStoreObj).setG(0);
	      ( (DataStore1)OutputProcessor.dataStoreObj).setTotal(0);
	       GasPumpAbstractFactory.ds= OutputProcessor.dataStoreObj;
		}
		else if(d instanceof DataStore2){
			// TODO Auto-generated method stub
			System.out.println("initial values");
	      ( (DataStore2)OutputProcessor.dataStoreObj).setG(0);
	      ( (DataStore2)OutputProcessor.dataStoreObj).setTotal(0);
	       GasPumpAbstractFactory.ds= OutputProcessor.dataStoreObj;
		}
	}

}
