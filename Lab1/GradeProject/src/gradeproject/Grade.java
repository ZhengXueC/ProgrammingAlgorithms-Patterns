package gradeproject;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Grade {
	private int student_id;
	private String sutdent_fname;
	private String student_lname;
	private double s_grade_Assignment1;
	private double s_grade_Assignment2;
	private double s_grade_Assignment3;
	private double s_grade_Mid_Term;
	private double s_grade_Final_Term;
	public Grade() {
		int student_id=0;
		String sutdent_fname="";
		String student_lname="";
		double s_grade_Assignment1=0;
		double s_grade_Assignment2=0;
		double s_grade_Assignment3=0;
		double s_grade_Mid_Term=0;
		double s_grade_Final_Term=0;
	}
	public Grade(int student_id, String sutdent_fname, String student_lname, double s_grade_Assignment1,
			double s_grade_Assignment2, double s_grade_Assignment3, double s_grade_Mid_Term, double s_grade_Final_Term) {
		super();
		this.student_id = student_id;
		this.sutdent_fname = sutdent_fname;
		this.student_lname = student_lname;
		this.s_grade_Assignment1 = s_grade_Assignment1;
		this.s_grade_Assignment2 = s_grade_Assignment2;
		this.s_grade_Assignment3 = s_grade_Assignment3;
		this.s_grade_Mid_Term = s_grade_Mid_Term;
		this.s_grade_Final_Term = s_grade_Final_Term;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getSutdent_fname() {
		return sutdent_fname;
	}
	public void setSutdent_fname(String sutdent_fname) {
		this.sutdent_fname = sutdent_fname;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	public double getS_grade_Assignment1() {
		return s_grade_Assignment1;
	}
	public void setS_grade_Assignment1(double s_grade_Assignment1) {
		this.s_grade_Assignment1 = s_grade_Assignment1;
	}
	public double getS_grade_Assignment2() {
		return s_grade_Assignment2;
	}
	public void setS_grade_Assignment2(double s_grade_Assignment2) {
		this.s_grade_Assignment2 = s_grade_Assignment2;
	}
	public double getS_grade_Assignment3() {
		return s_grade_Assignment3;
	}
	public void setS_grade_Assignment3(double s_grade_Assignment3) {
		this.s_grade_Assignment3 = s_grade_Assignment3;
	}
	public double getS_grade_Mid_Term() {
		return s_grade_Mid_Term;
	}
	public void setS_grade_Mid_Term(double s_grade_Mid_Term) {
		this.s_grade_Mid_Term = s_grade_Mid_Term;
	}
	public double getS_grade_Final_Term() {
		return s_grade_Final_Term;
	}
	public void setS_grade_Final_Term(double s_grade_Final_Term) {
		this.s_grade_Final_Term = s_grade_Final_Term;
	}
	@Override
	public String toString() {
		return "S Id :" + student_id + "S LName="
				+ student_lname +"S FName :" + sutdent_fname  + "S Ass1: " + s_grade_Assignment1 + "S Ass2: "
				+ s_grade_Assignment2 + "S Ass3: " + s_grade_Assignment3 + "S  MT:"
				+ s_grade_Mid_Term + "S  FT:" + s_grade_Final_Term;
		
	}
	public String Calculate_GradeAverage() {
		
		double CGA=((s_grade_Assignment1+s_grade_Assignment2+s_grade_Assignment3)*0.3333*0.4+s_grade_Mid_Term*0.3+s_grade_Final_Term*0.3);
		BigDecimal roundedCGA = BigDecimal.valueOf(CGA).setScale(2, BigDecimal.ROUND_HALF_UP);
	    return roundedCGA.toString();
	}
	
	
	
}
