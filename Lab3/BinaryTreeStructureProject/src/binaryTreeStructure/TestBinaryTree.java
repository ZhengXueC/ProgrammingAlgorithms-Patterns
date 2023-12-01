package binaryTreeStructure;

import java.util.Scanner;

public class TestBinaryTree {
		public static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		// create binary search tree
		BinaryTreeClass myTree = new BinaryTreeClass();
		
		myTree.put(60);
		myTree.put(50);
		myTree.put(70);
		myTree.put(80);
		myTree.put(40);
		//print
		System.out.println("Printing Inorder Tree Values:");
		myTree.InOrderTraversal();
		//search
		//allow the end
		System.out.println("\nPrinting Preorder Tree Values:");
		myTree.preOrderTraversal();
		
		System.out.println("\nPrinting Postorder Tree Values:");
		myTree.postOrderTraversal();
		
		//search
		//allow the end user to search for number into tree num
		//myTree.search(num)
		System.out.println("Please enter number for search within Binary Tree");
		int num = console.nextInt();
		//Scanner input= new Scanner(System.in);
		if(myTree.search(num))
		System.out.println("value "+num+"  exists in the tree");
		else
			System.out.println("The element does not exist in the tree");	
		
	}

}
