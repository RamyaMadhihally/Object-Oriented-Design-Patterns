/**
 * 
 */
package outputProcessorStrategy.SetW;

import outputProcessor.OutputProcessor;
import dataStore.DataStore1;
import dataStore.DataStore2;
import driver.GasPump1Driver;
import factory.GasPumpAbstractFactory;

/**
 * @author Ramya Sreenidhi
 *
 */
public class SetWGasPump implements SetW {

	/* (non-Javadoc)
	 * @see outputProcessorStrategy.SetW.SetW#setW(int)
	 */
	@Override
	public void setW(int k) {
		// TODO Auto-generated method stub
   /* OutputProcessor.dataStoreObj.setW(k);
	}*/
	if(OutputProcessor.dataStoreObj instanceof DataStore1){
    	((DataStore1)OutputProcessor.dataStoreObj).setW(k);
    	GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
    }
    else if (OutputProcessor.dataStoreObj instanceof DataStore2){
    	((DataStore2)OutputProcessor.dataStoreObj).setW(k);
    	GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
    }
	}


}
