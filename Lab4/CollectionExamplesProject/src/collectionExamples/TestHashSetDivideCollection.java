package collectionExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestHashSetDivideCollection {

	public static void main(String[] args) throws FileNotFoundException {
		//Read from input file divide.in and populate it into HashSet of Divide class type divideInfileSet
		//print all elements of HashSet
		Set<Divide> divideInfileSet = new HashSet<Divide>();
//		Scanner inFile = new Scanner(new FileReader("divide.in"));
//		while(inFile.hasNextLine()) {
//			
//			double x = inFile.nextDouble();
//			double y= inFile.nextDouble();
//			Divide d=new Divide();
//			d.setX(x);
//			d.setY(y);
//			divideInfileSet.add(d);
//	}
//		inFile.close();
		Divide e=new Divide(89,6);
		
		divideInfileSet.add(e);
		Divide dvdObj=new Divide();
		dvdObj.setX(89);
		dvdObj.setY(6);
		divideInfileSet.add(dvdObj);
	
		
		for(Divide d:divideInfileSet) {
			System.out.println(d);
		}
		Divide div=new Divide();
		//boolean divFound=divideInfileSet.contains(45,6);
		System.out.println("Hash code of "+divideInfileSet.hashCode());
		System.out.println(e.hashCode()+" "+dvdObj.hashCode());
	}
}
