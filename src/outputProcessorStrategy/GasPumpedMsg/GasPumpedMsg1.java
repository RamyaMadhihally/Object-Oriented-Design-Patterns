package outputProcessorStrategy.GasPumpedMsg;

import dataStore.DataStore1;
import dataStore.DataStore2;
import factory.GasPumpAbstractFactory;

public class GasPumpedMsg1 implements GasPumpedMsg {

	@Override
	
		// TODO Auto-generated method stub
		public void displayGasPumpedMsg() {
			// TODO Auto-generated method stub
			if(GasPumpAbstractFactory.ds instanceof DataStore1)
	     System.out.println(((DataStore1)GasPumpAbstractFactory.ds).total+" was the amount of the gas disposed");
		
		else if(GasPumpAbstractFactory.ds instanceof DataStore2)
			System.out.println(((DataStore2)GasPumpAbstractFactory.ds).getTotal()+" was the amount of the gas disposed");
	
	}

}
