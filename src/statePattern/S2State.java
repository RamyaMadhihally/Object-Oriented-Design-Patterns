package statePattern;

import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S2State extends StateAbstract {
	public S2State(MDAEFSM mdaEfsm, GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}
	public void approved(){
		op.setW(1);
		op.displayMenu();
		mdaEfsm.changeState(4);
	}
	public void reject(){
		op.rejectMsg();
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
	public void cancel() {
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
