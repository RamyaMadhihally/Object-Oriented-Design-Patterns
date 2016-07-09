package statePattern;

import factory.GasPumpAbstractFactory;
import mdaEFSM.MDAEFSM;

public class S5State extends StateAbstract {
	public S5State(MDAEFSM mdaEfsm, GasPumpAbstractFactory af) {
		super(mdaEfsm,af);
		// TODO Auto-generated constructor stub
	}
	public void stopPump(){
		op.stopMsg();
		mdaEfsm.changeState(7);
	}
	public void pump(){
		op.PumpGas();
		op.gasPumpedMsg();
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
