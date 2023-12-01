package lambdaExpr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdaExpressionConsumerMethod {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(5);
		numberList.add(-9);
		numberList.add(3);
		System.out.println("Printing set collection using Lambda Expression");
		numberList.forEach(n ->{System.out.println(n);});
		
		System.out.println("Invoke method");
		Consumer<Integer> methodToDouble = n -> System.out.println(n*2);
		numberList.forEach(methodToDouble);
		
		System.out.println("Invoke complex method");
		Consumer<Integer> fullmethod = n -> {int x=2;System.out.println(n*2+x);};
		numberList.forEach(fullmethod);
		
		System.out.println("Invoke complex method providing clear coding and using single testing with accept()method");
		//fullMethod =n ->{int x=2;double y ; double z=x+y;System.out.println(n*2+x);};
		fullmethod =n -> invokefullMethod(n);// n is actual parameter
		fullmethod.accept(10);
		
		System.out.println("Invoke complex method providing clear coding for all ArrayList elememts");
		numberList.forEach(fullmethod);
		
		//calculate number of elements higher or equal to 5 (numberList={10,15,5,-9,3})
		//for loop and if and count
		int count=0;
		for(Integer inEle:numberList) {
			if (inEle>=5) {count++;}
		}
		System.out.println("number of elements higher or equal to 5 is "+count);
	}
	
	
	public static void invokefullMethod(int num) {//formal parameter
		int x=2;
		double y = x-6;
		System.out.println(num*2+x*y);
	}
}
