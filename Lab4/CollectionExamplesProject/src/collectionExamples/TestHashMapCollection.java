package collectionExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMapCollection {

	public static void main(String[] args) {
		//using  HashMap system-defined collection from JCF
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
		
		System.out.println("Searching by vin of car");
		Car carFound=carHashMap.get(car3.getVin());
		if(carFound!=null) {
			System.out.println("car found"+carFound);
		}
		System.out.println("Display all keys of Map collection ");
		Set<String> carKeys=carHashMap.keySet();
		
		for(String carKeyElem:carKeys) {
			System.out.println(carKeyElem);
		}
		System.out.println("Display all car values of Map Collection");
		Collection<Car> carValues = carHashMap.values();
		for(Car carvalueElem:carValues) {
			System.out.println(carvalueElem);
		}
		
	}

}
