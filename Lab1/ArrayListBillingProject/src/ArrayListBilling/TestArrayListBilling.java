package ArrayListBilling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestArrayListBilling {

	public static void main(String[] args) throws FileNotFoundException {
		List<Billing> billingArrList = new ArrayList<>();
		Scanner inFile = new Scanner(new FileReader("Billing.in"));
		double sum=0;
		while(inFile.hasNextLine()) {
			double P = inFile.nextDouble();
			int Q= inFile.nextInt();
			double F = inFile.nextDouble();
			double Pro = inFile.nextDouble();
			Billing b= new Billing();
			b.setPrd_Price(P);
			b.setPrd_Qty(Q);
			b.setFed_Tax(F);
			b.setPrv_Tax(Pro);
			billingArrList.add(b);
		}
		System.out.println("Reading from Billing.in Input file:");
		System.out.println("Printing ArrayList bilingArrlist and perform processing");
		System.out.println();
		for(int i=0;i<billingArrList.size();i++) {
			System.out.println("bilingArrList["+i+"] Object: Billing [prd_Price="+billingArrList.get(i).getPrd_Price()+", prd_Qty="+billingArrList.get(i).getPrd_Qty()+"]");
			System.out.println("\t The Total of Billing of bilingArrList["+i+"] object is "+billingArrList.get(i).CalculateBilling()+"$");
			System.out.println();
			double result=Double.parseDouble(billingArrList.get(i).CalculateBilling());
			sum+=result;
			
		}
		System.out.println("All Total of Billing is "+sum+"$");
		System.out.println("Thank you for Doing Business With Us");
	}

}
