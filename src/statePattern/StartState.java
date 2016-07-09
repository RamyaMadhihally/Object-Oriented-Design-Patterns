package statePattern;

import outputProcessor.OutputProcessor;
import dataStore.DataStore1;
import dataStore.DataStore2;
import driver.GasPump1Driver;
import driver.GasPump2Driver;
import driver.GasPump3Driver;
import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class StartState extends StateAbstract{

	public StartState(MDAEFSM mdaEfsm,GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		op.StoreData();
		mdaEfsm.changeState(1);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payCash() {
		// TODO Auto-generated method stub

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
