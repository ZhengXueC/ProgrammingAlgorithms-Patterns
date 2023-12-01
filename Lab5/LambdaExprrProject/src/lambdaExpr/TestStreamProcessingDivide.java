package lambdaExpr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestStreamProcessingDivide {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		Set <Divide> divideInfileSet= new HashSet<Divide>(); 
		while(inFile.hasNext()) {
			double x = inFile.nextDouble();
			double y= inFile.nextDouble();
			Divide d=new Divide();
			d.setX(x);
			d.setY(y);
			divideInfileSet.add(d);
		}
	
		inFile.close();
		
		System.out.println("Print with respect to calculateDivision()");
		
		//use stream Processing
		//using stream processing filter method where calculateDivision() in the hashset
		//whose total calculateDivision()>20
		
		divideInfileSet.forEach(n->{System.out.println(n.toString());});
		System.out.println("\nPrint Divide HashSet collection using Lambda Expression with respect to calculateDivision");
		divideInfileSet.forEach(n->{n.CalDivide();});
		divideInfileSet.forEach(Divide::calculateDivision);
		
		divideInfileSet.stream().forEach(System.out::println);
		divideInfileSet.stream().forEach(n->n.CalDivide());
		
		System.out.println("filter method where calculateDivision() in the Hashset whose tatal culculatedivision() >20(two records)");
		System.out.println(divideInfileSet.stream().filter(n->(n.calculateDivision2()>20)).count());
		
		
		
		System.out.println(" Sorted by first column x version1");
		divideInfileSet.stream().sorted((e1,e2) -> Double.compare(e1.getX(),e2.getX()))
		.forEach(e->System.out.println("x "+e.getX()));

		divideInfileSet.stream().sorted((e1,e2) -> Double.compare(e1.getX(),e2.getX()))
		.forEach(e->System.out.println(e));
		
		
		System.out.println("Sorted by first column x version2");
		divideInfileSet.stream().sorted(Comparator.comparingDouble(Divide::getX))
		.forEach(e->System.out.println("x "+e.getX()));
		
		divideInfileSet.stream().sorted(Comparator.comparingDouble(Divide::getX))
			.forEach(System.out::println);
		
		
		System.out.println("Sorted by first column y version1");
		divideInfileSet.stream().sorted((e1,e2) -> Double.compare(e1.getY(),e2.getY())).forEach(e->System.out.println("y "+e.getY()));
		System.out.println("Sorted by first column y version2");
		divideInfileSet.stream().sorted(Comparator.comparingDouble(Divide::getY))
			.forEach(System.out::println);
		
		//divideinfileset sorted by calculatedivision
		System.out.println("Sorted by calculateDivision2()");
		divideInfileSet.stream().sorted((t1,t2)->Double.compare(t1.calculateDivision2(),t1.calculateDivision2()))
		.forEach(t->System.out.println(t.calculateDivision2()));
		
		divideInfileSet.stream().sorted(Comparator.comparingDouble(Divide::calculateDivision2))
		.forEach(System.out::println);
		
		
		
		
		System.out.println("Sorted by max of divideInFileSet with respect to calculateDivision2()");
		divideInfileSet.stream().max((t1,t2)->Double.compare(t1.calculateDivision2(),t1.calculateDivision2()))
		.ifPresent(t->System.out.println(t.calculateDivision2()));
		
		System.out.println("max of divideInFileSet with respect to calculateDivision2()"+
		divideInfileSet.stream().max(Comparator.comparingDouble(Divide::calculateDivision2)));
		
		
		
		System.out.println("Sorted by max of divideInFileSet with respect to calculateDivision2()version2"+
		divideInfileSet.stream().max(Comparator.comparingDouble(Divide::calculateDivision2)).get()+"max is : "+
		divideInfileSet.stream().max(Comparator.comparingDouble(Divide::calculateDivision2)).get().calculateDivision2());
		
		System.out.println("Sorted by min of divideInFileSet with respect to calculateDivision2()version2"+
				divideInfileSet.stream().min(Comparator.comparingDouble(Divide::calculateDivision2)).get()+"min is : "+
				divideInfileSet.stream().min(Comparator.comparingDouble(Divide::calculateDivision2)).get().calculateDivision2());
	}

}
