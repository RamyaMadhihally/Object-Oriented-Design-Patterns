package outputProcessor;

import dataStore.DataStore;
import dataStore.DataStore2;
import dataStore.DataStore1;
import dataStore.DataStore3;
import factory.GasPump1ConcreteFactory;
import factory.GasPumpAbstractFactory;
import outputProcessorStrategy.CancelMsg.CancelMsg;
import outputProcessorStrategy.DisplayMenu.DisplayMenu;
import outputProcessorStrategy.GasPumpedMsg.GasPumpedMsg;
import outputProcessorStrategy.PayMsg.PayMsg;
import outputProcessorStrategy.PrintReceipt.PrintReceipt;
import outputProcessorStrategy.PumpGas.PumpGasUnit;
import outputProcessorStrategy.ReadyMsg.ReadyMsg;
import outputProcessorStrategy.RejectMsg.RejectMsg;
import outputProcessorStrategy.SetInitialValues.SetInitialValues;
import outputProcessorStrategy.SetInitialValues.SetInitialValues1;
import outputProcessorStrategy.SetInitialValues.SetInitialValues2;
import outputProcessorStrategy.SetPrice.SetPrice;
import outputProcessorStrategy.SetW.SetW;
import outputProcessorStrategy.StopMsg.StopMsg;
import outputProcessorStrategy.StoreCash.StoreCash;
import outputProcessorStrategy.StoreData.StoreData;
// Output processor class : implements Strategy Design Pattern
public class OutputProcessor {
	private GasPumpAbstractFactory factoryObj=null;
	public static DataStore dataStoreObj=null;
	private StoreCash storeCashObj=null;
	private StoreData storeDataObj=null;
	private PrintReceipt printReceiptObj=null;
	private SetW setWObj=null;
	private SetPrice setPriceObj=null;
	private DisplayMenu displayMenuObj=null;
	private ReadyMsg readyMsgObj=null;
	private CancelMsg cancelMsgObj=null;
	private RejectMsg rejectMsgObj=null;
	private PumpGasUnit pumpGasObject=null;
	private SetInitialValues setInitialValuesObj=null;
	private PayMsg payMsgObj=null;
	private StopMsg stopMsgObj=null;
	private GasPumpedMsg gasPumpedMsgObj=null;

	//parameterized constructor for initializing the Output Processor object
	public OutputProcessor(GasPumpAbstractFactory factory) {
		this.factoryObj = factory;
		OutputProcessor.dataStoreObj=factory.getDataStoreObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;

	}
	// MDAEFSM Action for activation of the pump
	public void StoreData(){
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		storeDataObj=factoryObj.getStoreDataObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		storeDataObj.storeData(OutputProcessor.dataStoreObj);

	}
	//Action for Stopping the pump
	public void stopMsg(){
		stopMsgObj=factoryObj.getStopMsgObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		stopMsgObj.displayStopMsg();
	}
	//Action invoked when cash is paid
	public void storeCash(){
		storeCashObj=factoryObj.getStoreCashObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		storeCashObj.storeCash(OutputProcessor.dataStoreObj);
	}
	//Action for printing the receipt
	public void PrintReceipt(){
		System.out.println("OUTPUT ACTION : Printing the receipt for Gaspump1");
		printReceiptObj=factoryObj.getPrintReceiptObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		printReceiptObj.printReceipt();
	}

	//Action to set whether the payment is cash or credit
	public void setW(int k){
		setWObj=factoryObj.getSetWObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		setWObj.setW(k);
	}
	//Action to store the price of gas
	public void setPrice(int g){
		setPriceObj=factoryObj.getSetPriceObject();
		if(OutputProcessor.dataStoreObj instanceof DataStore2)	
			((DataStore2)OutputProcessor.dataStoreObj).setTemp_g(g);
		else if(OutputProcessor.dataStoreObj instanceof DataStore3)
			((DataStore3)OutputProcessor.dataStoreObj).setTemp_g(g);
		setPriceObj.setPrice(GasPumpAbstractFactory.ds);
	}
	//Action to display menus
	public void displayMenu(){
		displayMenuObj=factoryObj.getDisplayMenuObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		displayMenuObj.displayMenu();
	}
	//Action to display the ready message , when the pump is started
	public void readyMsg(){
		readyMsgObj=factoryObj.getReadyMsgObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		readyMsgObj.displayReadyMsg();
	}
	//Action to display the cancelation msg when the user cancels the transaction
	public void cancelMsg(){
		cancelMsgObj=factoryObj.getCancelMsgObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		cancelMsgObj.displayCancelMsg();
	}
	//Action to be invoked when the card details are rejected
	public void rejectMsg(){
		rejectMsgObj=factoryObj.getRejectMsgObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		rejectMsgObj.displayRejectMsg();
	}
	//Action for pumping gas
	public void PumpGas(){
		pumpGasObject=factoryObj.getPumpGasUnitObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		pumpGasObject.pumpGas();
	}
	//Action to store initial values, when the pump is started
	public void setInitialValues(){
		setInitialValuesObj=factoryObj.getSetInitialValuesObject();
		OutputProcessor.dataStoreObj = GasPumpAbstractFactory.ds;
		if(setInitialValuesObj instanceof SetInitialValues2)
			((SetInitialValues2)setInitialValuesObj).setInitialValues(OutputProcessor.dataStoreObj);
		else
			((SetInitialValues1)setInitialValuesObj).setInitialValues(OutputProcessor.dataStoreObj);
	}
	//Action for payment message display
	public void payMsg(){
		payMsgObj=factoryObj.getPayMsgObject();
		payMsgObj.displayPaymentMsg();
	}
	//action for gas pumped message display
	public void gasPumpedMsg(){
		gasPumpedMsgObj=factoryObj.getGasPumpedMsgObject();
		gasPumpedMsgObj.displayGasPumpedMsg();
	}
}
