package outputProcessorStrategy.PrintReceipt;

import dataStore.DataStore1;
import dataStore.DataStore2;
import factory.GasPumpAbstractFactory;
import outputProcessor.OutputProcessor;


public class PrintReceipt1 implements PrintReceipt {

	@Override
	/*public void printReceipt() {
		// TODO Auto-generated method stub
	System.out.println("***Receipt***");
	int bill=((DataStore1)OutputProcessor.dataStoreObj).getTotal();
   System.out.println("Total Bill Amount : " + bill );
	}*/
	
	public void printReceipt() {
		// TODO Auto-generated method stub
		OutputProcessor.dataStoreObj=GasPumpAbstractFactory.ds;
		if(OutputProcessor.dataStoreObj instanceof DataStore1){
	System.out.println("***Receipt***");
	//int bill=(GasPump1Driver.ds1.getTotal());
	
	int bill=((DataStore1)OutputProcessor.dataStoreObj).getTotal();
   System.out.println("Total Bill Amount : " + bill );
	}
		else{
			float bill=((DataStore2)OutputProcessor.dataStoreObj).getTotal();
			   System.out.println("Total Bill Amount : " + bill );
		}
	}

}
