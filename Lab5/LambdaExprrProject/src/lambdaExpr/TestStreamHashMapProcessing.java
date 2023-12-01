package lambdaExpr;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;



public class TestStreamHashMapProcessing {

	public static void main(String[] args) {
		Map<String,Car> carHashMap = new HashMap<>();

		//if database table is used, the purpose is to populate carHashMap
		//search using vin pk and generate reports of values[desc,price]
		Car car1 = new Car("K1245","Ford",35000);
		Car car2 = new Car("M198754","Honda",40000);
		Car car3 = new Car("M98524M4","Hyundai",25000);
		Car car4 = new Car("S741582","Nissan",30000);

		carHashMap.put(car1.getVin(), car1);
		carHashMap.put(car2.getVin(), car2);
		carHashMap.put(car3.getVin(), car3);
		carHashMap.put(car4.getVin(), car4);
		
		System.out.println("Prints all keys of carHashMap using Lambda expression");
		carHashMap.forEach((k,v)->System.out.println(k));
		
		System.out.println("Prints all keys of carHashMap using Lambda expression");
		carHashMap.forEach((k,v)->System.out.println(v));
		
		System.out.println("Prints all keys sorted of carHashMap");
		carHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("Prints all value sorted by  (car.desc)of carHashMap");
		carHashMap.entrySet().stream().sorted(Map.Entry
				.comparingByValue(Comparator.comparing(Car::getDes))).forEach(System.out::println);
		
		System.out.println("Prints all value sorted by  (car.price)of carHashMap");
		carHashMap.entrySet().stream().sorted(Map.Entry
				.comparingByValue(Comparator.comparingDouble(Car::getPrice))).forEach(System.out::println);
		
		//half references to method that returns double
		Function<Double,Double> half = n ->{return n/2.0;};
		//Function<Car,Double> half = n ->{return n.getPrice()/2.0;};
		
		System.out.println("Apply half to every Elem of carHashMap");
		
		carHashMap.forEach((k,v)->useHalf(v.getPrice(),half));
		
		
	}
	public static void useHalf(double num, Function<Double,Double> halfMethodPar) {
		double halfRes = halfMethodPar.apply(num).doubleValue();
		System.out.println(halfRes);
	}
}
