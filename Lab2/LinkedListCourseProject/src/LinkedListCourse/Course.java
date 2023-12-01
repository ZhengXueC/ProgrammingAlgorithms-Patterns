package LinkedListCourse;

public class Course {
	private String course_no;
	private String course_name;
	private int max_enrl;
	public static int credits;
	public Course(){}	
	public Course(String course_no, String course_name, int max_enrl) {
		super();
		this.course_no = course_no;
		this.course_name = course_name;
		this.max_enrl = max_enrl;
	}
	public String getCourse_no() {
		return course_no;
	}
	public void setCourse_no(String course_no) {
		this.course_no = course_no;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getMax_enrl() {
		return max_enrl;
	}
	public void setMax_enrl(int max_enrl) {
		this.max_enrl = max_enrl;
	}
	public static int getCredits() {
		return credits;
	}
	public static void setCredits(int credits) {
		Course.credits = credits;
	}
	@Override
	public String toString() {
		return "Course Code: " + course_no + ", Course Name: " + course_name + ", Credits: "+this.getCredits()+", Max enrolled: " + max_enrl ;
	}
	public LinkedListNode searchCourses(LinkedListNode head, String wcourse_code) {
		LinkedListNode currentNode = head;
		while (currentNode != null) {
            if (currentNode.courseInfo.getCourse_no().equals(wcourse_code)) {
                return currentNode; 
            }
            currentNode = currentNode.link; 
        }
        
        return null; 
	}
}
