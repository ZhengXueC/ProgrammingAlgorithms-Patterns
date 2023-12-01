package genericPoint;


public class Point <T> {
	private T x;
	private T y;
	
	public Point(T x, T y) {
		//super();
		this.x = x;
		this.y = y;
	}
	
	public void set (T x,T y) {
		
		this.x=x;
		this.y=y;
		
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//generic method case 1 
	public <T>void printArray(T[] v_array) {
		for(int i=0;i<v_array.length;i++) {
					System.out.println(v_array[i]+" ");
		}
		System.out.println();
	}
	//generic method case 1 
		public <T>void printArray2(T ...v_List) {
			//foreach loop with operator:
			for(T elem:v_List) {
				System.out.println(elem+" ");
			}
			System.out.println();
		}
		public void printArray3(int...v_List) {//pass any number of actual parameters
		
			for(int elem:v_List) {
				System.out.println(elem+" ");
			}
			System.out.println();
		}
}
