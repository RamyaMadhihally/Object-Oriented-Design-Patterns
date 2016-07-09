package outputProcessorStrategy.SetPrice;

import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore2;
import driver.GasPump1Driver;
import driver.GasPump3Driver;
import factory.GasPumpAbstractFactory;
import dataStore.DataStore3;
public class SetPriceGasPump2 implements SetPrice {

	@Override
	public void setPrice(DataStore d) {
		// TODO Auto-generated method stub
		//System.out.println("inside setprice2");
		if(d instanceof DataStore2){
			if(((DataStore2)d).getTemp_g()==1)
			//System.out.println("Temp Price "+ ((DataStore2)d).getTemp_Rprice());
			((DataStore2)GasPumpAbstractFactory.ds).setPrice(((DataStore2)d).getTemp_Rprice());
			else
((DataStore2)OutputProcessor.dataStoreObj).setPrice(((DataStore2)d).getTemp_Sprice());
		}	
			else{
				//System.out.println("else in setprice");
				//System.out.println("Temp_g in Setprice"+((DataStore3)d).getTemp_g());
				//System.out.println();
				if(((DataStore3)d).getTemp_g()==1){
			
				((DataStore3)GasPumpAbstractFactory.ds).setPrice(((DataStore3)GasPumpAbstractFactory.ds).getTemp_rPrice())
					;}
				else {
					//System.out.println("setting"+((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());
					((DataStore3)GasPumpAbstractFactory.ds).setPrice(((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());
				}
			//System.out.println("price of ds3"+((DataStore3)GasPumpAbstractFactory.ds).getPrice());
			}

}
}

