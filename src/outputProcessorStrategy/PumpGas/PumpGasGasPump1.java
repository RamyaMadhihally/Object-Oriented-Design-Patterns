package outputProcessorStrategy.PumpGas;

import outputProcessor.OutputProcessor;
import dataStore.DataStore2;
import dataStore.DataStore1;
import factory.GasPump1ConcreteFactory;
import factory.GasPumpAbstractFactory;


public class PumpGasGasPump1 implements PumpGasUnit {

	@Override
	/*public void pumpGas() {
		// TODO Auto-generated method stub
		DataStore1 ds1=(DataStore1) OutputProcessor.dataStoreObj;
		System.out.println("G in OP Pumpgas1 + price "+ds1.getG()+"price"+ds1.getPrice()+" "+ds1.getCash());
		int x = ds1.getG() + 1;
		ds1.setG(x);
		ds1.setTotal(x *(ds1.getPrice()));
		OutputProcessor.dataStoreObj=ds1;
		System.out.println("Disposed " + x + " gallons of gas");
		GasPumpAbstractFactory.ds=ds1;
	}*/
	public void pumpGas() {
		// TODO Auto-generated method stub
		/*int x = GasPump1Driver.ds1.getG() + 1;
		GasPump1Driver.ds1.setG(x);
		GasPump1Driver.ds1.setTotal(x * (GasPump1Driver.ds1.getPrice()));*/
		if(OutputProcessor.dataStoreObj instanceof DataStore1){
		int x=((DataStore1)OutputProcessor.dataStoreObj).getG()+1;
		int price=((DataStore1)OutputProcessor.dataStoreObj).getPrice();
		((DataStore1)OutputProcessor.dataStoreObj).setG(x);
		((DataStore1)OutputProcessor.dataStoreObj).setTotal(x*price);
		GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
		System.out.println("Disposed " + x + " gallons of gas");
	}
		else{
			try{
			//System.out.println("else in pump gas in strategy");
			int x=((DataStore2)OutputProcessor.dataStoreObj).getG()+1;
			float price=((DataStore2)OutputProcessor.dataStoreObj).getPrice();
			((DataStore2)OutputProcessor.dataStoreObj).setG(x);
			((DataStore2)OutputProcessor.dataStoreObj).setTotal(x*price);
			GasPumpAbstractFactory.ds=OutputProcessor.dataStoreObj;
			System.out.println("Disposed " + x + " gallons of gas");	
			}catch(Exception e){
				System.out.println("pumpgaspump1"+e.getMessage());}
			}
	}
}
