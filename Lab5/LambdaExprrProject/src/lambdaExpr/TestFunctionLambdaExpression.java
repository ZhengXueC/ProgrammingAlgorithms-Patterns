package lambdaExpr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestFunctionLambdaExpression {

	public static void main(String[] args) {
		
		
		//half references to method that returns double
		Function<Integer,Double> half = n -> {return n/2.0;};
		double ans = half.apply(10);
		System.out.println("half of ans is "+ans);
		
		Function<Integer,Double> half2 = half.andThen(b -> b*3);
		System.out.println("Testing andThen() funcitonal method: "+half2.apply(10));
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);  //10, half(10)
		numberList.add(15);
		numberList.add(5);
		numberList.add(-9);
		numberList.add(3);
		System.out.println("Apply half function for each elemtn  of Arraylist numberlist");
		numberList.forEach(n->useHalf(n,half));
		
		System.out.println("Apply half2 function for each elemtn  of Arraylist numberlist");
		numberList.forEach(n->useHalf(n,half2));
		
	}
	//useHalf must include formal parameter of type Function<Integer,Double>
	public static void useHalf(int num, Function<Integer,Double> halfMethodPar) {
		double halfRes = halfMethodPar.apply(num).doubleValue();
		System.out.println(halfRes);
	}

}
