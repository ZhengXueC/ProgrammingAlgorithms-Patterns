package lambdaExpr;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestStreamNumberProcessing {

	public static void main(String[] args) {
		List<Double> numberList = new ArrayList<>();
		numberList.add(149.99);
		numberList.add(25.0);
		numberList.add(55.99);
		numberList.add(14.99);
		numberList.add(69.99);
		numberList.add(189.99);
		
		//calculate number of elements higher or equal to 5 (numberList={10,15,5,-9,3})
				//for loop and if and count
				int count=0;
				for(Double doubleEle:numberList) {
					if (doubleEle>=60)
					count++;
				}
				System.out.println("number of elements higher or equal to 60 is:  "+count);
			System.out.println("Using Stream Processing");
			System.out.print("Using Stream Processing with method filter(): ");
			System.out.println(numberList.stream().filter(e -> e>60).count());
			numberList.stream().sorted().forEach(System.out::println);
			
			//BLOCK1
			int comp = Double.compare(9, 9);
			System.out.println("Comparsion: "+comp);
			System.out.println("Using Stream Processing with method max()");
			System.out.println(numberList.stream().max(Double::compare).get());
			System.out.println("Using Stream Processing with method min()");
			System.out.println(numberList.stream().min(Double::compare).get());
			
			System.out.println("Using stream Processing with method reverseOrder(): ");
			numberList.stream().sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

}
