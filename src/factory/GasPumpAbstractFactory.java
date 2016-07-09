package factory;

import outputProcessorStrategy.CancelMsg.CancelMsg;
import outputProcessorStrategy.DisplayMenu.DisplayMenu;
import outputProcessorStrategy.GasPumpedMsg.GasPumpedMsg;
import outputProcessorStrategy.PayMsg.PayMsg;
import outputProcessorStrategy.PrintReceipt.PrintReceipt;
import outputProcessorStrategy.PumpGas.PumpGasUnit;
import outputProcessorStrategy.ReadyMsg.ReadyMsg;
import outputProcessorStrategy.SetInitialValues.SetInitialValues;
import outputProcessorStrategy.SetPrice.SetPrice;
import outputProcessorStrategy.SetW.SetW;
import outputProcessorStrategy.StopMsg.StopMsg;
import outputProcessorStrategy.StoreCash.StoreCash;
import outputProcessorStrategy.RejectMsg.RejectMsg;
import outputProcessorStrategy.StoreData.StoreData;
import dataStore.DataStore;

//Abstract Factory for various actions of the GasPumps
public abstract class GasPumpAbstractFactory {
  public static DataStore ds;
	public abstract DataStore getDataStoreObject();
	public abstract StoreData getStoreDataObject();
	public abstract PayMsg getPayMsgObject();
	public abstract StoreCash getStoreCashObject();
	public abstract DisplayMenu getDisplayMenuObject();
	public abstract RejectMsg getRejectMsgObject();
	public abstract SetW getSetWObject();
	public abstract SetPrice getSetPriceObject();
	public abstract ReadyMsg getReadyMsgObject();
	public abstract SetInitialValues getSetInitialValuesObject();
	public abstract PumpGasUnit getPumpGasUnitObject();
	public abstract GasPumpedMsg getGasPumpedMsgObject();
	public abstract StopMsg getStopMsgObject();
	public abstract PrintReceipt getPrintReceiptObject();
	public abstract CancelMsg getCancelMsgObject();
}
