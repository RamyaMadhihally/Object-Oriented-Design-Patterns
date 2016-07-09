package inputProcessor;

import mdaEFSM.MDAEFSM;
import dataStore.DataStore;
import dataStore.DataStore2;
import driver.GasPump1Driver;
import driver.GasPump2Driver;
import factory.GasPumpAbstractFactory;
//Input Processor for Gas Pump2; this class interacts with the MDA class
public class GasPump2 {
	// References to the MDA , DataStore and Abstract factory classes
	private MDAEFSM mdaefsm;
	private DataStore2 dataStore;
	public static GasPumpAbstractFactory af;
	/* Constructor for creating the GasPump2 Object with the MDAEFSM and DataStore Objects */
	public GasPump2() {
		// TODO Auto-generated constructor stub
		//this.mdaefsm=GasPump2Driver.mdaefsm;
		this.dataStore=GasPump2Driver.ds2;
		af=GasPump2Driver.factory2;
		mdaefsm=new MDAEFSM(af);
	}

	public void activate(float a, float b){

		if(a>0 && b>0){
			dataStore.setTemp_Rprice(a);
			dataStore.setTemp_Sprice(b);
			GasPump2Driver.ds2=dataStore;
			GasPumpAbstractFactory.ds=GasPump2Driver.ds2;

			mdaefsm.activate();
		}
		else{
			System.out.println("Invalid price of gas");
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
	public void Super(){
		mdaefsm.selectGas(2);
	}
	public void regular(){
		//System.out.println("iside gaspump2");
		mdaefsm.selectGas(1);
	}
	public void startPump(){
		mdaefsm.startPump();
	}
	public void pumpGallon(){
		mdaefsm.pump();
	}
	public void stopPump(){
		mdaefsm.stopPump();
		mdaefsm.receipt();
	}


}
