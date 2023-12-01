package ArrayListPayRoll;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestArrayListPayRoll {

	public static void main(String[] args) throws FileNotFoundException {
		List<PayRollEmployee> payrollArrList = new ArrayList<>();
		Scanner inFile = new Scanner(new FileReader("payroll.in"));
		while(inFile.hasNextLine()) {
			int emp_id=inFile.nextInt();
			String emp_name=inFile.next();
			String emp_ssn=inFile.next();
			int number_whr=inFile.nextInt();
			double h_rate=inFile.nextDouble();
			PayRollEmployee p= new PayRollEmployee(emp_id,emp_name,emp_ssn,number_whr,h_rate);
			payrollArrList.add(p);
		}
		System.out.println("Reading from Payroll.in Input file:");
		System.out.println("Printing ArrayList payRollArrlist and perform processing");
		double TotalIncome=0,TotalNet=0,TotalDeduction=0;
		for(int i=0;i<payrollArrList.size();i++) {
			
			TotalIncome+=payrollArrList.get(i).calculate_TotalIncome();	
			TotalNet+=payrollArrList.get(i).calculate_TotalNetAmount();
			TotalDeduction+=payrollArrList.get(i).calculate_TotalDeduction();
			
		System.out.println();
		System.out.println("payRollArrList["+i+"] Object: "+payrollArrList.toString());
		
		
		BigDecimal aa = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalIncome()).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("\t The Total Earning is "+aa.toString()+"$");
		System.out.println();
		System.out.println("\t The Fed_Tax Deduction is "+payrollArrList.get(i).calculate_TotalIncome()*0.07+"$");
		System.out.println("\t The Prv_Tax Deduction is "+payrollArrList.get(i).calculate_TotalIncome()*0.09+"$");
		BigDecimal bb = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalIncome()*0.0055).setScale(2, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("\t The QP_Ins Deduction is "+bb.toString()+"$");
		BigDecimal cc = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalIncome()*0.014).setScale(2, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("\t The E_ins Deduction is "+cc.toString()+"$");
		System.out.println("\t The Qpp Deduction is "+payrollArrList.get(i).calculate_TotalIncome()*0.045+"$");
		
		BigDecimal dd = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalIncome()*0.0165).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("\t The Union_d Deduction is "+dd.toString()+"$");
		
		BigDecimal ff = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalDeduction()).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("\t The Total Deduction is "+ff.toString()+"$");
		System.out.println();
		System.out.println();
		BigDecimal gg = BigDecimal.valueOf(payrollArrList.get(i).calculate_TotalNetAmount()).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("\t The Total Net Amount is "+gg.toString()+"$");
		System.out.println();
		}
		
		System.out.printf("All Employee Total Income Amount is %.2f$\n",TotalIncome);
		System.out.printf("All Employee Total Income Amount is %.2f$\n",TotalNet);
		System.out.printf("All Employee Total Income Amount is %.2f$\n",TotalDeduction);
		
	}

}
