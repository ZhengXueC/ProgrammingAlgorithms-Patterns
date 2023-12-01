package ArrayListBilling;

import java.math.BigDecimal;

public class Billing {
	private double prd_Price;
	private int prd_Qty;
	public static double Fed_Tax=0;
	public static double Prv_Tax=0;
	
	public Billing() {}
	
	public Billing(double prd_Price, int prd_Qty) {
		super();
		this.prd_Price = prd_Price;
		this.prd_Qty = prd_Qty;
	}



	public double getPrd_Price() {
		return prd_Price;
	}



	public void setPrd_Price(double prd_Price) {
		this.prd_Price = prd_Price;
	}



	public int getPrd_Qty() {
		return prd_Qty;
	}



	public void setPrd_Qty(int prd_Qty) {
		this.prd_Qty = prd_Qty;
	}



	public static double getFed_Tax() {
		return Fed_Tax;
	}



	public static void setFed_Tax(double fed_Tax) {
		Fed_Tax = fed_Tax;
	}



	public static double getPrv_Tax() {
		return Prv_Tax;
	}



	public static void setPrv_Tax(double prv_Tax) {
		Prv_Tax = prv_Tax;
	}



	@Override
	public String toString() {
		return "Billing [prd_Price=" + prd_Price + ", prd_Qty=" + prd_Qty + "]";
	}



	public String CalculateBilling(){
		double T_Billing = (prd_Price* prd_Qty) + (prd_Price*prd_Qty)* Fed_Tax + (prd_Price*prd_Qty)* Prv_Tax;
		BigDecimal roundedT_Billing = BigDecimal.valueOf(T_Billing).setScale(2, BigDecimal.ROUND_HALF_UP);
	    return roundedT_Billing.toString();
		
	}
}
