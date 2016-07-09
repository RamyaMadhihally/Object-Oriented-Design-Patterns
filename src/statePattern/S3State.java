package statePattern;

import dataStore.DataStore3;
import outputProcessor.OutputProcessor;
import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S3State extends StateAbstract {
	public S3State(MDAEFSM mdaEfsm,GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}

	public void selectGas(int g){
		op.setPrice(g);
		mdaEfsm.changeState(5);
	}
	public void cancel(){
		OutputProcessor.dataStoreObj=GasPumpAbstractFactory.ds;
		op.cancelMsg();
		mdaEfsm.changeState(1);
	}
	@Override
	public void activate() {
		// TODO Auto-generated method stub

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
	public void receipt() {
		// TODO Auto-generated method stub

	}
	@Override
	public void noReceipt() {
		// TODO Auto-generated method stub

	}
}
