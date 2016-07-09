package inputProcessor;

import mdaEFSM.MDAEFSM;
import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;
import dataStore.DataStore3;
import driver.GasPump2Driver;
import driver.GasPump3Driver;
import factory.GasPumpAbstractFactory;
//Input Processor for Gas Pump3; this class interacts with the MDA class
public class GasPump3 {
	// References to the MDA , DataStore and Abstract factory classes
	private MDAEFSM mdaefsm;
	private DataStore3 dataStore;
	public static GasPumpAbstractFactory af;
	/* Constructor for creating the GasPump2 Object with the MDAEFSM and DataStore Objects */
	public GasPump3() {
		// TODO Auto-generated constructor stub
		af=GasPump3Driver.factory3;
		dataStore=(DataStore3) af.getDataStoreObject();
		GasPumpAbstractFactory.ds=GasPump3Driver.ds3;
		mdaefsm=new MDAEFSM(af);
	}
	public void activate(float a, float b){
		if(a>0 && b>0){
			dataStore.setTemp_rPrice(a);
			dataStore.setTemp_pPrice(b);
			GasPumpAbstractFactory.ds=dataStore;
			GasPump3Driver.ds3.setTemp_rPrice(a);
			GasPump3Driver.ds3.setTemp_rPrice(b);
			mdaefsm.activate();
		}
		else{
			System.out.println("Invalid price of gas");
		}
	}

	public void start(){
		mdaefsm.start();
	}
	public void payCash(float c){
		if(c>0){
			((DataStore3)dataStore).setTemp_cash(c);
			//System.out.println("Paycash"+);
			((DataStore3)GasPumpAbstractFactory.ds).setTemp_cash(c);
			((DataStore3)GasPump3Driver.ds3).setTemp_cash(c);
			//System.out.println("C");
			mdaefsm.payCash();

		}
		else{
			System.out.println("Invalid cash amount");
		}
	}

	public void cancel(){
		mdaefsm.cancel();
	}

	public void premium(){
		((DataStore3)GasPumpAbstractFactory.ds).setTemp_g(2);
		//System.out.println("premium"+((DataStore3)GasPumpAbstractFactory.ds).getTemp_pPrice());
		mdaefsm.selectGas(2);
	}
	public void regular(){
		((DataStore3)GasPumpAbstractFactory.ds).setTemp_g(1);
		mdaefsm.selectGas(1);
	}
	public void startPump(){
		mdaefsm.startPump();
	}
	public void pumpLiter(){
		int L=((DataStore3)GasPumpAbstractFactory.ds).getL();
		//System.out.println("L"+L);
		//System.out.println("G is"+L);
		float cash=((DataStore3)GasPumpAbstractFactory.ds).getCash();
		//System.out.println("cash"+cash);
		float price=((DataStore3)GasPumpAbstractFactory.ds).getPrice();
		//System.out.println("price"+price);
		float price1=((L+1)*price);
		//System.out.println("price1 "+price1);
		if (cash<price1){
			System.out.println("Cash paid is insufficient to pump more gas");
			mdaefsm.stopPump();
			//mdaefsm.receipt();
			//this.dataStore=(DataStore3) GasPumpAbstractFactory.ds;
		}
		else{
			mdaefsm.pump();
			this.dataStore=(DataStore3) GasPumpAbstractFactory.ds;
		}

	}
	public void stopPump(){
		mdaefsm.stopPump();
	}
	public void receipt(){
		mdaefsm.receipt();
	}
	public void noReceipt(){
		mdaefsm.noReceipt();
	}

}
