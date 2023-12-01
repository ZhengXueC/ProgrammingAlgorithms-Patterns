package binaryTreeStructure;
//binary search tree
public class BinaryTreeClass {
	//data attributes
	public BinaryTreeNode rootTree;
	
	public BinaryTreeClass() {
		
		rootTree=null;
		
	}
	//concrete methods
	//add an element to the binary search tree
	public void put(int num) {
		//complete this
		BinaryTreeNode newNodeTree=new BinaryTreeNode();
		newNodeTree.info=num;
		newNodeTree.Llink=null;
		newNodeTree.Rlink=null;
		
		BinaryTreeNode currentNode;
		//if  tree is empty
		if(rootTree==null) {
			
			rootTree=newNodeTree;
			currentNode=rootTree;
		}
		else {
			//comparasison
			currentNode=rootTree;
			//Boolean insert = false;//flag to see  if insertion if done
			while(true) {
			if(num<currentNode.info) {
				if(currentNode.Llink==null) {
				//go to left
				currentNode.Llink=newNodeTree;//establish the left link
				break;
				//insert = true;
				}
				
					currentNode =currentNode.Llink;//update the link to go to next left one	
			}
			else {
				//go to right
				
					if(currentNode.Rlink==null) {				
					//go to left
					currentNode.Rlink=newNodeTree;//establish the right link
					//insert = true;
					break;
					}				
						currentNode =currentNode.Rlink;//update the link to go to next right one
											
				}		
		   }
		}	
	}
	public boolean search(int num) {
		
		BinaryTreeNode currentNode; //will allow to traverse tree
		
		currentNode =rootTree;
		
		boolean found = false;//variable found will return T/F
		while(!found && currentNode!=null) { //traverse all the tree until completing the search
		if (num == currentNode.info) {
			
			found = true;
			
		}
		else {
			if(num<currentNode.info){
				
				currentNode = currentNode.Llink;
				
				
			}//traverse the left subtree
			
			else {
				
				currentNode = currentNode.Rlink;//traverse the right subtree			
			}			
		  }
		}		
		return found;	
	}
		
//		boolean found = false;
//		if(rootTree == null)
//			System.out.println("the tree is empty");
//		else {}
//			while(!found &&current !=null) {
//				
//				if(num ==current.info)
//					found = true;
//			
//			}
		

	//print data of binary search tree
	
	public void InOrderTraversal() {
		
		inOrder(rootTree);
			
			
		}
public void preOrderTraversal() {
		
		preOrder(rootTree);
			
			
		}


public void postOrderTraversal() {
	
	postOrder(rootTree);
		
		
	}
	
	public void inOrder(BinaryTreeNode oot) {
		if(oot.Llink!=null) {
			
			inOrder(oot.Llink);
			
		}
		System.out.println("---------"+oot.info+"-------------");
		
		if(oot.Rlink!=null) {
			
			inOrder(oot.Rlink);
		}
		
//		 if (oot != null) {
//	            inOrder(oot.Llink);
//	            System.out.println("---------" + oot.info + "-------------");
//	            inOrder(oot.Rlink);
//	        }
//		
	}	
	public void preOrder(BinaryTreeNode oot) {
		System.out.println("---------"+oot.info+"-------------");
		if(oot.Llink!=null) {
			
			preOrder(oot.Llink);
			
		}
		
		
		if(oot.Rlink!=null) {
			
			preOrder(oot.Rlink);
		}}
		
		public void postOrder(BinaryTreeNode oot) {
			
			if(oot.Llink!=null) {
				
				postOrder(oot.Llink);
				
			}
			
			
			if(oot.Rlink!=null) {
				
				postOrder(oot.Rlink);
			}
			System.out.println("---------"+oot.info+"-------------");
	}
}

