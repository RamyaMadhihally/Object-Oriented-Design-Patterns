package statePattern;

import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S0State extends StateAbstract{

	public S0State(MDAEFSM mdaEfsm,GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
	}

	public void activate(){
		System.out.println("Invalid operation on the current state of the pump");
		return;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

		op.payMsg();
		mdaEfsm.changeState(2);
	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation on the current state of the pump");
		return;
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
