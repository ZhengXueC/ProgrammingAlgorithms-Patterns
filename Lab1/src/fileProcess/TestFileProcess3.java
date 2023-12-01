package fileProcess;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//using array of object
//advantage:you can use array of object with different data types
//Inconvenient:size must be known
public class TestFileProcess3 {

	public static void main(String[] args) throws FileNotFoundException {
		// populate the array of object myDivideArr
		//from input data file divide.in
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		Divide[] myDivideArr=new Divide[4];
		int index=0;
		while(inFile.hasNextLine()) {
			myDivideArr[index]= new Divide();
			double x = inFile.nextDouble();
			double y= inFile.nextDouble();
			//myDivideArr[index]= new Divide(x,y);
			myDivideArr[index].setX(x);
			myDivideArr[index].setY(y);
			//System.out.println(myDivideArr[index] +" "+ myDivideArr[index].doDivide());
			index++;
		}
		System.out.println("printing the array of objects:");
		for(int i=0;i<myDivideArr.length;i++) {
			
			System.out.println(myDivideArr[i] +" Division is "+ myDivideArr[i].doDivide());
		}
		
	}

}
