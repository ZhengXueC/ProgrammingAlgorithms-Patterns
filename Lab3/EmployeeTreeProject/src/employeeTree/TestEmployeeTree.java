package employeeTree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;




public class TestEmployeeTree {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Employee.in"));
		
		BinaryEmployeeTreeClass myTree = new BinaryEmployeeTreeClass();
		
		while(inFile.hasNextLine()) {
			
			int ID = inFile.nextInt();
			String NAME = inFile.next()+" "+inFile.next();
			double salary = inFile.nextDouble();
			Employee e = new Employee();
			e.setEmp_id(ID);
			e.setEmp_name(NAME);
			e.setEmp_salary(salary);
			
			myTree.put(e);
			
		}
		
		myTree.InOrderTraversal();
		

	}

}
