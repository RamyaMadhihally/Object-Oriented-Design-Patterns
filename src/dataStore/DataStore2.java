package dataStore;

//datastore for gaspump2
	public class DataStore2 extends DataStore{
		private float temp_Rprice;
		private float temp_Sprice;
		private float Rprice;
		private float Sprice;
		private float price;
		private  int w;
		private  int G;
		private  float total;

		public float getTotal() {
			return total;
		}
		public void setTotal(float total) {
			this.total = total;
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

		public int getCash() {
			return cash;
		}
		public void setCash(int cash) {
			this.cash = cash;
		}
		private  int cash;
		private int temp_g;
		public int getTemp_g() {
			return temp_g;
		}
		public void setTemp_g(int g) {
			this.temp_g = g;
		}

		public float getTemp_Rprice() {
			return temp_Rprice;
		}
		public void setTemp_Rprice(float temp_Rprice) {
			this.temp_Rprice = temp_Rprice;
		}
		public float getTemp_Sprice() {
			return temp_Sprice;
		}
		public void setTemp_Sprice(float temp_Sprice) {
			this.temp_Sprice = temp_Sprice;
		}
		public float getRprice() {
			return Rprice;
		}
		public void setRprice(float rprice) {
			Rprice = rprice;
		}
		public float getSprice() {
			return Sprice;
		}
		public void setSprice(float sprice) {
			Sprice = sprice;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}

		

	}
