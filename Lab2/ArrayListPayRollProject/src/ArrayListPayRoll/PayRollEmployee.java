package ArrayListPayRoll;
/**
 * 
 * 
 * 
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PayRollEmployee {
	private int emp_id;
	private String emp_name;
	private String emp_ssn;
	private int number_whr;
	private double h_rate;
	public static double Fed_Tax=0.07;
	public static double Prv_Tax=0.09;
	public static double QP_Ins=0.0055;
	public static double E_ins=0.014;
	public static double Qpp=0.045;
	public static double Union_d=0.0165;
	public PayRollEmployee() {}
	public PayRollEmployee(int emp_id, String emp_name, String emp_ssn, int number_whr, double h_rate) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_ssn = emp_ssn;
		this.number_whr = number_whr;
		this.h_rate = h_rate;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_ssn() {
		return emp_ssn;
	}
	public void setEmp_ssn(String emp_ssn) {
		this.emp_ssn = emp_ssn;
	}
	public int getNumber_whr() {
		return number_whr;
	}
	public void setNumber_whr(int number_whr) {
		this.number_whr = number_whr;
	}
	public double getH_rate() {
		return h_rate;
	}
	public void setH_rate(double h_rate) {
		this.h_rate = h_rate;
	}
	@Override
	public String toString() {
		return "PayRollEmployee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_ssn=" + emp_ssn + ", number_whr="
				+ number_whr + ", h_rate=" + h_rate + "]";
	}
	public double calculate_TotalIncome() {
		//double TotalIncome=number_whr * h_rate;
		//BigDecimal aa=new BigDecimal(TotalIncome).setScale(2,RoundingMode.HALF_UP);
		//BigDecimal aa = BigDecimal.valueOf(TotalIncome).setScale(2, BigDecimal.ROUND_HALF_UP);
		//return aa.toString();
		//return aa.doubleValue();
		return number_whr * h_rate;
	}
	public double calculate_TotalDeduction() {
		return this.calculate_TotalIncome()*(this.Prv_Tax+this.Fed_Tax+this.QP_Ins+this.E_ins+this.Qpp+this.Union_d);
		
	}
	public double calculate_TotalNetAmount() {
		
		return this.calculate_TotalIncome()-this.calculate_TotalDeduction();
	}

}
