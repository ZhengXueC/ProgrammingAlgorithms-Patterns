package lambdaExpr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import collectionExamples.Divide;

public class TestLambdaExpressionDivideCollection {

	public static void main(String[] args) throws FileNotFoundException {
		//Consumer
		//funciton
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
		System.out.println("\nPrinting divideInfileSet using Lambda Expression");
		divideInfileSet.forEach(n ->{System.out.println(n);});
		System.out.println("Printing divideInfileSet using reference method");
		divideInfileSet.forEach(System.out::println);
		System.out.println("\nDefine divMehtod of type Consumer");
		Consumer<Divide> divMethod = n -> {System.out.println(n.getX()/n.getY());};
		System.out.println("\nUsing Consumer to test each element of divideInfileSet");
		divideInfileSet.forEach(divMethod);
		Divide d2=new Divide(10,5);
		System.out.println("\nUsing Consumer to test single input using accept()");
		divMethod.accept(d2);
		
		System.out.println("\nDefine divMethod2 of type consumer");
		Consumer<Divide> divMethod2=Divide::CalDivide;
		divMethod.accept(d2);
		divideInfileSet.forEach(divMethod2);
		
		//Consumer <Divide> divMethod2 = Divide::calculateDivision;
		//divideInfileSet.forEach(divMethod2);
		
		
		System.out.println("\nDefine divMethod3 of type Function");
		Function <Divide,Double>  divMethod3 = n ->{return ((n.getX()+n.getY())*3)/((n.getX()+n.getY())-2);};
		System.out.println(" \nTesting divMethod3 to test each element of divideInfileSet ");
		divideInfileSet.forEach(n->useDivMethod3(n,divMethod3));
	}
	public static void useDivMethod3(Divide divObj,Function <Divide,Double> divMethPar) {
		double divRes = divMethPar.apply(divObj).doubleValue();
		System.out.println("Divide Divide [x=" +divObj.getX()+ ", y=" + divObj.getY()+ ",divRes:"+divRes);
	}
}
