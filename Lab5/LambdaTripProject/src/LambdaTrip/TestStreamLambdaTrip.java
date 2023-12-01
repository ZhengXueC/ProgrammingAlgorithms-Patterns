package LambdaTrip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import lambdaExpr.Divide;

public class TestStreamLambdaTrip {

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
		System.out.println("Using Stream Processing filter Method");
		System.out.println("Number of Employees in the HashSet whose Total Trip Cost > 400$ is: "+tripInfileSet.stream().filter( n ->n.CalculateCostTrip()>400).count());
		
		System.out.println("\nUsing Stream Processing sorted Method");
		System.out.println("Display Employees in the HashSet sorted by Emp_id:");
		tripInfileSet.stream().sorted(Comparator.comparingDouble(Trip::getEmp_id)).forEach(System.out::println);
		
		System.out.println("\nUsing Stream Processing sorted Method");
		System.out.println("Display Employees in the HashSet sorted by CalculateCostTrip:");
		tripInfileSet.stream().sorted(Comparator.comparingDouble(Trip::CalculateCostTrip)).forEach(System.out::println);
		
		System.out.println("\nUsing Stream Processing max Method");
		System.out.println("Display Max Cost Trip of Employee in the HashSet:");
		System.out.println(tripInfileSet.stream().max(Comparator.comparingDouble(Trip::CalculateCostTrip)).get());
		System.out.println("Cost Trip: "+tripInfileSet.stream().max(Comparator.comparingDouble(Trip::CalculateCostTrip)).get().CalculateCostTrip());
		
		System.out.println("\nUsing Stream Processing min Method");
		System.out.println("Display Max Cost Trip of Employee in the HashSet:");
		System.out.println(tripInfileSet.stream().min(Comparator.comparingDouble(Trip::CalculateCostTrip)).get());
		System.out.println("Cost Trip: "+tripInfileSet.stream().min(Comparator.comparingDouble(Trip::CalculateCostTrip)).get().CalculateCostTrip());
		
		System.out.println("\nUsing Stream Processing anyMatch Method");
		System.out.println("Display if Employee Trip info matching emp_name Eduard is in the HashSet:"+tripInfileSet.stream()
		.anyMatch(e -> e.emp_name.contains("Eduard")));
		System.out.println("\nDisplay all Employee Trip info matching emp_name Paul in the HashSet:");
		tripInfileSet.stream().filter(employee -> employee.emp_name.contains("Paul"))
        .forEach(System.out::println);
		
		
	}

}
