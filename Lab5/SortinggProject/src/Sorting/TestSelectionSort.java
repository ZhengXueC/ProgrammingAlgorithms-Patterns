package Sorting;

public class TestSelectionSort {

	public static void main(String[] args) {
		SelectionSort mySelSort = new SelectionSort();
				mySelSort.a=new int[] {5,2,3,9,1};
				 System.out.println("Before Selection Sort, mySelsort.a");
				for(int index=0;index<mySelSort.a.length;index++) {
					System.out.print(mySelSort.a[index]+" ");
				}
				System.out.println("After Selection Sort, mySelSort.a");
				mySelSort.selectionSort();
				System.out.println();
				for(int index=0;index<mySelSort.a.length;index++) {
					System.out.print(mySelSort.a[index]+" ");
				}
				
	}

}
