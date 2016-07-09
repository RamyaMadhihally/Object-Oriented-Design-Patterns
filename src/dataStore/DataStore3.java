package dataStore;
//datastore for gaspump3
public class DataStore3 extends DataStore {
	private float price;
	private  int w;
	private  int L;
	private float temp_cash;
	private float cash;
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public float getTemp_cash() {
		return temp_cash;
	}
	public void setTemp_cash(float temp_cash) {
		this.temp_cash = temp_cash;
	}
	public float getTemp_rPrice() {
		return temp_rPrice;
	}
	public void setTemp_rPrice(float temp_rPrice) {
		this.temp_rPrice = temp_rPrice;
	}
	public float getTemp_pPrice() {
		return temp_pPrice;
	}
	public void setTemp_pPrice(float temp_pPrice) {
		this.temp_pPrice = temp_pPrice;
	}
	public int getTemp_g() {
		return temp_g;
	}
	public void setTemp_g(int temp_g) {
		this.temp_g = temp_g;
	}
	private  float total;
	private float temp_rPrice;
	private float temp_pPrice;
	private int temp_g;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
