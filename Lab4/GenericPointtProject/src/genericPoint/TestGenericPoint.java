package genericPoint;

public class TestGenericPoint {

	public static void main(String[] args) {
		
		//since java 10 var x=0;
		Point <String> pointStr = new Point <>("Anna", "Banana");
		System.out.println(pointStr);
		
		Point <Number> pie = new Point <>(3.14, 2.71);
		System.out.println(pie);
		
		//Testing printArray
//		Integer[] x= {2,4,9,10};
//		String[] strName = {"Khan","Robertson","Lee","Su"};
//		
//		//Point <Integer> myInt = new Point <>(3, 2);
//		
//		pointStr.printArray(x);//Generic parameter of type Integer
//		pointStr.printArray(strName);//Generic parameter of type String
//		
//		pointStr.printArray2(10,20);
//		pointStr.printArray2(30,40,50);
//		pointStr.printArray2("Jan","Feb","Mar","Apr");
	}

}
