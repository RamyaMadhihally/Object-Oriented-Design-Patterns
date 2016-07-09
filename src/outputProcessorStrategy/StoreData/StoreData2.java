package outputProcessorStrategy.StoreData;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore2;
import dataStore.DataStore3;
import factory.GasPumpAbstractFactory;

public class StoreData2 implements StoreData {

	@Override
	public void storeData(DataStore d) {
		// TODO Auto-generated method stub
		if(d instanceof DataStore2){
			
			float a=((DataStore2)d).getTemp_Rprice();
			float b=((DataStore2)d).getTemp_Sprice();
			//System.out.println("Inside store data 2"+ "a"+a+"b"+b);
			((DataStore2)GasPumpAbstractFactory.ds).setRprice(a);
			((DataStore2)GasPumpAbstractFactory.ds).setSprice(b);
		}
		else if(d instanceof DataStore3){
			float a=((DataStore3)d).getTemp_rPrice();
			float b=((DataStore3)d).getTemp_pPrice();
			//System.out.println("Inside store data 3"+ "a"+a+"b"+b);
			((DataStore3)GasPumpAbstractFactory.ds).setTemp_pPrice(b);
			//System.out.println("In store dta"+((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());
			((DataStore3)GasPumpAbstractFactory.ds).setTemp_rPrice(a);
			((DataStore3)GasPumpAbstractFactory.ds).setTemp_pPrice(b);
			((DataStore3)OutputProcessor.dataStoreObj).setTemp_pPrice(b);
			((DataStore3)OutputProcessor.dataStoreObj).setTemp_rPrice(a);
			//System.out.println("In store data method"+((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());
		}
	}

}
