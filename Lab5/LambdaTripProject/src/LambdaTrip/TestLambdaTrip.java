package LambdaTrip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import lambdaExpr.Divide;

public class TestLambdaTrip {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Trip.in"));
		Set <Trip> tripInfileSet= new HashSet<Trip>(); 
		while(inFile.hasNextLine()) {
			String line= inFile.nextLine();
			String [] record=line.split("\t");
			int ID = Integer.parseInt(record[0]);
			String NAME= record[1];
			String ADDRESS= record[2];
			double GASPRICE = Double.parseDouble(record[3]);
			int DISTANCE = Integer.parseInt(record[4]);
			double COSTHOTEL = Double.parseDouble(record[5]);
			double COSTFOOD = Double.parseDouble(record[6]);
			Trip t=new Trip();
			t.setEmp_address(ADDRESS);
			t.setEmp_costfood(COSTFOOD);
			t.setEmp_costhotel(COSTHOTEL);
			t.setEmp_distance(DISTANCE);
			t.setEmp_gasprice(GASPRICE);
			t.setEmp_id(ID);
			t.setEmp_name(NAME);
			tripInfileSet.add(t);
		}
		inFile.close();
		System.out.println("The Employee Trip information you entered are: "+tripInfileSet.size()+"\n");
		System.out.println("The Employee Trip information using Lambda Expression");
		tripInfileSet.forEach(n ->{System.out.println(n);});
		System.out.println("\nInvoking printCostTrip method using Lambda Expression");
		tripInfileSet.forEach(n->lambda_printCostTrip(n));
		System.out.println("\nInvoking printCostTrip method using :: operatro within foreach");
		tripInfileSet.forEach(Trip::printCostTrip);
		System.out.println("\nApplying discount Function to Trip set using Lambda Expression:");
		Function <Double,Double>  tripDiscount = n->{return (n*0.9);};
		tripInfileSet.forEach(n->{System.out.print("Cost trip after Discount for "+n.getEmp_id()+", "+n.getEmp_name());System.out.printf(" is: %.2f$",tripDiscount.apply(n.CalculateCostTrip()));System.out.println();});
		System.out.println("\nApplying tripAdvanceFee Function to Trip set using \n\"andThen\" method with Lambda Expression after tripDiscount:");

		Function<Double,Double> tripAdvanceFee = tripDiscount.andThen(n -> {return (n*0.3);});
		tripInfileSet.forEach(n->{System.out.print("Cost trip after Discount for "+n.getEmp_id()+", "+n.getEmp_name());System.out.printf(" is: %.2f$",tripAdvanceFee.apply(n.CalculateCostTrip()));System.out.println();});
		Consumer<Trip> totaltripCostMethod=n-> {n.printCostTrip();};
		//Consumer<Trip> divMethod2=Trip::printCostTrip;
		System.out.println("\nUsing Comsumer Funcitonal interface");
		Trip t=new Trip(2,"Amine Khan", "Paris France", 1.11, 50, 75.00, 50.00);
		totaltripCostMethod.accept(t);
	}
	public static void lambda_printCostTrip(Trip tripObj) {
		tripObj.printCostTrip();
	}
}
