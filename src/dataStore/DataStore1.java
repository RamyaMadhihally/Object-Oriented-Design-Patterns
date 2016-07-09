package dataStore;
//datastore for gaspump1
public class DataStore1 extends DataStore {
	// Temporary variables 
	public  int temp_price;
	public  int temp_cash;
	public  int w;
	public  int G;
	public  int total;
	public  int cash;
	public  int price;
	public int getTemp_price() {
		return temp_price;
	}
	public void setTemp_price(int temp_price) {
		this.temp_price = temp_price;
	}
	public int getTemp_cash() {
		return temp_cash;
	}
	public void setTemp_cash(int temp_cash) {
		this.temp_cash = temp_cash;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getG() {
		return G;
	}
	public void setG(int g) {
		G = g;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
