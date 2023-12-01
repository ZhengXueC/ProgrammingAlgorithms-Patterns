package gradeproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;


public class TestGradeProject {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Grade.in"));
		Grade[] gradeArr=new Grade[6];
		int[] SIDArr = new int[6];
		String[] LNArr = new String[6];
		String[] FNArr = new String[6];
		double[][] GradeArr = new double[6][5];
		int index=0,i=0;
		double result=0,sum=0;
		while(inFile.hasNextLine()) {
			gradeArr[index]= new Grade();
			int SID1=inFile.nextInt();
			String SLN1=inFile.next();
			String SFN1=inFile.next();
			double ASS11 = inFile.nextDouble();
			double ASS21 = inFile.nextDouble();
			double ASS31 = inFile.nextDouble();
			double MT1 = inFile.nextDouble();
			double FT1 = inFile.nextDouble();
			
			gradeArr[index].setStudent_id(SID1);
			gradeArr[index].setStudent_lname(SLN1);
			gradeArr[index].setSutdent_fname(SFN1);
			gradeArr[index].setS_grade_Assignment1(ASS11);
			gradeArr[index].setS_grade_Assignment2(ASS21);
			gradeArr[index].setS_grade_Assignment3(ASS31);
			gradeArr[index].setS_grade_Mid_Term(MT1);
			gradeArr[index].setS_grade_Final_Term(FT1);
			index++;
		}
		Scanner inFile1 = new Scanner(new FileReader("Grade.in"));
		while(inFile1.hasNextLine()) {
			
			int SID=inFile1.nextInt();
			String SLN=inFile1.next();
			String SFN=inFile1.next();
			double ASS1 = inFile1.nextDouble();
			double ASS2 = inFile1.nextDouble();
			double ASS3 = inFile1.nextDouble();
			double MT = inFile1.nextDouble();
			double FT = inFile1.nextDouble();
			SIDArr[i] = SID;
			LNArr[i] = SLN;
			FNArr[i] = SFN;
			GradeArr[i][0]= ASS1;
			GradeArr[i][1]= ASS2;
			GradeArr[i][2]= ASS3;
			GradeArr[i][3]= MT;
			GradeArr[i][4]= FT;
		
			i++;
			
		}
//		for(int i=0;i<gradeArr.length;i++) {
//			
//			System.out.println(i+1+") s_id: "+gradeArr[i].getStudent_id()+", Stdent Last Name: "+gradeArr[i].getStudent_lname()+", Student First Name: "+gradeArr[i].getSutdent_fname() );
//			System.out.println();
//			System.out.println("  Assignment 1 : "+Math.round(gradeArr[i].getS_grade_Assignment1()));
//			System.out.println("  Assignment 2 : "+Math.round(gradeArr[i].getS_grade_Assignment2()));
//			System.out.println("  Assignment 3 : "+Math.round(gradeArr[i].getS_grade_Assignment3()));
//			System.out.println("  Mid Term Exam : "+Math.round(gradeArr[i].getS_grade_Mid_Term()));
//			System.out.println("  Final Exam : "+Math.round(gradeArr[i].getS_grade_Final_Term()));
//			System.out.println();
//			System.out.println("  The Average score for this Student is "+gradeArr[i].Calculate_GradeAverage());
//			System.out.println();
//			System.out.println();
//			result=Double.parseDouble(gradeArr[i].Calculate_GradeAverage());
//			sum+=result;
//		}
		for(i=0;i<SIDArr.length;i++) {
			System.out.println(SIDArr[i]+") s_id: "+SIDArr[i]+", Stdent Last Name: "+LNArr[i]+", Student First Name: "+FNArr[i] );
			System.out.println();
			System.out.println("  Assignment 1 : "+Math.round(GradeArr[i][0]));
			System.out.println("  Assignment 2 : "+Math.round(GradeArr[i][1]));
			System.out.println("  Assignment 3 : "+Math.round(GradeArr[i][2]));
			System.out.println("  Mid Term Exam : "+Math.round(GradeArr[i][3]));
			System.out.println("  Final Exam : "+Math.round(GradeArr[i][4]));
			System.out.println();
			System.out.println("  The Average score for this Student is "+gradeArr[i].Calculate_GradeAverage());
			System.out.println();
			System.out.println();
			result=Double.parseDouble(gradeArr[i].Calculate_GradeAverage());
			sum+=result;
			
		}
		
		System.out.println("Number of Students in the file is "+index);
		System.out.println();
		BigDecimal rounded = BigDecimal.valueOf(sum/index).setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("The Average score for all Students is "+rounded);
	}

}
