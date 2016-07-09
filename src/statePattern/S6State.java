package statePattern;

import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S6State extends StateAbstract{
	public S6State(MDAEFSM mdaEfsm, GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}
	public void receipt(){
		op.PrintReceipt();
		mdaEfsm.changeState(1);
	}
	public void noReceipt(){
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
}
