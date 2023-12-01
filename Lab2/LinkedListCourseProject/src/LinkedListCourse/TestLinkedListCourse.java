package LinkedListCourse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class TestLinkedListCourse {

	public static void main(String[] args) throws FileNotFoundException,NullPointerException{
		Scanner inFile = new Scanner(new FileReader("Course.in"));
		LinkedListNode head=null,newNode,current=null;
		
		
		
		while(inFile.hasNextLine()) {
			
			String courseNo = inFile.next();
			String courseName= inFile.next();
			int credit=inFile.nextInt();
			int maxEnroll=inFile.nextInt();
			Course c=new Course();
			c.setCourse_name(courseName);
			c.setCourse_no(courseNo);
			c.setCredits(credit);
			c.setMax_enrl(maxEnroll);
			
			newNode = new LinkedListNode();
			newNode.courseInfo = c;
			newNode.link=null;
			
			if(head == null) {
				
				head=newNode;
				current = newNode;
				
			}
			else {
				
				current.link=newNode;
				current=current.link;
				
			}
			
			
		}
		current = head;
		System.out.println("Displaying the components of the linked list");
		System.out.println();
		System.out.println();
		
		while(current!=null) {
			
				System.out.println("Course Code: "+current.courseInfo.getCourse_no()+", Course Name: "+current.courseInfo.getCourse_name());
				System.out.println("Credits: "+current.courseInfo.getCredits()+", Max enrolled: "+current.courseInfo.getMax_enrl());
				System.out.println();
				
				current = current.link;
			}	
		System.out.println();
		System.out.print("Enter The course code you are looking for: ");
		
		Scanner course_code=new Scanner(System.in);
		String wcourse=course_code.next();
		Course courseLookfor=new Course();
		courseLookfor.searchCourses(head, wcourse);
		System.out.println(courseLookfor.searchCourses(head, wcourse).courseInfo.toString());
	}

}
