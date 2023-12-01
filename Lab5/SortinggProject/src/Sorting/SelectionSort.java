package Sorting;

public class SelectionSort {
	//original array:5 2 3 9 1
	//passes and rounds
	//complete sorting: 1 2 3 5 9
	public int[] a;
	
	//Pass1:look for min 1 and swap it with number(5)1 2 3 5 9
	//Pass1:look for min of unsorted(2395) it with number(5)1 2 3 5 9
	//Pass1:look for min of unsorted(395) it with number(5)1 2 3 5 9
	//Pass1:look for min of unsorted(95) it with number(9)1 2 3 5 9
	
	public void selectionSort() {
		for(int i =0;i<a.length;i++) {
			//search for min
			int min = a[i]; //min=5
			int minId=i;
			for(int j=i+1;j<a.length;j++) {
				if (a[j]<min){
					min = a[j];
					minId=j;//passe 1=minId 4
				}//exit
				int temp=a[i];
				a[i]=min;
				a[minId]=temp;
			}
		}
	}
}
