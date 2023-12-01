package fileProcess;
import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

//with array
//implementing parallel arrays x and y
//advantage: you can apply processing algorithm outside while loop and you can pick any portion of data for further processing
//inconvenient:size of arrays must be known
public class TestFileProcess2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		double [] x = new double[4]; //first array storing the first column
		double [] y = new double[4]; //second parallel  array storing the second column
		int index=0;
		//loading data into parallel arrays
		while(inFile.hasNextLine())
		{
			x[index] = inFile.nextDouble();
			y[index]= inFile.nextDouble();
			
			//Printing data file
			System.out.println("x= "+ x[index] +",y = "+y[index]+",Division is "+x[index]/y[index]);
			index++;
		}
		//further processing of arrays x and y
//		for(int i =0;i<x.length;i++) {
//			System.out.println("x= "+ x[index] +",y = "+y[index]+",Division is "+x[index]/y[index]);
//		}

	}

}
