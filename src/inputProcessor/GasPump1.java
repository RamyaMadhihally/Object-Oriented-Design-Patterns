package inputProcessor;

import mdaEFSM.MDAEFSM;
import dataStore.DataStore;
import dataStore.DataStore1;
import driver.GasPump1Driver;
import factory.GasPump1ConcreteFactory;
import factory.GasPumpAbstractFactory;

/**
 * @author Ramya Sreenidhi
 *
 */
// Input Processor for Gas Pump1; this class interacts with the MDA class
public class GasPump1 {
	// References to the MDA , DataStore and Abstract factory classes
	public static MDAEFSM mdaefsm;
	public static DataStore1 dataStore;
	public static GasPumpAbstractFactory gpAf;

	/* Constructor for creating the GasPump1 Object with the MDAEFSM and DataStore Objects */
	public GasPump1() {
		// TODO Auto-generated constructor stub
		gpAf=GasPump1Driver.factory1;
		dataStore=GasPump1Driver.ds1;
		mdaefsm=new MDAEFSM(gpAf);
	}

	public void activate(int a){
		if(a>0){	
			dataStore.setTemp_price(a);
			GasPump1Driver.ds1=dataStore;
			GasPumpAbstractFactory.ds=GasPump1Driver.ds1;
			mdaefsm.activate();
		}
		else{
			System.out.println(" Invalid price of gas");
		}
	}

	public void start(){
		mdaefsm.start();
	}
	public void payCredit(){
		mdaefsm.payCredit();
	}
	public void reject(){
		mdaefsm.reject();
	}
	public void cancel(){
		mdaefsm.cancel();
	}
	public void approved(){
		mdaefsm.approved();
	}
	public void payCash(int c){
		if(c>0){
			((DataStore1)dataStore).setTemp_cash(c);
			GasPump1Driver.ds1=dataStore;
			mdaefsm.payCash();
		}
		else{
			System.out.println("Invalid cash amount");
		}
	}
	public void startPump(){
		mdaefsm.selectGas(1);
		mdaefsm.startPump();
	}
	public void pumpGallon(){
		DataStore1 ds1=(DataStore1) GasPumpAbstractFactory.ds;
		int w=ds1.getW();
		int G=ds1.getG();
		int cash=ds1.getCash();
		int price=ds1.getPrice();
		int price1=(G+1)*price;
		if(w==1)
			mdaefsm.pump();
		else if (w==0 && cash<price1){
			System.out.println("Cash paid is insufficient to pump more gas");
			mdaefsm.stopPump();
			mdaefsm.receipt();
		}
		else{
			mdaefsm.pump();
		}
	}
	public void stopPump(){
		mdaefsm.stopPump();
		mdaefsm.receipt();
	}
}