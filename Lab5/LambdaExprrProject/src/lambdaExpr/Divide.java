package lambdaExpr;

public class Divide {
	private double x;
	private double y;
	
	public Divide() {
		
		
	}
	public Divide(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Divide [x=" + x + ", y=" + y + "]";
	}
	
	public double doDivide() {
		
		return x/y;       
	}
	public void CalDivide() {
		
		System.out.println(x/y) ;       
	}
	public double calculateDivision2(){
		
		return (3*x)/(2*y);
	}
    public void calculateDivision(){
		
		System.out.println((3*x)/(2*y));
	}
}
