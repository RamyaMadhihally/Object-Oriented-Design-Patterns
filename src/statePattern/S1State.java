package statePattern;

import dataStore.DataStore1;
import driver.GasPump1Driver;
import driver.GasPump3Driver;
import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S1State extends StateAbstract{
	public S1State(MDAEFSM mdaEfsm, GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}

	public void start(){

	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		mdaEfsm.changeState(3);
	}

	@Override
	public void payCash() {
		// TODO Auto-generated method stub
		/*if(GasPumpAbstractFactory.ds instanceof DataStore1){
	//GasPumpAbstractFactory.ds=GasPump1Driver.ds1;
	System.out.println("Paycasgin s1"+((DataStore1)GasPumpAbstractFactory.ds).getTemp_cash());
	}
	else{
		//GasPumpAbstractFactory.ds=GasPump3Driver.ds3;
	}*/
		op.storeCash();
		op.setW(0);
		op.displayMenu();
		mdaEfsm.changeState(4);
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void approved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stopPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectGas(int g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void receipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void noReceipt() {
		// TODO Auto-generated method stub

	}
}
