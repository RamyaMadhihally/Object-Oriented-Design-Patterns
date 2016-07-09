package factory;

import outputProcessorStrategy.CancelMsg.CancelMsg;

import outputProcessorStrategy.CancelMsg.CancelMsg1;
import outputProcessorStrategy.DisplayMenu.DisplayMenu;
import outputProcessorStrategy.DisplayMenu.DisplayMenu2;
import outputProcessorStrategy.GasPumpedMsg.GasPumpedMsg;
import outputProcessorStrategy.GasPumpedMsg.GasPumpedMsg1;
import outputProcessorStrategy.PayMsg.PayMsg;
import outputProcessorStrategy.PayMsg.PayMsg3;
import outputProcessorStrategy.PrintReceipt.PrintReceipt;
import outputProcessorStrategy.PrintReceipt.PrintReceipt1;
import outputProcessorStrategy.PumpGas.PumpGasGasPump1;
import outputProcessorStrategy.PumpGas.PumpGasUnit;
import outputProcessorStrategy.ReadyMsg.ReadyMsg;
import outputProcessorStrategy.ReadyMsg.ReadyMsg1;
import outputProcessorStrategy.RejectMsg.RejectMsg;
import outputProcessorStrategy.RejectMsg.RejectMsg1;
import outputProcessorStrategy.SetInitialValues.SetInitialValues;
import outputProcessorStrategy.SetInitialValues.SetInitialValues1;
import outputProcessorStrategy.SetPrice.SetPrice;
import outputProcessorStrategy.SetPrice.SetPriceGasPump2;
import outputProcessorStrategy.SetW.SetW;
import outputProcessorStrategy.SetW.SetWGasPump;
import outputProcessorStrategy.StopMsg.StopMsg;
import outputProcessorStrategy.StopMsg.StopMsg1;
import outputProcessorStrategy.StoreCash.StoreCash;
import outputProcessorStrategy.StoreCash.StoreCashFloat;
import outputProcessorStrategy.StoreData.StoreData;
import outputProcessorStrategy.StoreData.StoreData2;
import dataStore.DataStore;
import dataStore.DataStore2;

//Concrete Factory for GasPump2 : Corresponding objects for GAspump2 are created
public class GasPump2ConcreteFactory extends GasPumpAbstractFactory {

	@Override
	public DataStore getDataStoreObject() {
		// TODO Auto-generated method stub
		return new DataStore2();
	}

	@Override
	public StoreData getStoreDataObject() {
		// TODO Auto-generated method stub
		return new StoreData2();
	}

	@Override
	public PayMsg getPayMsgObject() {
		// TODO Auto-generated method stub
		return new PayMsg3();
	}

	@Override
	public StoreCash getStoreCashObject() {
		// TODO Auto-generated method stub
		
		return new StoreCashFloat();
	}

	@Override
	public DisplayMenu getDisplayMenuObject() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	@Override
	public RejectMsg getRejectMsgObject() {
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	@Override
	public SetW getSetWObject() {
		// TODO Auto-generated method stub
		return new SetWGasPump();
	}

	@Override
	public SetPrice getSetPriceObject() {
		// TODO Auto-generated method stub
		return new SetPriceGasPump2();
	}

	@Override
	public ReadyMsg getReadyMsgObject() {
		// TODO Auto-generated method stub
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValues getSetInitialValuesObject() {
		// TODO Auto-generated method stub
		return new SetInitialValues1();
	}

	@Override
	public PumpGasUnit getPumpGasUnitObject() {
		// TODO Auto-generated method stub
		return new PumpGasGasPump1();
	}

	@Override
	public GasPumpedMsg getGasPumpedMsgObject() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg1();
	}

	@Override
	public StopMsg getStopMsgObject() {
		// TODO Auto-generated method stub
		return new StopMsg1();
	}

	@Override
	public PrintReceipt getPrintReceiptObject() {
		// TODO Auto-generated method stub
		return new PrintReceipt1();
	}

	@Override
	public CancelMsg getCancelMsgObject() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

}
