package mdaEFSM;




import factory.GasPumpAbstractFactory;

import statePattern.StateAbstract;
import statePattern.S0State;
import statePattern.S1State;
import statePattern.S2State;
import statePattern.S3State;
import statePattern.S4State;
import statePattern.S5State;
import statePattern.S6State;
import statePattern.StartState;

// MDA class : the class interacts with the the output processor  
public class MDAEFSM {

	// Variable with the various states of the gas pump
	private StateAbstract[] LS=new StateAbstract[8];
	private StateAbstract s;
	public MDAEFSM(GasPumpAbstractFactory af) {
		// TODO Auto-generated constructor stub
		s=new StartState(this,af);
		LS[0]=new StartState(this,af);
		LS[1]=new S0State(this,af);
		LS[2]=new S1State(this,af);
		LS[3]=new  S2State(this,af);
		LS[4]=new  S3State(this,af);
		LS[5]=new  S4State(this,af);
		LS[6]=new  S5State(this,af);
		LS[7]=new  S6State(this,af);
	}


	public void activate(){
		if( (s instanceof StartState)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else((StartState)s).activate();
	}
	public void start(){
		//System.out.println("Current state is "+s);
		if( (s instanceof S0State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else((S0State)s).start();
	}
	public void payCredit(){
		if( (s instanceof S1State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else((S1State)s).payCredit();

	}
	public void payCash(){
		if( (s instanceof S1State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else((S1State)s).payCash();

	}
	public void reject(){
		if( (s instanceof S2State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S2State)s).reject();
	}
	public void cancel(){
		if( (s instanceof S3State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S3State)s).cancel();

	}
	public void approved(){
		if( (s instanceof S2State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S2State)s).approved();

	}
	public void startPump(){
		if( (s instanceof S4State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S4State)s).startPump();

	}
	public void pump(){
		if( (s instanceof S5State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S5State)s).pump();

	}
	public void stopPump(){
		if( (s instanceof S5State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S5State)s).stopPump();
	}
	public void selectGas(int g){
		if( (s instanceof S3State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S3State)s).selectGas(g);

	}
	public void receipt(){
		if( (s instanceof S6State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S6State)s).receipt();
	}
	public void noReceipt(){
		if( (s instanceof S6State)==false )
			System.out.println("Invalid operation on the current state of the pump");
		else ((S6State)s).noReceipt();

	}
	public void changeState(int stateId){
		this.s=LS[stateId];
	}



}
