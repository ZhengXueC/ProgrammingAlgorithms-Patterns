package CollectionTrip;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class TestHashSetCollectionTrip {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Trip.in"));
		
		Set<Trip> tripInfileSet = new HashSet<>();
		while(inFile.hasNextLine()) {
			String line=inFile.nextLine();
			String[] record= line.split("\t");
			int ID = Integer.parseInt(record[0]);
			String NAME = record[1];
			String ADDRESS = record[2];;
			double GASPRICE = Double.parseDouble(record[3]);
			int DISTANCE = Integer.parseInt(record[4]);
			double COSTHOTEL = Double.parseDouble(record[5]);
			double COSTFOOD = Double.parseDouble(record[6]);
			Trip t=new Trip();
			t.setEmp_id(ID);
			t.setEmp_name(NAME);
			t.setEmp_address(ADDRESS);
			t.setEmp_gasprice(GASPRICE);
			t.setEmp_distance(DISTANCE);
			t.setEmp_costhotel(COSTHOTEL);
			t.setEmp_costfood(COSTFOOD);
			tripInfileSet.add(t);
		}
		System.out.println("The Employee Trip information you entered are: "+tripInfileSet.size()+"\n");
		for(Trip tElem:tripInfileSet) {
			System.out.printf(tElem.toString());
			System.out.printf(",Total Cost = %.2f",tElem.CalculateCostTrip());
			System.out.println();
		}
		System.out.println("\nPrinting all elements using Iterator:\n");
        Iterator <Trip> iterator = tripInfileSet.iterator();
        while (iterator.hasNext()) {
        	Trip iterElem=iterator.next();
            System.out.printf(iterElem.toString());
            System.out.printf(",Total Cost = %.2f",iterElem.CalculateCostTrip());
			System.out.println();
        }
        Trip wrecord = new Trip(2,"Amine Khan", "Paris France", 1.11, 50, 75.00, 50.00);
        tripInfileSet.add(wrecord);
        System.out.println("\nAfter adding new Client, the List :\n");
        for(Trip tElem:tripInfileSet) {
			System.out.printf(tElem.toString());
			System.out.printf(",Total Cost = %.2f",tElem.CalculateCostTrip());
			System.out.println();
		}
        Scanner inFile1 = new Scanner(new FileReader("Trip.in"));
        Set<Trip> tripInfileSet1 = new LinkedHashSet<>();
		while(inFile1.hasNextLine()) {
			String line=inFile1.nextLine();
			String[] record= line.split("\t");
			int ID = Integer.parseInt(record[0]);
			String NAME = record[1];
			String ADDRESS = record[2];;
			double GASPRICE = Double.parseDouble(record[3]);
			int DISTANCE = Integer.parseInt(record[4]);
			double COSTHOTEL = Double.parseDouble(record[5]);
			double COSTFOOD = Double.parseDouble(record[6]);
			Trip t=new Trip();
			t.setEmp_id(ID);
			t.setEmp_name(NAME);
			t.setEmp_address(ADDRESS);
			t.setEmp_gasprice(GASPRICE);
			t.setEmp_distance(DISTANCE);
			t.setEmp_costhotel(COSTHOTEL);
			t.setEmp_costfood(COSTFOOD);
			tripInfileSet1.add(t);
		}
		System.out.println("\nThe Trip Employee information added to the LinkedHashSet(Notice it keeps the order found in the input file, the LinkedHashSet is:\n");
		for(Trip tElem:tripInfileSet1) {
			System.out.printf(tElem.toString());
			System.out.printf(",Total Cost = %.2f",tElem.CalculateCostTrip());
			System.out.println();
		}
	}

}
