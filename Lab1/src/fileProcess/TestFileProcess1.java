package fileProcess;
import java.io.*;
//import java.io.FileReader;
import new1.File;
import java.util.Scanner;

//Without Array
//inconvenient cannot use processing algorithms like search
//outside loop
public class TestFileProcess1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		double x,y;
		
		while(inFile.hasNextLine())
		{
			x = inFile.nextDouble();
			y = inFile.nextDouble();
			//Printing data file
			System.out.println("x= "+ x +",y = "+y+",Division is "+x/y);
		}
		//File file = new File("divide.in.txt");
		inFile.close();

	}

}
