package outputProcessorStrategy.PrintReceipt;

import outputProcessor.OutputProcessor;
import dataStore.DataStore3;

public class PrintReceipt2 implements PrintReceipt {

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		System.out.println("***Receipt***");
		  float bill=((DataStore3)OutputProcessor.dataStoreObj).getTotal();
		  int L=((DataStore3)OutputProcessor.dataStoreObj).getL();
		  System.out.println(L +" liters of Gas Pumped :" );
		  System.out.println("Total Bill Amount : " + bill );
		  
	}

}
