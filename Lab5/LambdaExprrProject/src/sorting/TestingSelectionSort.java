package sorting;

import java.util.function.Consumer;

import lambdaExpr.Divide;

public class TestingSelectionSort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 9, 1};
		SelectionSort s=new SelectionSort();
		
        System.out.println("Before Selection Sort, mySelsort.a");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
      

        System.out.println("After Selection Sort, mySelSort.a");
        s.selectionSort(arr);
    }

	

}
