package outputProcessorStrategy.PumpGas;

import outputProcessor.OutputProcessor;
import dataStore.DataStore3;
import factory.GasPumpAbstractFactory;

public class PumpGasGasPump2 implements PumpGasUnit {

	@Override
	public void pumpGas() {
		// TODO Auto-generated method stub
		int x=((DataStore3)OutputProcessor.dataStoreObj).getL();
		x=x+1;
		float price=((DataStore3)OutputProcessor.dataStoreObj).getPrice();
		((DataStore3)OutputProcessor.dataStoreObj).setL(x);
		((DataStore3)OutputProcessor.dataStoreObj).setTotal(x*price);
		//GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
		((DataStore3)GasPumpAbstractFactory.ds).setL(x);
		((DataStore3)GasPumpAbstractFactory.ds).setTotal(x*price);
		//System.out.println("Disposed " + x + " gallons of gas");	
		System.out.println("Disposing " + x + " liters of gas");
	}

}
