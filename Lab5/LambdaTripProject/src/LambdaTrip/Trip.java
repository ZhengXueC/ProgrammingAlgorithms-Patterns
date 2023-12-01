package LambdaTrip;

import java.util.Objects;

public class Trip {
	int emp_id;
	String emp_name;
	String emp_address;
	double emp_gasprice;
	int emp_distance;
	double emp_costhotel;
	double emp_costfood;
	public Trip() {
		
		this.emp_id = 0;
		this.emp_name = "";
		this.emp_address = "";
		this.emp_gasprice = 0.0;
		this.emp_distance = 0;
		this.emp_costhotel = 0.0;
		this.emp_costfood = 0.0;
	}
	
	public Trip(int emp_id, String emp_name, String emp_address, double emp_gasprice, int emp_distance,
			double emp_costhotel, double emp_costfood) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_address = emp_address;
		this.emp_gasprice = emp_gasprice;
		this.emp_distance = emp_distance;
		this.emp_costhotel = emp_costhotel;
		this.emp_costfood = emp_costfood;
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

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public double getEmp_gasprice() {
		return emp_gasprice;
	}

	public void setEmp_gasprice(double emp_gasprice) {
		this.emp_gasprice = emp_gasprice;
	}

	public int getEmp_distance() {
		return emp_distance;
	}

	public void setEmp_distance(int emp_distance) {
		this.emp_distance = emp_distance;
	}

	public double getEmp_costhotel() {
		return emp_costhotel;
	}

	public void setEmp_costhotel(double emp_costhotel) {
		this.emp_costhotel = emp_costhotel;
	}

	public double getEmp_costfood() {
		return emp_costfood;
	}

	public void setEmp_costfood(double emp_costfood) {
		this.emp_costfood = emp_costfood;
	}
	
	@Override
	public String toString() {
		
		return "Emp Id=" + emp_id + ", Emp Name=" + emp_name + ", Emp Add=" + emp_address + ", gas_price="
		+ emp_gasprice + ", distance=" + emp_distance + ", cost_hotel=" + emp_costhotel
		+ ", cost_food=" + emp_costfood  ;
	}

	public double CalculateCostTrip() {
		return(emp_distance*emp_gasprice)+emp_costhotel+emp_costfood;
	}
	public void printCostTrip() {
		System.out.print("Emp Id= "+emp_id +", Emp Name= " +emp_name+ ", Emp Add= "+emp_address +", gas_price = "+emp_gasprice +", distance= "+emp_distance +",cost_hotel= " +emp_costhotel+",cost_food="+emp_costfood);
		System.out.printf(", Total Cost Trip= %.2f$",this.CalculateCostTrip());
		System.out.println();
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Trip other = (Trip) obj;
        return emp_name.equals(other.emp_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_name);
    }
}
