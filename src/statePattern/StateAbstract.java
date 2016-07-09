package statePattern;



import factory.GasPumpAbstractFactory;
import outputProcessor.OutputProcessor;
import mdaEFSM.MDAEFSM;
// Abstract state class : State pattern is implemented for the states of the gas pump
public abstract class StateAbstract {
	protected MDAEFSM mdaEfsm;
	protected OutputProcessor op;


	public StateAbstract(MDAEFSM mdaEfsm,GasPumpAbstractFactory af) {
		this.mdaEfsm = mdaEfsm;
		this.op = new OutputProcessor(af);

	}
	public abstract void activate();
	public abstract void start();
	public abstract void payCredit();
	public abstract void payCash();
	public abstract  void reject();
	public abstract void cancel();
	public abstract void approved();
	public abstract void startPump();
	public abstract void pump();
	public abstract void stopPump();
	public abstract void selectGas(int g);
	public abstract void receipt();
	public abstract void noReceipt();
}
