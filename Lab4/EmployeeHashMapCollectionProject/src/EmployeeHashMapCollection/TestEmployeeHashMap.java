package EmployeeHashMapCollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collectionExamples.Car;

public class TestEmployeeHashMap {

	public static void main(String[] args) throws FileNotFoundException{
		Map<Integer,Employee> employeeHashMap = new HashMap<>();
		Scanner inFile=new Scanner(new FileReader("Employee.in"));
		while(inFile.hasNext()) {
			
			String line = inFile.nextLine();
            String[] record = line.split("\t");
			int ID =Integer.parseInt(record[0]);
			String NAME = record[1];
			double SALARY = Double.parseDouble(record[2]);
			Employee e = new Employee();
			e.setEmp_id(ID);
			e.setEmp_name(NAME);
			e.setEmp_salary(SALARY);
			employeeHashMap.put(e.emp_id, e);
		}
		System.out.println("Displaying the components of Employee Hash Map list stored\n");
		System.out.println("The Trip Employee you enterred in the Map are: "+employeeHashMap.size()+"\n");
		System.out.println("Searching for Employee with emp_id entered from console");
		System.out.print("Please enter Employee Id: ");
		Scanner input=new Scanner(System.in);
		int enter = input.nextInt();
		if(employeeHashMap.containsKey(enter)) {
			System.out.println(employeeHashMap.get(enter));
		}
		else {
			System.out.println("Element not found");
		}
		System.out.println("Keys in the HashMap:");
        for (Integer empId : employeeHashMap.keySet()) {
            System.out.println(empId);
        }
        System.out.println("Here are the records of Employee Information in the HashMap: ");
        Collection<Employee> empValues = employeeHashMap.values();
        for (Employee empelem: empValues) {
            System.out.println(empelem);
        }
	}

}
