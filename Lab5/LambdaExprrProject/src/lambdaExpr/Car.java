package lambdaExpr;

public class Car {

	private String vin;
	private String des;
	private double price;
	public Car() {
		this.vin = "";
		this.des = "";
		this.price = 0.0;
	}
	public Car(String vin, String des, double price) {
		super();
		this.vin = vin;
		this.des = des;
		this.price = price;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  vin + "//" + des + "//" + price ;
	}
	
	
}
